package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;

public class PlushtrapOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean Bright = false;
		boolean DayBright = false;
		Bright = false;
		if (10 <= world.getMaxLocalRawBrightness(new BlockPos(x, y, z))) {
			Bright = true;
		}
		if (Bright == true && !(world instanceof Level _lvl && _lvl.isDay())) {
			if (!entity.level.isClientSide())
				entity.discard();
			world.setBlock(new BlockPos(x, y, z), FnafModModBlocks.PLUSHTRAP_SITTING_SIDE.get().defaultBlockState(), 3);
		} else if (world instanceof Level _lvl && _lvl.isDay()) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FnafModModBlocks.PLUSHTRAP_SITTING_SIDE.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
