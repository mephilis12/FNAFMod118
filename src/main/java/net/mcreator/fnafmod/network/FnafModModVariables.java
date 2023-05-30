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
				clone.WitheredGoldenFreddyJumpscare = original.WitheredGoldenFreddyJumpscare;
				clone.ToyBonnieJumpscare = original.ToyBonnieJumpscare;
				clone.ToyFreddyJumpscare = original.ToyFreddyJumpscare;
				clone.ToyChicaJumpscare = original.ToyChicaJumpscare;
				clone.ToyFoxyJumpscare = original.ToyFoxyJumpscare;
				clone.WitheredFreddyJumpscare = original.WitheredFreddyJumpscare;
				clone.WitheredBonnieJumpscare = original.WitheredBonnieJumpscare;
				clone.WitheredChicaJumpscare = original.WitheredChicaJumpscare;
				clone.WitheredFoxyJumpscare = original.WitheredFoxyJumpscare;
				clone.MangleJumpscare = original.MangleJumpscare;
				clone.PuppetKill = original.PuppetKill;
				clone.NightmarionneKill = original.NightmarionneKill;
				clone.NightmareKill = original.NightmareKill;
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
			foxykill = nbt.getBoolean("foxykill");
			chicakill = nbt.getBoolean("chicakill");
			bonniekill = nbt.getBoolean("bonniekill");
			PlayerFacing = nbt.getDouble("PlayerFacing");
			TimeDay = nbt.getBoolean("TimeDay");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
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
		public boolean Mask = false;
		public boolean WitheredGoldenFreddyJumpscare = false;
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
		public boolean PuppetKill = false;
		public boolean NightmarionneKill = false;
		public boolean NightmareKill = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				FnafModMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("goldenkill", goldenkill);
			nbt.putBoolean("Mask", Mask);
			nbt.putBoolean("WitheredGoldenFreddyJumpscare", WitheredGoldenFreddyJumpscare);
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
			nbt.putBoolean("PuppetKill", PuppetKill);
			nbt.putBoolean("NightmarionneKill", NightmarionneKill);
			nbt.putBoolean("NightmareKill", NightmareKill);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			goldenkill = nbt.getBoolean("goldenkill");
			Mask = nbt.getBoolean("Mask");
			WitheredGoldenFreddyJumpscare = nbt.getBoolean("WitheredGoldenFreddyJumpscare");
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
			PuppetKill = nbt.getBoolean("PuppetKill");
			NightmarionneKill = nbt.getBoolean("NightmarionneKill");
			NightmareKill = nbt.getBoolean("NightmareKill");
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
					variables.Mask = message.data.Mask;
					variables.WitheredGoldenFreddyJumpscare = message.data.WitheredGoldenFreddyJumpscare;
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
					variables.PuppetKill = message.data.PuppetKill;
					variables.NightmarionneKill = message.data.NightmarionneKill;
					variables.NightmareKill = message.data.NightmareKill;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
