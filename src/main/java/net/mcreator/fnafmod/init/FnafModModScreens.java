
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.fnafmod.client.gui.WallChange2Screen;
import net.mcreator.fnafmod.client.gui.WallChange1Screen;
import net.mcreator.fnafmod.client.gui.RemnantInfuserScreen;
import net.mcreator.fnafmod.client.gui.LockerScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FnafModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(FnafModModMenus.LOCKER, LockerScreen::new);
			MenuScreens.register(FnafModModMenus.WALL_CHANGE_1, WallChange1Screen::new);
			MenuScreens.register(FnafModModMenus.WALL_CHANGE_2, WallChange2Screen::new);
			MenuScreens.register(FnafModModMenus.REMNANT_INFUSER, RemnantInfuserScreen::new);
		});
	}
}
