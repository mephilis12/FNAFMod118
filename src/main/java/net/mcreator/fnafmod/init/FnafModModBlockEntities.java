
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.fnafmod.block.entity.RemantInfuserBlockEntity;
import net.mcreator.fnafmod.block.entity.LocketBottomBlockEntity;
import net.mcreator.fnafmod.block.entity.LockerTopBlockEntity;
import net.mcreator.fnafmod.block.entity.DeskBlockEntity;
import net.mcreator.fnafmod.block.entity.Desk3BlockEntity;
import net.mcreator.fnafmod.block.entity.Desk2BlockEntity;
import net.mcreator.fnafmod.FnafModMod;

public class FnafModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, FnafModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DESK = register("desk", FnafModModBlocks.DESK, DeskBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESK_2 = register("desk_2", FnafModModBlocks.DESK_2, Desk2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESK_3 = register("desk_3", FnafModModBlocks.DESK_3, Desk3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LOCKET_BOTTOM = register("locket_bottom", FnafModModBlocks.LOCKET_BOTTOM,
			LocketBottomBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REMNANT_INFUSER = register("remnant_infuser", FnafModModBlocks.REMNANT_INFUSER,
			RemantInfuserBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LOCKER_TOP = register("locker_top", FnafModModBlocks.LOCKER_TOP,
			LockerTopBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
