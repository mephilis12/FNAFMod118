package net.mcreator.fnafmod.entity.spawneggs;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.fnafmod.init.FnafModModTabs;
import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.FnafModMod;

public class GeckoLibSpawnEggs {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FnafModMod.MODID);

	public static final RegistryObject<Item> CRYING_CHILD = REGISTRY.register("crying_child_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.CRYING_CHILD, -1, -3355444, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> WITHERED_FREDDY = REGISTRY.register("withered_freddy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.WITHERED_FREDDY, -10994921, -5737400, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> DED_WITHERED_FREDDY = REGISTRY.register("ded_withered_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.DED_WITHERED_FREDDY, -10994921, -5737400, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> UNWITHERED_FREDDY = REGISTRY.register("unwithered_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.UNWITHERED_FREDDY, -10994921, -5737400, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> WITHERED_GOLDEN_FREDDY = REGISTRY.register("withered_golden_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.WITHERED_GOLDEN_FREDDY, -6328817, -6127097, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
}
