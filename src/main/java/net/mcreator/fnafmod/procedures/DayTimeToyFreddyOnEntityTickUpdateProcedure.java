package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.entity.ToyFreddyEntity;

public class DayTimeToyFreddyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getString("GotCoordinates2")).equals("true")) {
			entity.getPersistentData().putDouble("spawnX2", (entity.getX()));
			entity.getPersistentData().putDouble("spawnY2", (entity.getY()));
			entity.getPersistentData().putDouble("spawnZ2", (entity.getZ()));
			entity.getPersistentData().putDouble("spawnYaw2", (entity.getYRot()));
			entity.getPersistentData().putString("GotCoordinates2", "true");
		}
		if (!(world instanceof Level _lvl10 && _lvl10.isDay())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ToyFreddyEntity(FnafModModEntities.TOY_FREDDY.get(), _level);
				entityToSpawn.moveTo((entity.getPersistentData().getDouble("spawnX2")), (entity.getPersistentData().getDouble("spawnY2")), (entity.getPersistentData().getDouble("spawnZ2")), (float) entity.getPersistentData().getDouble("spawnYaw2"),
						0);
				entityToSpawn.setYBodyRot((float) entity.getPersistentData().getDouble("spawnYaw2"));
				entityToSpawn.setYHeadRot((float) entity.getPersistentData().getDouble("spawnYaw2"));
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
