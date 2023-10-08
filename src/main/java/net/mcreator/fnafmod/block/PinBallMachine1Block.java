
package net.mcreator.fnafmod.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class PinBallMachine1Block extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public PinBallMachine1Block() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1.6f, 15f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(12.5, 7, 6, 13.5, 14, 20), box(2.5, 7, 6, 3.5, 14, 20), box(2.5, 7, 0, 13.5, 14, 6), box(3.5, 7, 6, 12.5, 11, 20), box(2.5, 7, 20, 13.5, 14, 22), box(13.5, 11, 19, 14.5, 13, 21), box(1.5, 11, 19, 2.5, 13, 21),
					box(1.5, 14, 0, 14.5, 25, 5), box(1.3, 13.8, -0.2, 14.7, 25.2, 5.2), box(12, 0, 20.5, 14, 8, 22.5), box(2, 0, 20.5, 4, 8, 22.5), box(2, 0, -0.5, 4, 8, 1.5), box(12, 0, -0.5, 14, 8, 1.5));
			case NORTH -> Shapes.or(box(2.5, 7, -4, 3.5, 14, 10), box(12.5, 7, -4, 13.5, 14, 10), box(2.5, 7, 10, 13.5, 14, 16), box(3.5, 7, -4, 12.5, 11, 10), box(2.5, 7, -6, 13.5, 14, -4), box(1.5, 11, -5, 2.5, 13, -3),
					box(13.5, 11, -5, 14.5, 13, -3), box(1.5, 14, 11, 14.5, 25, 16), box(1.3, 13.8, 10.8, 14.7, 25.2, 16.2), box(2, 0, -6.5, 4, 8, -4.5), box(12, 0, -6.5, 14, 8, -4.5), box(12, 0, 14.5, 14, 8, 16.5), box(2, 0, 14.5, 4, 8, 16.5));
			case EAST -> Shapes.or(box(6, 7, 2.5, 20, 14, 3.5), box(6, 7, 12.5, 20, 14, 13.5), box(0, 7, 2.5, 6, 14, 13.5), box(6, 7, 3.5, 20, 11, 12.5), box(20, 7, 2.5, 22, 14, 13.5), box(19, 11, 1.5, 21, 13, 2.5), box(19, 11, 13.5, 21, 13, 14.5),
					box(0, 14, 1.5, 5, 25, 14.5), box(-0.2, 13.8, 1.3, 5.2, 25.2, 14.7), box(20.5, 0, 2, 22.5, 8, 4), box(20.5, 0, 12, 22.5, 8, 14), box(-0.5, 0, 12, 1.5, 8, 14), box(-0.5, 0, 2, 1.5, 8, 4));
			case WEST -> Shapes.or(box(-4, 7, 12.5, 10, 14, 13.5), box(-4, 7, 2.5, 10, 14, 3.5), box(10, 7, 2.5, 16, 14, 13.5), box(-4, 7, 3.5, 10, 11, 12.5), box(-6, 7, 2.5, -4, 14, 13.5), box(-5, 11, 13.5, -3, 13, 14.5),
					box(-5, 11, 1.5, -3, 13, 2.5), box(11, 14, 1.5, 16, 25, 14.5), box(10.8, 13.8, 1.3, 16.2, 25.2, 14.7), box(-6.5, 0, 12, -4.5, 8, 14), box(-6.5, 0, 2, -4.5, 8, 4), box(14.5, 0, 2, 16.5, 8, 4), box(14.5, 0, 12, 16.5, 8, 14));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
