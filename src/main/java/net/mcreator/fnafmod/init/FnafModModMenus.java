
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.fnafmod.world.inventory.WallChange2Menu;
import net.mcreator.fnafmod.world.inventory.WallChange1Menu;
import net.mcreator.fnafmod.world.inventory.RemnantInfuserMenu;
import net.mcreator.fnafmod.world.inventory.LockerMenu;
import net.mcreator.fnafmod.world.inventory.CameraGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FnafModModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<LockerMenu> LOCKER = register("locker", (id, inv, extraData) -> new LockerMenu(id, inv, extraData));
	public static final MenuType<WallChange1Menu> WALL_CHANGE_1 = register("wall_change_1",
			(id, inv, extraData) -> new WallChange1Menu(id, inv, extraData));
	public static final MenuType<WallChange2Menu> WALL_CHANGE_2 = register("wall_change_2",
			(id, inv, extraData) -> new WallChange2Menu(id, inv, extraData));
	public static final MenuType<RemnantInfuserMenu> REMNANT_INFUSER = register("remnant_infuser",
			(id, inv, extraData) -> new RemnantInfuserMenu(id, inv, extraData));
	public static final MenuType<CameraGUIMenu> CAMERA_GUI = register("camera_gui", (id, inv, extraData) -> new CameraGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
