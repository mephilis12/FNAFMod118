package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;

import java.util.Map;

public class ConnectBallsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Direction direct = Direction.NORTH;
		double state = 0;
		direct = Direction.NORTH;
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) && (world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))
				&& (world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) && (world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
			state = 5;
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) && (world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
			if (!((world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) || (world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))))) {
				direct = Direction.NORTH;
				state = 4;
			} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
				direct = Direction.NORTH;
				state = 6;
			} else {
				direct = Direction.SOUTH;
				state = 6;
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) && (world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
			if (!(world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) && !(world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
				direct = Direction.EAST;
				state = 4;
			} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
				direct = Direction.WEST;
				state = 6;
			} else {
				direct = Direction.EAST;
				state = 6;
			}
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) && (world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) && (world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) && (world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) && (world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) && (world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
				direct = Direction.NORTH;
			} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) && (world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
				direct = Direction.WEST;
			} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) && (world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
				direct = Direction.EAST;
			} else {
				direct = Direction.SOUTH;
			}
			state = 3;
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) || (world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit"))) || (world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
				direct = Direction.WEST;
			} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
				direct = Direction.EAST;
			} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("fnaf_mod:pit")))) {
				direct = Direction.NORTH;
			} else {
				direct = Direction.SOUTH;
			}
			state = 2;
		}
		if (state == 5) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafModModBlocks.BP_5.get().defaultBlockState();
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
		} else if (state == 4) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafModModBlocks.BP_4.get().defaultBlockState();
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
		} else if (state == 6) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafModModBlocks.BP_6.get().defaultBlockState();
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
		} else if (state == 3) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafModModBlocks.BP_3.get().defaultBlockState();
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
		} else if (state == 2) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafModModBlocks.BP_2.get().defaultBlockState();
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
		} else {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafModModBlocks.BP_1.get().defaultBlockState();
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
		{
			Direction _dir = direct;
			BlockPos _pos = new BlockPos(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
			if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
				world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
			} else {
				_property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
					world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
			}
		}
	}
}
