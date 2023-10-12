package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class FreddyFazbearOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("spawnX", (entity.getX()));
		entity.getPersistentData().putDouble("spawnY", (entity.getY()));
		entity.getPersistentData().putDouble("spawnZ", (entity.getZ()));
		entity.getPersistentData().putDouble("spawnYaw", (entity.getYRot()));
	}
}
