
package net.mcreator.fnafmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.world.inventory.CameraGUIMenu;
import net.mcreator.fnafmod.procedures.Cam5PressedProcedure;
import net.mcreator.fnafmod.procedures.Cam4PressedProcedure;
import net.mcreator.fnafmod.procedures.Cam3PressedProcedure;
import net.mcreator.fnafmod.procedures.Cam2PressedProcedure;
import net.mcreator.fnafmod.procedures.Cam1PressedProcedure;
import net.mcreator.fnafmod.procedures.Back2PressedProcedure;
import net.mcreator.fnafmod.procedures.Add2PressedProcedure;
import net.mcreator.fnafmod.FnafModMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CameraGUIButtonMessage {
	private final int buttonID, x, y, z;

	public CameraGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CameraGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CameraGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CameraGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = CameraGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Cam1PressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			Cam2PressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			Cam3PressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			Cam4PressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			Cam5PressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			Back2PressedProcedure.execute(entity);
		}
		if (buttonID == 6) {

			Add2PressedProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FnafModMod.addNetworkMessage(CameraGUIButtonMessage.class, CameraGUIButtonMessage::buffer, CameraGUIButtonMessage::new,
				CameraGUIButtonMessage::handler);
	}
}
