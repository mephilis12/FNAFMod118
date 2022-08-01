
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
import net.minecraft.world.entity.EquipmentSlot;
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

import net.mcreator.fnafmod.procedures.StatueFreddyRightClickedOnEntityProcedure;
import net.mcreator.fnafmod.procedures.DedwitheredfreddyOnInitialEntitySpawnProcedure;
import net.mcreator.fnafmod.procedures.DedwitheredfreddyOnEntityTickUpdateProcedure;
import net.mcreator.fnafmod.procedures.DedwitheredfreddyEntityDiesProcedure;
import net.mcreator.fnafmod.init.FnafModModItems;
import net.mcreator.fnafmod.init.FnafModModEntities;

import javax.annotation.Nullable;

public class DedwitheredfreddyEntity extends PathfinderMob {
	public DedwitheredfreddyEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(FnafModModEntities.DEDWITHEREDFREDDY.get(), world);
	}

	public DedwitheredfreddyEntity(EntityType<DedwitheredfreddyEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(true);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(FnafModModItems.MICROPHONE.get()));
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (DedwitheredfreddyEntity.this.isInWater())
					DedwitheredfreddyEntity.this.setDeltaMovement(DedwitheredfreddyEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !DedwitheredfreddyEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - DedwitheredfreddyEntity.this.getX();
					double dy = this.wantedY - DedwitheredfreddyEntity.this.getY();
					double dz = this.wantedZ - DedwitheredfreddyEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * DedwitheredfreddyEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					DedwitheredfreddyEntity.this.setYRot(this.rotlerp(DedwitheredfreddyEntity.this.getYRot(), f, 10));
					DedwitheredfreddyEntity.this.yBodyRot = DedwitheredfreddyEntity.this.getYRot();
					DedwitheredfreddyEntity.this.yHeadRot = DedwitheredfreddyEntity.this.getYRot();
					if (DedwitheredfreddyEntity.this.isInWater()) {
						DedwitheredfreddyEntity.this
								.setSpeed((float) DedwitheredfreddyEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						DedwitheredfreddyEntity.this.setXRot(this.rotlerp(DedwitheredfreddyEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(DedwitheredfreddyEntity.this.getXRot() * (float) (Math.PI / 180.0));
						DedwitheredfreddyEntity.this.setZza(f3 * f1);
						DedwitheredfreddyEntity.this.setYya((float) (f1 * dy));
					} else {
						DedwitheredfreddyEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					DedwitheredfreddyEntity.this.setSpeed(0);
					DedwitheredfreddyEntity.this.setYya(0);
					DedwitheredfreddyEntity.this.setZza(0);
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
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.destroy"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		DedwitheredfreddyEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason,
			@Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		DedwitheredfreddyOnInitialEntitySpawnProcedure.execute(world, this);
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

		StatueFreddyRightClickedOnEntityProcedure.execute(entity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		DedwitheredfreddyOnEntityTickUpdateProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 50);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0);
		return builder;
	}
}
