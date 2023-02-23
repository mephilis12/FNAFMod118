
package net.mcreator.fnafmod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.procedures.ToyFoxyOnInitialEntitySpawnProcedure;
import net.mcreator.fnafmod.procedures.ToyFoxyOnEntityTickUpdateProcedure;
import net.mcreator.fnafmod.procedures.ToyFoxyEntityDiesProcedure;
import net.mcreator.fnafmod.procedures.MaskProtectionTestForTickProcedure;
import net.mcreator.fnafmod.procedures.FreddyFazbearOnEntityTickUpdateProcedure;
import net.mcreator.fnafmod.procedures.FoxyPiratePlayerCollidesWithThisEntityProcedure;
import net.mcreator.fnafmod.init.FnafModModEntities;

import javax.annotation.Nullable;

public class ToyFoxyEntity extends Monster {
	public ToyFoxyEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(FnafModModEntities.TOY_FOXY.get(), world);
	}

	public ToyFoxyEntity(EntityType<ToyFoxyEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new RandomStrollGoal(this, 0.8) {
			@Override
			public boolean canUse() {
				double x = ToyFoxyEntity.this.getX();
				double y = ToyFoxyEntity.this.getY();
				double z = ToyFoxyEntity.this.getZ();
				Entity entity = ToyFoxyEntity.this;
				Level world = ToyFoxyEntity.this.level;
				return super.canUse() && FreddyFazbearOnEntityTickUpdateProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(2, new RandomLookAroundGoal(this) {
			@Override
			public boolean canUse() {
				double x = ToyFoxyEntity.this.getX();
				double y = ToyFoxyEntity.this.getY();
				double z = ToyFoxyEntity.this.getZ();
				Entity entity = ToyFoxyEntity.this;
				Level world = ToyFoxyEntity.this.level;
				return super.canUse() && FreddyFazbearOnEntityTickUpdateProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 0.8) {
			@Override
			public boolean canUse() {
				double x = ToyFoxyEntity.this.getX();
				double y = ToyFoxyEntity.this.getY();
				double z = ToyFoxyEntity.this.getZ();
				Entity entity = ToyFoxyEntity.this;
				Level world = ToyFoxyEntity.this.level;
				return super.canUse() && FreddyFazbearOnEntityTickUpdateProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.6, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

			@Override
			public boolean canUse() {
				double x = ToyFoxyEntity.this.getX();
				double y = ToyFoxyEntity.this.getY();
				double z = ToyFoxyEntity.this.getZ();
				Entity entity = ToyFoxyEntity.this;
				Level world = ToyFoxyEntity.this.level;
				return super.canUse() && MaskProtectionTestForTickProcedure.execute(world, x, y, z);
			}

		});
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, true, true) {
			@Override
			public boolean canUse() {
				double x = ToyFoxyEntity.this.getX();
				double y = ToyFoxyEntity.this.getY();
				double z = ToyFoxyEntity.this.getZ();
				Entity entity = ToyFoxyEntity.this;
				Level world = ToyFoxyEntity.this.level;
				return super.canUse() && MaskProtectionTestForTickProcedure.execute(world, x, y, z);
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:animatronic_step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.hit"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.destroy"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		if (source.getMsgId().equals("trident"))
			return false;
		if (source == DamageSource.ANVIL)
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		ToyFoxyEntityDiesProcedure.execute(this.level, this);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		ToyFoxyOnInitialEntitySpawnProcedure.execute(world, this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		ToyFoxyOnEntityTickUpdateProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public void playerTouch(Player sourceentity) {
		super.playerTouch(sourceentity);
		FoxyPiratePlayerCollidesWithThisEntityProcedure.execute(sourceentity);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.30000000000000004);
		builder = builder.add(Attributes.MAX_HEALTH, 50);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 20);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2);
		return builder;
	}
}
