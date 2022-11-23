package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;

public class LightWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x, y, z), FnafModModBlocks.FLASH_LIGHT_LIGHT.get().defaultBlockState(), 3);
		}
	}
}
