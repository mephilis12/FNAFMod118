
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.fnafmod.world.inventory.WallChange2Menu;
import net.mcreator.fnafmod.world.inventory.WallChange1Menu;
import net.mcreator.fnafmod.world.inventory.RemnantInfuserMenu;
import net.mcreator.fnafmod.world.inventory.LockerMenu;
import net.mcreator.fnafmod.world.inventory.CameraGUIMenu;
import net.mcreator.fnafmod.FnafModMod;

public class FnafModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FnafModMod.MODID);
	public static final RegistryObject<MenuType<LockerMenu>> LOCKER = REGISTRY.register("locker", () -> IForgeMenuType.create(LockerMenu::new));
	public static final RegistryObject<MenuType<WallChange1Menu>> WALL_CHANGE_1 = REGISTRY.register("wall_change_1",
			() -> IForgeMenuType.create(WallChange1Menu::new));
	public static final RegistryObject<MenuType<WallChange2Menu>> WALL_CHANGE_2 = REGISTRY.register("wall_change_2",
			() -> IForgeMenuType.create(WallChange2Menu::new));
	public static final RegistryObject<MenuType<RemnantInfuserMenu>> REMNANT_INFUSER = REGISTRY.register("remnant_infuser",
			() -> IForgeMenuType.create(RemnantInfuserMenu::new));
	public static final RegistryObject<MenuType<CameraGUIMenu>> CAMERA_GUI = REGISTRY.register("camera_gui",
			() -> IForgeMenuType.create(CameraGUIMenu::new));
}
