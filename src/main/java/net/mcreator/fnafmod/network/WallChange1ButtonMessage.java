
package net.mcreator.fnafmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.world.inventory.WallChange1Menu;
import net.mcreator.fnafmod.procedures.DProcedure;
import net.mcreator.fnafmod.procedures.CProcedure;
import net.mcreator.fnafmod.procedures.BProcedure;
import net.mcreator.fnafmod.procedures.AProcedure;
import net.mcreator.fnafmod.FnafModMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WallChange1ButtonMessage {
	private final int buttonID, x, y, z;

	public WallChange1ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public WallChange1ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(WallChange1ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(WallChange1ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = WallChange1Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			AProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			BProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			CProcedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			DProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FnafModMod.addNetworkMessage(WallChange1ButtonMessage.class, WallChange1ButtonMessage::buffer, WallChange1ButtonMessage::new,
				WallChange1ButtonMessage::handler);
	}
}
