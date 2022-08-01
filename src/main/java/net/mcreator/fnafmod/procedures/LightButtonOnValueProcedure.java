package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class LightButtonOnValueProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos(x, y, z), _level.getBlockState(new BlockPos(x, y, z)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos(x + 1, y, z), _level.getBlockState(new BlockPos(x + 1, y, z)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos(x, y + 1, z), _level.getBlockState(new BlockPos(x, y + 1, z)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos(x, y, z + 1), _level.getBlockState(new BlockPos(x, y, z + 1)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos(x - 1, y, z), _level.getBlockState(new BlockPos(x - 1, y, z)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos(x, y - 1, z), _level.getBlockState(new BlockPos(x, y - 1, z)).getBlock());
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos(x, y, z - 1), _level.getBlockState(new BlockPos(x, y, z - 1)).getBlock());
	}
}
