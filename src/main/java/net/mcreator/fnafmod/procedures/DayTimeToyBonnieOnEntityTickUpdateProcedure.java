package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.entity.ToyBonnieEntity;
import net.mcreator.fnafmod.entity.DayTimeToyBonnieEntity;

public class DayTimeToyBonnieOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(world instanceof Level _lvl && _lvl.isDay())) {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getPersistentData().getDouble("spawnX")), (entity.getPersistentData().getDouble("spawnY")), (entity.getPersistentData().getDouble("spawnZ")));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("spawnX")), (entity.getPersistentData().getDouble("spawnY")), (entity.getPersistentData().getDouble("spawnZ")), _ent.getYRot(), _ent.getXRot());
			}
			if (entity.getPersistentData().getDouble("FNAFTimer") == 0) {
				if (entity instanceof DayTimeToyBonnieEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ToyBonnieEntity(FnafModModEntities.TOY_BONNIE.get(), _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("FNAFTimer") == 0) {
			entity.getPersistentData().putDouble("FNAFTimer", 20);
		} else {
			entity.getPersistentData().putDouble("FNAFTimer", (entity.getPersistentData().getDouble("FNAFTimer") - 1));
		}
	}
}
