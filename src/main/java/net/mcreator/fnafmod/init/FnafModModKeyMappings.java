
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.fnafmod.network.SpawnPartyMessage;
import net.mcreator.fnafmod.network.PartySelectorKeyBindMessage;
import net.mcreator.fnafmod.network.ExitCameraMessage;
import net.mcreator.fnafmod.FnafModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FnafModModKeyMappings {
	public static final KeyMapping EXIT_CAMERA = new KeyMapping("key.fnaf_mod.exit_camera", GLFW.GLFW_KEY_Z, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FnafModMod.PACKET_HANDLER.sendToServer(new ExitCameraMessage(0, 0));
				ExitCameraMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping PARTY_SELECTOR_KEY_BIND = new KeyMapping("key.fnaf_mod.party_selector_key_bind", GLFW.GLFW_KEY_R, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FnafModMod.PACKET_HANDLER.sendToServer(new PartySelectorKeyBindMessage(0, 0));
				PartySelectorKeyBindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SPAWN_PARTY = new KeyMapping("key.fnaf_mod.spawn_party", GLFW.GLFW_KEY_V, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FnafModMod.PACKET_HANDLER.sendToServer(new SpawnPartyMessage(0, 0));
				SpawnPartyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(EXIT_CAMERA);
		event.register(PARTY_SELECTOR_KEY_BIND);
		event.register(SPAWN_PARTY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				EXIT_CAMERA.consumeClick();
				PARTY_SELECTOR_KEY_BIND.consumeClick();
				SPAWN_PARTY.consumeClick();
			}
		}
	}
}
