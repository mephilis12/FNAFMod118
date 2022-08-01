package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;

public class ToyFreddySpawnBlockIdleUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world instanceof Level _lvl && _lvl.isDay())) {
			world.setBlock(new BlockPos(x, y, z), FnafModModBlocks.TOY_FREDDY_SPAWN_BLOCK.get().defaultBlockState(), 3);
		}
	}
}
