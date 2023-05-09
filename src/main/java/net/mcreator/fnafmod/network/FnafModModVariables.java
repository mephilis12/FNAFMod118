package net.mcreator.fnafmod.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.FnafModMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FnafModModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		FnafModMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		FnafModMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.Mask = original.Mask;
			clone.CanPoison = original.CanPoison;
			clone.FlashLightDamage = original.FlashLightDamage;
			if (!event.isWasDeath()) {
				clone.goldenkill = original.goldenkill;
				clone.FreddyFrame1 = original.FreddyFrame1;
				clone.FreddyFrame2 = original.FreddyFrame2;
				clone.FreddyFrame3 = original.FreddyFrame3;
				clone.FreddyFrame4 = original.FreddyFrame4;
				clone.FreddyFrame5 = original.FreddyFrame5;
				clone.FoxyFrame1 = original.FoxyFrame1;
				clone.FoxyFrame2 = original.FoxyFrame2;
				clone.FoxyFrame3 = original.FoxyFrame3;
				clone.FoxyFrame4 = original.FoxyFrame4;
				clone.FoxyFrame5 = original.FoxyFrame5;
				clone.ChicaFrame1 = original.ChicaFrame1;
				clone.ChicaFrame2 = original.ChicaFrame2;
				clone.ChicaFrame3 = original.ChicaFrame3;
				clone.ChicaFrame4 = original.ChicaFrame4;
				clone.ChicaFrame5 = original.ChicaFrame5;
				clone.BonnieFrame1 = original.BonnieFrame1;
				clone.BonnieFrame2 = original.BonnieFrame2;
				clone.BonnieFrame3 = original.BonnieFrame3;
				clone.BonnieFrame4 = original.BonnieFrame4;
				clone.BonnieFrame5 = original.BonnieFrame5;
				clone.WitheredGoldenFreddyJumpscare = original.WitheredGoldenFreddyJumpscare;
				clone.PuppetJumpscare = original.PuppetJumpscare;
				clone.SpringtrapFrame1 = original.SpringtrapFrame1;
				clone.SpringtrapFrame2 = original.SpringtrapFrame2;
				clone.SpringtrapFrame3 = original.SpringtrapFrame3;
				clone.SpringtrapFrame4 = original.SpringtrapFrame4;
				clone.SpringtrapFrame5 = original.SpringtrapFrame5;
				clone.ToyBonnieJumpscare = original.ToyBonnieJumpscare;
				clone.ToyFreddyJumpscare = original.ToyFreddyJumpscare;
				clone.ToyChicaJumpscare = original.ToyChicaJumpscare;
				clone.ToyFoxyJumpscare = original.ToyFoxyJumpscare;
				clone.WitheredFreddyJumpscare = original.WitheredFreddyJumpscare;
				clone.WitheredBonnieJumpscare = original.WitheredBonnieJumpscare;
				clone.WitheredChicaJumpscare = original.WitheredChicaJumpscare;
				clone.WitheredFoxyJumpscare = original.WitheredFoxyJumpscare;
				clone.MangleJumpscare = original.MangleJumpscare;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level);
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (mapdata != null)
					FnafModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					FnafModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (worlddata != null)
					FnafModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "fnaf_mod_worldvars";
		public boolean freddykill = false;
		public boolean foxykill = false;
		public boolean chicakill = false;
		public boolean bonniekill = false;
		public double PlayerFacing = 0;
		public boolean TimeDay = false;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			freddykill = nbt.getBoolean("freddykill");
			foxykill = nbt.getBoolean("foxykill");
			chicakill = nbt.getBoolean("chicakill");
			bonniekill = nbt.getBoolean("bonniekill");
			PlayerFacing = nbt.getDouble("PlayerFacing");
			TimeDay = nbt.getBoolean("TimeDay");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("freddykill", freddykill);
			nbt.putBoolean("foxykill", foxykill);
			nbt.putBoolean("chicakill", chicakill);
			nbt.putBoolean("bonniekill", bonniekill);
			nbt.putDouble("PlayerFacing", PlayerFacing);
			nbt.putBoolean("TimeDay", TimeDay);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				FnafModMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "fnaf_mod_mapvars";
		public double Rand1 = 0;
		public boolean IsItDay = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			Rand1 = nbt.getDouble("Rand1");
			IsItDay = nbt.getBoolean("IsItDay");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("Rand1", Rand1);
			nbt.putBoolean("IsItDay", IsItDay);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				FnafModMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("fnaf_mod", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean goldenkill = false;
		public boolean FreddyFrame1 = false;
		public boolean FreddyFrame2 = false;
		public boolean FreddyFrame3 = false;
		public boolean FreddyFrame4 = false;
		public boolean FreddyFrame5 = false;
		public boolean FoxyFrame1 = false;
		public boolean FoxyFrame2 = false;
		public boolean FoxyFrame3 = false;
		public boolean FoxyFrame4 = false;
		public boolean FoxyFrame5 = false;
		public boolean ChicaFrame1 = false;
		public boolean ChicaFrame2 = false;
		public boolean ChicaFrame3 = false;
		public boolean ChicaFrame4 = false;
		public boolean ChicaFrame5 = false;
		public boolean BonnieFrame1 = false;
		public boolean BonnieFrame2 = false;
		public boolean BonnieFrame3 = false;
		public boolean BonnieFrame4 = false;
		public boolean BonnieFrame5 = false;
		public boolean Mask = false;
		public boolean WitheredGoldenFreddyJumpscare = false;
		public boolean PuppetJumpscare = false;
		public boolean SpringtrapFrame1 = false;
		public boolean SpringtrapFrame2 = false;
		public boolean SpringtrapFrame3 = false;
		public boolean SpringtrapFrame4 = false;
		public boolean SpringtrapFrame5 = false;
		public double ToyBonnieJumpscare = 0.0;
		public double ToyFreddyJumpscare = 0;
		public double ToyChicaJumpscare = 0;
		public double ToyFoxyJumpscare = 0;
		public double WitheredFreddyJumpscare = 0;
		public double WitheredBonnieJumpscare = 0;
		public double WitheredChicaJumpscare = 0;
		public double WitheredFoxyJumpscare = 0;
		public double MangleJumpscare = 0;
		public double CanPoison = 0;
		public double FlashLightDamage = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				FnafModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("goldenkill", goldenkill);
			nbt.putBoolean("FreddyFrame1", FreddyFrame1);
			nbt.putBoolean("FreddyFrame2", FreddyFrame2);
			nbt.putBoolean("FreddyFrame3", FreddyFrame3);
			nbt.putBoolean("FreddyFrame4", FreddyFrame4);
			nbt.putBoolean("FreddyFrame5", FreddyFrame5);
			nbt.putBoolean("FoxyFrame1", FoxyFrame1);
			nbt.putBoolean("FoxyFrame2", FoxyFrame2);
			nbt.putBoolean("FoxyFrame3", FoxyFrame3);
			nbt.putBoolean("FoxyFrame4", FoxyFrame4);
			nbt.putBoolean("FoxyFrame5", FoxyFrame5);
			nbt.putBoolean("ChicaFrame1", ChicaFrame1);
			nbt.putBoolean("ChicaFrame2", ChicaFrame2);
			nbt.putBoolean("ChicaFrame3", ChicaFrame3);
			nbt.putBoolean("ChicaFrame4", ChicaFrame4);
			nbt.putBoolean("ChicaFrame5", ChicaFrame5);
			nbt.putBoolean("BonnieFrame1", BonnieFrame1);
			nbt.putBoolean("BonnieFrame2", BonnieFrame2);
			nbt.putBoolean("BonnieFrame3", BonnieFrame3);
			nbt.putBoolean("BonnieFrame4", BonnieFrame4);
			nbt.putBoolean("BonnieFrame5", BonnieFrame5);
			nbt.putBoolean("Mask", Mask);
			nbt.putBoolean("WitheredGoldenFreddyJumpscare", WitheredGoldenFreddyJumpscare);
			nbt.putBoolean("PuppetJumpscare", PuppetJumpscare);
			nbt.putBoolean("SpringtrapFrame1", SpringtrapFrame1);
			nbt.putBoolean("SpringtrapFrame2", SpringtrapFrame2);
			nbt.putBoolean("SpringtrapFrame3", SpringtrapFrame3);
			nbt.putBoolean("SpringtrapFrame4", SpringtrapFrame4);
			nbt.putBoolean("SpringtrapFrame5", SpringtrapFrame5);
			nbt.putDouble("ToyBonnieJumpscare", ToyBonnieJumpscare);
			nbt.putDouble("ToyFreddyJumpscare", ToyFreddyJumpscare);
			nbt.putDouble("ToyChicaJumpscare", ToyChicaJumpscare);
			nbt.putDouble("ToyFoxyJumpscare", ToyFoxyJumpscare);
			nbt.putDouble("WitheredFreddyJumpscare", WitheredFreddyJumpscare);
			nbt.putDouble("WitheredBonnieJumpscare", WitheredBonnieJumpscare);
			nbt.putDouble("WitheredChicaJumpscare", WitheredChicaJumpscare);
			nbt.putDouble("WitheredFoxyJumpscare", WitheredFoxyJumpscare);
			nbt.putDouble("MangleJumpscare", MangleJumpscare);
			nbt.putDouble("CanPoison", CanPoison);
			nbt.putDouble("FlashLightDamage", FlashLightDamage);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			goldenkill = nbt.getBoolean("goldenkill");
			FreddyFrame1 = nbt.getBoolean("FreddyFrame1");
			FreddyFrame2 = nbt.getBoolean("FreddyFrame2");
			FreddyFrame3 = nbt.getBoolean("FreddyFrame3");
			FreddyFrame4 = nbt.getBoolean("FreddyFrame4");
			FreddyFrame5 = nbt.getBoolean("FreddyFrame5");
			FoxyFrame1 = nbt.getBoolean("FoxyFrame1");
			FoxyFrame2 = nbt.getBoolean("FoxyFrame2");
			FoxyFrame3 = nbt.getBoolean("FoxyFrame3");
			FoxyFrame4 = nbt.getBoolean("FoxyFrame4");
			FoxyFrame5 = nbt.getBoolean("FoxyFrame5");
			ChicaFrame1 = nbt.getBoolean("ChicaFrame1");
			ChicaFrame2 = nbt.getBoolean("ChicaFrame2");
			ChicaFrame3 = nbt.getBoolean("ChicaFrame3");
			ChicaFrame4 = nbt.getBoolean("ChicaFrame4");
			ChicaFrame5 = nbt.getBoolean("ChicaFrame5");
			BonnieFrame1 = nbt.getBoolean("BonnieFrame1");
			BonnieFrame2 = nbt.getBoolean("BonnieFrame2");
			BonnieFrame3 = nbt.getBoolean("BonnieFrame3");
			BonnieFrame4 = nbt.getBoolean("BonnieFrame4");
			BonnieFrame5 = nbt.getBoolean("BonnieFrame5");
			Mask = nbt.getBoolean("Mask");
			WitheredGoldenFreddyJumpscare = nbt.getBoolean("WitheredGoldenFreddyJumpscare");
			PuppetJumpscare = nbt.getBoolean("PuppetJumpscare");
			SpringtrapFrame1 = nbt.getBoolean("SpringtrapFrame1");
			SpringtrapFrame2 = nbt.getBoolean("SpringtrapFrame2");
			SpringtrapFrame3 = nbt.getBoolean("SpringtrapFrame3");
			SpringtrapFrame4 = nbt.getBoolean("SpringtrapFrame4");
			SpringtrapFrame5 = nbt.getBoolean("SpringtrapFrame5");
			ToyBonnieJumpscare = nbt.getDouble("ToyBonnieJumpscare");
			ToyFreddyJumpscare = nbt.getDouble("ToyFreddyJumpscare");
			ToyChicaJumpscare = nbt.getDouble("ToyChicaJumpscare");
			ToyFoxyJumpscare = nbt.getDouble("ToyFoxyJumpscare");
			WitheredFreddyJumpscare = nbt.getDouble("WitheredFreddyJumpscare");
			WitheredBonnieJumpscare = nbt.getDouble("WitheredBonnieJumpscare");
			WitheredChicaJumpscare = nbt.getDouble("WitheredChicaJumpscare");
			WitheredFoxyJumpscare = nbt.getDouble("WitheredFoxyJumpscare");
			MangleJumpscare = nbt.getDouble("MangleJumpscare");
			CanPoison = nbt.getDouble("CanPoison");
			FlashLightDamage = nbt.getDouble("FlashLightDamage");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.goldenkill = message.data.goldenkill;
					variables.FreddyFrame1 = message.data.FreddyFrame1;
					variables.FreddyFrame2 = message.data.FreddyFrame2;
					variables.FreddyFrame3 = message.data.FreddyFrame3;
					variables.FreddyFrame4 = message.data.FreddyFrame4;
					variables.FreddyFrame5 = message.data.FreddyFrame5;
					variables.FoxyFrame1 = message.data.FoxyFrame1;
					variables.FoxyFrame2 = message.data.FoxyFrame2;
					variables.FoxyFrame3 = message.data.FoxyFrame3;
					variables.FoxyFrame4 = message.data.FoxyFrame4;
					variables.FoxyFrame5 = message.data.FoxyFrame5;
					variables.ChicaFrame1 = message.data.ChicaFrame1;
					variables.ChicaFrame2 = message.data.ChicaFrame2;
					variables.ChicaFrame3 = message.data.ChicaFrame3;
					variables.ChicaFrame4 = message.data.ChicaFrame4;
					variables.ChicaFrame5 = message.data.ChicaFrame5;
					variables.BonnieFrame1 = message.data.BonnieFrame1;
					variables.BonnieFrame2 = message.data.BonnieFrame2;
					variables.BonnieFrame3 = message.data.BonnieFrame3;
					variables.BonnieFrame4 = message.data.BonnieFrame4;
					variables.BonnieFrame5 = message.data.BonnieFrame5;
					variables.Mask = message.data.Mask;
					variables.WitheredGoldenFreddyJumpscare = message.data.WitheredGoldenFreddyJumpscare;
					variables.PuppetJumpscare = message.data.PuppetJumpscare;
					variables.SpringtrapFrame1 = message.data.SpringtrapFrame1;
					variables.SpringtrapFrame2 = message.data.SpringtrapFrame2;
					variables.SpringtrapFrame3 = message.data.SpringtrapFrame3;
					variables.SpringtrapFrame4 = message.data.SpringtrapFrame4;
					variables.SpringtrapFrame5 = message.data.SpringtrapFrame5;
					variables.ToyBonnieJumpscare = message.data.ToyBonnieJumpscare;
					variables.ToyFreddyJumpscare = message.data.ToyFreddyJumpscare;
					variables.ToyChicaJumpscare = message.data.ToyChicaJumpscare;
					variables.ToyFoxyJumpscare = message.data.ToyFoxyJumpscare;
					variables.WitheredFreddyJumpscare = message.data.WitheredFreddyJumpscare;
					variables.WitheredBonnieJumpscare = message.data.WitheredBonnieJumpscare;
					variables.WitheredChicaJumpscare = message.data.WitheredChicaJumpscare;
					variables.WitheredFoxyJumpscare = message.data.WitheredFoxyJumpscare;
					variables.MangleJumpscare = message.data.MangleJumpscare;
					variables.CanPoison = message.data.CanPoison;
					variables.FlashLightDamage = message.data.FlashLightDamage;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
