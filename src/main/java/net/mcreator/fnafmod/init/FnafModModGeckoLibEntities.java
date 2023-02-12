package net.mcreator.fnafmod.init;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.mcreator.fnafmod.entity.spawneggs.GeckoLibSpawnEggs;
import net.mcreator.fnafmod.entity.WitheredGoldenFreddyEntity;
import net.mcreator.fnafmod.entity.WitheredFreddyEntity;
import net.mcreator.fnafmod.entity.UnwitheredFreddyEntity;
import net.mcreator.fnafmod.entity.DedWitheredFreddyEntity;
import net.mcreator.fnafmod.entity.CryingChildEntity;
import net.mcreator.fnafmod.FnafModMod;

@Mod.EventBusSubscriber(modid = FnafModMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FnafModModGeckoLibEntities {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			GeckoLibSpawnEggs.REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CryingChildEntity.init();
			WitheredFreddyEntity.init();
			DedWitheredFreddyEntity.init();
			UnwitheredFreddyEntity.init();
			WitheredGoldenFreddyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FnafModModEntities.CRYING_CHILD.get(), CryingChildEntity.createAttributes().build());
		event.put(FnafModModEntities.WITHERED_FREDDY.get(), WitheredFreddyEntity.createAttributes().build());
		event.put(FnafModModEntities.DED_WITHERED_FREDDY.get(), DedWitheredFreddyEntity.createAttributes().build());
		event.put(FnafModModEntities.UNWITHERED_FREDDY.get(), UnwitheredFreddyEntity.createAttributes().build());
		event.put(FnafModModEntities.WITHERED_GOLDEN_FREDDY.get(), WitheredGoldenFreddyEntity.createAttributes().build());
	}
}
