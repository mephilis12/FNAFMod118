
package net.mcreator.fnafmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.world.inventory.PartySystemMenu;
import net.mcreator.fnafmod.procedures.WChicaSelectProcedure;
import net.mcreator.fnafmod.procedures.SpringtrapSelectProcedure;
import net.mcreator.fnafmod.procedures.ResetButtonActionProcedure;
import net.mcreator.fnafmod.procedures.MangleSelectProcedure;
import net.mcreator.fnafmod.procedures.FreddySelectProcedure;
import net.mcreator.fnafmod.procedures.FredbearSelectProcedure;
import net.mcreator.fnafmod.FnafModMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PartySystemButtonMessage {
	private final int buttonID, x, y, z;

	public PartySystemButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public PartySystemButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(PartySystemButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(PartySystemButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = PartySystemMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ResetButtonActionProcedure.execute(entity);
		}
		if (buttonID == 1) {

			WChicaSelectProcedure.execute(entity);
		}
		if (buttonID == 2) {

			FreddySelectProcedure.execute(entity);
		}
		if (buttonID == 3) {

			MangleSelectProcedure.execute(entity);
		}
		if (buttonID == 4) {

			SpringtrapSelectProcedure.execute(entity);
		}
		if (buttonID == 5) {

			FredbearSelectProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FnafModMod.addNetworkMessage(PartySystemButtonMessage.class, PartySystemButtonMessage::buffer, PartySystemButtonMessage::new, PartySystemButtonMessage::handler);
	}
}
