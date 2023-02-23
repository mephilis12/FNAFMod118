package net.mcreator.fnafmod.block.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.block.entity.TrashCanTileEntity;
import net.mcreator.fnafmod.block.entity.MeshTrashCanTileEntity;
import net.mcreator.fnafmod.FnafModMod;

public class TileRegistry {
	public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FnafModMod.MODID);
	public static final RegistryObject<BlockEntityType<MeshTrashCanTileEntity>> MESH_TRASH_CAN = TILES.register("mesh_trash_can_block", () -> BlockEntityType.Builder.of(MeshTrashCanTileEntity::new, FnafModModBlocks.MESH_TRASH_CAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashCanTileEntity>> TRASH_CAN = TILES.register("trash_can_block", () -> BlockEntityType.Builder.of(TrashCanTileEntity::new, FnafModModBlocks.TRASH_CAN.get()).build(null));
}
