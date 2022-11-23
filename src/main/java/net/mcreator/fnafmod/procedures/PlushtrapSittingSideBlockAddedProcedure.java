package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;

import java.util.Map;

public class PlushtrapSittingSideBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.AIR)) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafModModBlocks.PLUSHTRAP_SITTING_ON_TOP.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
