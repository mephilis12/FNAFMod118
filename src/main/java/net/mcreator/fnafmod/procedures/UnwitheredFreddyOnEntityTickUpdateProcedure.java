package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class UnwitheredFreddyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getString("GotCoordinates")).equals("true")) {
			entity.getPersistentData().putDouble("spawnX", (entity.getX()));
			entity.getPersistentData().putDouble("spawnY", (entity.getY()));
			entity.getPersistentData().putDouble("spawnZ", (entity.getZ()));
			entity.getPersistentData().putDouble("spawnYaw", (entity.getYRot()));
			entity.getPersistentData().putString("GotCoordinates", "true");
		}
		if (world instanceof Level _lvl10 && _lvl10.isDay()) {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getPersistentData().getDouble("spawnX")), (entity.getPersistentData().getDouble("spawnY")), (entity.getPersistentData().getDouble("spawnZ")));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("spawnX")), (entity.getPersistentData().getDouble("spawnY")), (entity.getPersistentData().getDouble("spawnZ")), _ent.getYRot(), _ent.getXRot());
			}
			{
				Entity _ent = entity;
				_ent.setYRot((float) entity.getPersistentData().getDouble("spawnYaw"));
				_ent.setXRot(0);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		}
	}
}
