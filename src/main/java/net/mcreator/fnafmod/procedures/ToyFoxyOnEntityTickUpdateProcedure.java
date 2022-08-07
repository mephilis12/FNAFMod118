package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.entity.ToyFoxyEntity;
import net.mcreator.fnafmod.entity.CrawlingToyFoxyEntity;

public class ToyFoxyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _lvl && _lvl.isDay()) {
			if (entity instanceof ToyFoxyEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
		if ((world.getBlockState(new BlockPos(x, entity.getY() - 1, z))).getBlock() == FnafModModBlocks.VENT.get()) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new CrawlingToyFoxyEntity(FnafModModEntities.CRAWLING_TOY_FOXY.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
