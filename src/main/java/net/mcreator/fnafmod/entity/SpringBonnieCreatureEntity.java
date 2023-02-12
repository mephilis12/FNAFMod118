
package net.mcreator.fnafmod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
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

import net.mcreator.fnafmod.procedures.StatueSpawnProcedure;
import net.mcreator.fnafmod.procedures.StatueFreddyRightClickedOnEntityProcedure;
import net.mcreator.fnafmod.init.FnafModModEntities;

import javax.annotation.Nullable;

public class SpringBonnieCreatureEntity extends Monster {
	public SpringBonnieCreatureEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(FnafModModEntities.SPRING_BONNIE_CREATURE.get(), world);
	}

	public SpringBonnieCreatureEntity(EntityType<SpringBonnieCreatureEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(true);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (SpringBonnieCreatureEntity.this.isInWater())
					SpringBonnieCreatureEntity.this.setDeltaMovement(SpringBonnieCreatureEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !SpringBonnieCreatureEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - SpringBonnieCreatureEntity.this.getX();
					double dy = this.wantedY - SpringBonnieCreatureEntity.this.getY();
					double dz = this.wantedZ - SpringBonnieCreatureEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * SpringBonnieCreatureEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					SpringBonnieCreatureEntity.this.setYRot(this.rotlerp(SpringBonnieCreatureEntity.this.getYRot(), f, 10));
					SpringBonnieCreatureEntity.this.yBodyRot = SpringBonnieCreatureEntity.this.getYRot();
					SpringBonnieCreatureEntity.this.yHeadRot = SpringBonnieCreatureEntity.this.getYRot();
					if (SpringBonnieCreatureEntity.this.isInWater()) {
						SpringBonnieCreatureEntity.this.setSpeed((float) SpringBonnieCreatureEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						SpringBonnieCreatureEntity.this.setXRot(this.rotlerp(SpringBonnieCreatureEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(SpringBonnieCreatureEntity.this.getXRot() * (float) (Math.PI / 180.0));
						SpringBonnieCreatureEntity.this.setZza(f3 * f1);
						SpringBonnieCreatureEntity.this.setYya((float) (f1 * dy));
					} else {
						SpringBonnieCreatureEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					SpringBonnieCreatureEntity.this.setSpeed(0);
					SpringBonnieCreatureEntity.this.setYya(0);
					SpringBonnieCreatureEntity.this.setZza(0);
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
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.break"));
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
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0);
		return builder;
	}
}
