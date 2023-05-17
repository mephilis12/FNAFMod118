package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class NightmareOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rand = 0;
		double rand2 = 0;
		double rand3 = 0;
		rand = Mth.nextInt(RandomSource.create(), 1, 300);
		rand2 = Mth.nextInt(RandomSource.create(), 1, 8);
		if (world instanceof Level _lvl && _lvl.isDay()) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else {
			if (rand == 100) {
				if (rand2 == 1) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 2) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 3) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 4) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 5) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 6) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 7) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 8) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
		}
		if (entity.isInWall()) {
			if (rand == 100) {
				if (rand2 == 1) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 2) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 3) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 4) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 5) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 6) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 7) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 8) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
		}
		if (!world.isEmptyBlock(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))) {
			if (rand == 100) {
				if (rand2 == 1) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 2) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, z, _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 3) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 4) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 5) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 6) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 7) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + Mth.nextInt(RandomSource.create(), 1, 5)), y, (z - Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				} else if (rand2 == 8) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x - Mth.nextInt(RandomSource.create(), 1, 5)), y, (z + Mth.nextInt(RandomSource.create(), 1, 5)), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
		}
		rand3 = Mth.nextInt(RandomSource.create(), 1, 300);
		if (world instanceof Level _lvl && _lvl.isDay()) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else {
			if (69 == rand3) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 200, 1, (false), (false)));
			}
		}
	}
}
