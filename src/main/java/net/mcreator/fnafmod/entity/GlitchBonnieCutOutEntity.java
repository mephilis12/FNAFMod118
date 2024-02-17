
package net.mcreator.fnafmod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.procedures.StatueSpawnProcedure;
import net.mcreator.fnafmod.procedures.StatueFreddyRightClickedOnEntityProcedure;
import net.mcreator.fnafmod.init.FnafModModEntities;

import javax.annotation.Nullable;

public class GlitchBonnieCutOutEntity extends PathfinderMob {
	public GlitchBonnieCutOutEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(FnafModModEntities.GLITCH_BONNIE_CUT_OUT.get(), world);
	}

	public GlitchBonnieCutOutEntity(EntityType<GlitchBonnieCutOutEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 0;
		setNoAi(true);
		setPersistenceRequired();
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (GlitchBonnieCutOutEntity.this.isInWater())
					GlitchBonnieCutOutEntity.this.setDeltaMovement(GlitchBonnieCutOutEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !GlitchBonnieCutOutEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - GlitchBonnieCutOutEntity.this.getX();
					double dy = this.wantedY - GlitchBonnieCutOutEntity.this.getY();
					double dz = this.wantedZ - GlitchBonnieCutOutEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * GlitchBonnieCutOutEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					GlitchBonnieCutOutEntity.this.setYRot(this.rotlerp(GlitchBonnieCutOutEntity.this.getYRot(), f, 10));
					GlitchBonnieCutOutEntity.this.yBodyRot = GlitchBonnieCutOutEntity.this.getYRot();
					GlitchBonnieCutOutEntity.this.yHeadRot = GlitchBonnieCutOutEntity.this.getYRot();
					if (GlitchBonnieCutOutEntity.this.isInWater()) {
						GlitchBonnieCutOutEntity.this.setSpeed((float) GlitchBonnieCutOutEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						GlitchBonnieCutOutEntity.this.setXRot(this.rotlerp(GlitchBonnieCutOutEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(GlitchBonnieCutOutEntity.this.getXRot() * (float) (Math.PI / 180.0));
						GlitchBonnieCutOutEntity.this.setZza(f3 * f1);
						GlitchBonnieCutOutEntity.this.setYya((float) (f1 * dy));
					} else {
						GlitchBonnieCutOutEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					GlitchBonnieCutOutEntity.this.setSpeed(0);
					GlitchBonnieCutOutEntity.this.setYya(0);
					GlitchBonnieCutOutEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
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
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.azalea.break"));
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		StatueSpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		super.mobInteract(sourceentity, hand);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		StatueFreddyRightClickedOnEntityProcedure.execute(entity, sourceentity);
		return retval;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean canBreatheUnderwater() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity entity = this;
		return true;
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 1);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0);
		return builder;
	}
}
