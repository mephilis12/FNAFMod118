
package net.mcreator.fnafmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
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
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.fnafmod.init.FnafModModBlocks;

import java.util.List;
import java.util.Collections;

public class FoxyHeadDecorationBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public FoxyHeadDecorationBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.LANTERN).strength(2f, 10f).lightLevel(s -> 12).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
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
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		switch ((Direction) state.getValue(FACING)) {
			case SOUTH :
			default :
				return box(3.5, 0, 0, 13.5, 15, 11).move(offset.x, offset.y, offset.z);
			case NORTH :
				return box(2.5, 0, 5, 12.5, 15, 16).move(offset.x, offset.y, offset.z);
			case EAST :
				return box(0, 0, 2.5, 11, 15, 12.5).move(offset.x, offset.y, offset.z);
			case WEST :
				return box(5, 0, 3.5, 16, 15, 13.5).move(offset.x, offset.y, offset.z);
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		;
		if (context.getClickedFace() == Direction.UP || context.getClickedFace() == Direction.DOWN)
			return this.defaultBlockState().setValue(FACING, Direction.NORTH);
		return this.defaultBlockState().setValue(FACING, context.getClickedFace());
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(FnafModModBlocks.FOXY_HEAD_DECORATION.get(), renderType -> renderType == RenderType.cutout());
	}
}
