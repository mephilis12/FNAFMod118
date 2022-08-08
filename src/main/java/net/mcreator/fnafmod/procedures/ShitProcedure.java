package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;

import java.util.Random;

public class ShitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Random = 0;
		double Random2 = 0;
		world.setBlock(new BlockPos(x, y, z), FnafModModBlocks.SHACK_RANDOMIZER.get().defaultBlockState(), 3);
	}
}
