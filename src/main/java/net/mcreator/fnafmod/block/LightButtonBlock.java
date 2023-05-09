
package net.mcreator.fnafmod.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;

import java.util.List;
import java.util.Collections;
import net.minecraft.world.level.block.LeverBlock;

public class LightButtonBlock extends LeverBlock {
	public LightButtonBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.LANTERN).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> switch (state.getValue(FACE)) {
				case FLOOR -> box(4, 0, 0, 12, 5, 9);
				case WALL -> box(4, 7, 0, 12, 16, 5);
				case CEILING -> box(4, 11, 0, 12, 16, 9);
			};
			case NORTH -> switch (state.getValue(FACE)) {
				case FLOOR -> box(4, 0, 7, 12, 5, 16);
				case WALL -> box(4, 7, 11, 12, 16, 16);
				case CEILING -> box(4, 11, 7, 12, 16, 16);
			};
			case EAST -> switch (state.getValue(FACE)) {
				case FLOOR -> box(0, 0, 4, 9, 5, 12);
				case WALL -> box(0, 7, 4, 5, 16, 12);
				case CEILING -> box(0, 11, 4, 9, 16, 12);
			};
			case WEST -> switch (state.getValue(FACE)) {
				case FLOOR -> box(7, 0, 4, 16, 5, 12);
				case WALL -> box(11, 7, 4, 16, 16, 12);
				case CEILING -> box(7, 11, 4, 16, 16, 12);
			};
		};
	}

    
	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
	
}
