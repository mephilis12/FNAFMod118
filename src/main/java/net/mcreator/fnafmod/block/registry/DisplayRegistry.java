package net.mcreator.fnafmod.block.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.block.display.TrashCanDisplayItem;
import net.mcreator.fnafmod.block.display.MeshTrashCanDisplayItem;
import net.mcreator.fnafmod.FnafModMod;

public class DisplayRegistry {
	public static final DeferredRegister<Item> DISPLAY = DeferredRegister.create(ForgeRegistries.ITEMS, FnafModMod.MODID);
	public static final RegistryObject<Item> MESH_TRASH_CAN_ITEM = DISPLAY.register("mesh_trash_can_item", () -> new MeshTrashCanDisplayItem(FnafModModBlocks.MESH_TRASH_CAN.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> TRASH_CAN_ITEM = DISPLAY.register("trash_can_item", () -> new TrashCanDisplayItem(FnafModModBlocks.TRASH_CAN.get(), new Item.Properties().tab(null)));
}
