
package net.mcreator.fnafmod.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

public class UnwitheredFoxyCutoutEntity extends PathfinderMob {

	public UnwitheredFoxyCutoutEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(FnafModModEntities.UNWITHERED_FOXY_CUTOUT.get(), world);
	}

	public UnwitheredFoxyCutoutEntity(EntityType<UnwitheredFoxyCutoutEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(true);

		setPersistenceRequired();

		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (UnwitheredFoxyCutoutEntity.this.isInWater())
					UnwitheredFoxyCutoutEntity.this.setDeltaMovement(UnwitheredFoxyCutoutEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !UnwitheredFoxyCutoutEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - UnwitheredFoxyCutoutEntity.this.getX();
					double dy = this.wantedY - UnwitheredFoxyCutoutEntity.this.getY();
					double dz = this.wantedZ - UnwitheredFoxyCutoutEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * UnwitheredFoxyCutoutEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					UnwitheredFoxyCutoutEntity.this.setYRot(this.rotlerp(UnwitheredFoxyCutoutEntity.this.getYRot(), f, 10));
					UnwitheredFoxyCutoutEntity.this.yBodyRot = UnwitheredFoxyCutoutEntity.this.getYRot();
					UnwitheredFoxyCutoutEntity.this.yHeadRot = UnwitheredFoxyCutoutEntity.this.getYRot();

					if (UnwitheredFoxyCutoutEntity.this.isInWater()) {
						UnwitheredFoxyCutoutEntity.this
								.setSpeed((float) UnwitheredFoxyCutoutEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						UnwitheredFoxyCutoutEntity.this.setXRot(this.rotlerp(UnwitheredFoxyCutoutEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(UnwitheredFoxyCutoutEntity.this.getXRot() * (float) (Math.PI / 180.0));

						UnwitheredFoxyCutoutEntity.this.setZza(f3 * f1);
						UnwitheredFoxyCutoutEntity.this.setYya((float) (f1 * dy));
					} else {
						UnwitheredFoxyCutoutEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					UnwitheredFoxyCutoutEntity.this.setSpeed(0);
					UnwitheredFoxyCutoutEntity.this.setYya(0);
					UnwitheredFoxyCutoutEntity.this.setZza(0);
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
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.azalea.break")), 0.15f, 1);
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
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason,
			@Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
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

		StatueFreddyRightClickedOnEntityProcedure.execute(entity);
		return retval;
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
		builder = builder.add(Attributes.MAX_HEALTH, 1);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2);

		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0);

		return builder;
	}

}
