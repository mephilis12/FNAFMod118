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

	public static final RegistryObject<Item> DED_WITHERED_FREDDY = REGISTRY.register("ded_withered_freddy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.DED_WITHERED_FREDDY, -10994921, -5737400, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PHANTOM_FREDDY = REGISTRY.register("phantom_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.PHANTOM_FREDDY, -12893424, -14539005, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> CRYING_CHILD = REGISTRY.register("crying_child_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.CRYING_CHILD, -1, -3355444, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> WITHERED_FREDDY = REGISTRY.register("withered_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.WITHERED_FREDDY, -10994921, -5737400, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> UNWITHERED_FREDDY = REGISTRY.register("unwithered_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.UNWITHERED_FREDDY, -10994921, -5737400, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> WITHERED_GOLDEN_FREDDY = REGISTRY.register("withered_golden_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.WITHERED_GOLDEN_FREDDY, -6328817, -6127097, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> PHANTOM_FOXY = REGISTRY.register("phantom_foxy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.PHANTOM_FOXY, -13233395, -12181729, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> WITHERED_FOXY = REGISTRY.register("withered_foxy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.WITHERED_FOXY, -9625322, -4762045, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> DAY_TIME_WITHERED_FOXY = REGISTRY.register("day_time_withered_foxy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_WITHERED_FOXY, -10674658, -9097947, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> WITHERED_BONNIE = REGISTRY.register("withered_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.WITHERED_BONNIE, -12045717, -9018738, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> WITHERED_CHICA = REGISTRY.register("withered_chica_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.WITHERED_CHICA, -2446336, -2524384, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SITTING_WITHERED_BONNIE = REGISTRY.register("sitting_withered_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SITTING_WITHERED_BONNIE, -12906113, -12766348, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SITTING_WITHERED_CHICA = REGISTRY.register("sitting_withered_chica_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.SITTING_WITHERED_CHICA, -2836468, -5021928, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> UNWITHERED_FOXY = REGISTRY.register("unwithered_foxy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.UNWITHERED_FOXY, -11660525, -7715532, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> UNWITHERED_BONNIE = REGISTRY.register("unwithered_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.UNWITHERED_BONNIE, -12967297, -9023088, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> UNWITHERED_CHICA = REGISTRY.register("unwithered_chica_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.UNWITHERED_CHICA, -2647535, -4473925, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> FREDDY_FAZBEAR = REGISTRY.register("freddy_fazbear_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.FREDDY_FAZBEAR, -10994921, -16711423, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> BONNIE_BUNNY = REGISTRY.register("bonnie_bunny_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.BONNIE_BUNNY, -14018972, -10289152, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> CHICA_CHICKEN = REGISTRY.register("chica_chicken_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.CHICA_CHICKEN, -11776, -4297467, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FOXY_PIRATE = REGISTRY.register("foxy_pirate_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.FOXY_PIRATE, -6147561, -7711419, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FREDBEAR_ANIMATRONIC = REGISTRY.register("fredbear_animatronic_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.FREDBEAR_ANIMATRONIC, -2645248, -10270720, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SPRING_BONNIE_ANIMATRONIC = REGISTRY.register("spring_bonnie_animatronic_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SPRING_BONNIE_ANIMATRONIC, -6589184, -10071038, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> DAY_TIME_FREDDY = REGISTRY.register("day_time_freddy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_FREDDY, -11651049, -11389160, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> DAYTIME_CHICA = REGISTRY.register("daytime_chica_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.DAYTIME_CHICA, -1123584, -1147648, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> DAY_TIME_BONNIE = REGISTRY.register("day_time_bonnie_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_BONNIE, -13429149, -12436622, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> DAY_TIME_FOXY = REGISTRY.register("day_time_foxy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_FOXY, -6152192, -6404555, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> GLITCH_BONNIE_ANIMATRONIC = REGISTRY.register("glitch_bonnie_animatronic_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.GLITCH_BONNIE_ANIMATRONIC, -6589184, -12058557, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> GOLDEN_FREDDY = REGISTRY.register("golden_freddy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.GOLDEN_FREDDY, -2376924, -15790321, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SITTING_SPRING_BONNIE = REGISTRY.register("sitting_spring_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SITTING_SPRING_BONNIE, -6328817, -9557906, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
}