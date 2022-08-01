package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.entity.PhantomPuppetEntity;
import net.mcreator.fnafmod.entity.PhantomMangleEntity;
import net.mcreator.fnafmod.entity.PhantomFreddyEntity;
import net.mcreator.fnafmod.entity.PhantomFoxyEntity;
import net.mcreator.fnafmod.entity.PhantomChicaEntity;
import net.mcreator.fnafmod.entity.PhantomBBEntity;

import java.util.Random;

public class SpringtrapEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Random = 0;
		double Random2 = 0;
		double Random3 = 0;
		Random = Mth.nextInt(new Random(), 1, 7);
		Random2 = Mth.nextInt(new Random(), 1, 4);
		Random3 = Mth.nextInt(new Random(), 1, 3);
		if (Random3 == 2) {
			if (Random == 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new PhantomFreddyEntity(FnafModModEntities.PHANTOM_FREDDY.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (Random == 2) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new PhantomChicaEntity(FnafModModEntities.PHANTOM_CHICA.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (Random == 3) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new PhantomFoxyEntity(FnafModModEntities.PHANTOM_FOXY.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (Random == 4) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new PhantomBBEntity(FnafModModEntities.PHANTOM_BB.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (Random == 5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new PhantomMangleEntity(FnafModModEntities.PHANTOM_MANGLE.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (Random == 6) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new PhantomPuppetEntity(FnafModModEntities.PHANTOM_PUPPET.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (Random == 7) {
				if (Random2 == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new Phantom(EntityType.PHANTOM, _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
