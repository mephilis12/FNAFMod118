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
import net.mcreator.fnafmod.entity.WitheredFoxyEntity;
import net.mcreator.fnafmod.entity.WitheredChicaEntity;
import net.mcreator.fnafmod.entity.WitheredBonnieEntity;
import net.mcreator.fnafmod.entity.UnwitheredFreddyEntity;
import net.mcreator.fnafmod.entity.UnwitheredFoxyEntity;
import net.mcreator.fnafmod.entity.UnwitheredChicaEntity;
import net.mcreator.fnafmod.entity.UnwitheredBonnieEntity;
import net.mcreator.fnafmod.entity.SpringBonnieAnimatronicEntity;
import net.mcreator.fnafmod.entity.SittingWitheredChicaEntity;
import net.mcreator.fnafmod.entity.SittingWitheredBonnieEntity;
import net.mcreator.fnafmod.entity.PhantomFreddyEntity;
import net.mcreator.fnafmod.entity.PhantomFoxyEntity;
import net.mcreator.fnafmod.entity.GlitchBonnieAnimatronicEntity;
import net.mcreator.fnafmod.entity.FreddyFazbearEntity;
import net.mcreator.fnafmod.entity.FredbearAnimatronicEntity;
import net.mcreator.fnafmod.entity.FoxyPirateEntity;
import net.mcreator.fnafmod.entity.DedWitheredFreddyEntity;
import net.mcreator.fnafmod.entity.DaytimeChicaEntity;
import net.mcreator.fnafmod.entity.DayTimeWitheredFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeFreddyEntity;
import net.mcreator.fnafmod.entity.DayTimeFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeBonnieEntity;
import net.mcreator.fnafmod.entity.CryingChildEntity;
import net.mcreator.fnafmod.entity.ChicaChickenEntity;
import net.mcreator.fnafmod.entity.BonnieBunnyEntity;
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
			DedWitheredFreddyEntity.init();
			PhantomFreddyEntity.init();
			CryingChildEntity.init();
			WitheredFreddyEntity.init();
			UnwitheredFreddyEntity.init();
			WitheredGoldenFreddyEntity.init();
			PhantomFoxyEntity.init();
			WitheredFoxyEntity.init();
			DayTimeWitheredFoxyEntity.init();
			WitheredBonnieEntity.init();
			WitheredChicaEntity.init();
			SittingWitheredBonnieEntity.init();
			SittingWitheredChicaEntity.init();
			UnwitheredFoxyEntity.init();
			UnwitheredBonnieEntity.init();
			UnwitheredChicaEntity.init();
			FreddyFazbearEntity.init();
			BonnieBunnyEntity.init();
			ChicaChickenEntity.init();
			FoxyPirateEntity.init();
			FredbearAnimatronicEntity.init();
			SpringBonnieAnimatronicEntity.init();
			DayTimeFreddyEntity.init();
			DaytimeChicaEntity.init();
			DayTimeBonnieEntity.init();
			DayTimeFoxyEntity.init();
			GlitchBonnieAnimatronicEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FnafModModEntities.DED_WITHERED_FREDDY.get(), DedWitheredFreddyEntity.createAttributes().build());
		event.put(FnafModModEntities.PHANTOM_FREDDY.get(), PhantomFreddyEntity.createAttributes().build());
		event.put(FnafModModEntities.CRYING_CHILD.get(), CryingChildEntity.createAttributes().build());
		event.put(FnafModModEntities.WITHERED_FREDDY.get(), WitheredFreddyEntity.createAttributes().build());
		event.put(FnafModModEntities.UNWITHERED_FREDDY.get(), UnwitheredFreddyEntity.createAttributes().build());
		event.put(FnafModModEntities.WITHERED_GOLDEN_FREDDY.get(), WitheredGoldenFreddyEntity.createAttributes().build());
		event.put(FnafModModEntities.PHANTOM_FOXY.get(), PhantomFoxyEntity.createAttributes().build());
		event.put(FnafModModEntities.WITHERED_FOXY.get(), WitheredFoxyEntity.createAttributes().build());
		event.put(FnafModModEntities.DAY_TIME_WITHERED_FOXY.get(), DayTimeWitheredFoxyEntity.createAttributes().build());
		event.put(FnafModModEntities.WITHERED_BONNIE.get(), WitheredBonnieEntity.createAttributes().build());
		event.put(FnafModModEntities.WITHERED_CHICA.get(), WitheredChicaEntity.createAttributes().build());
		event.put(FnafModModEntities.SITTING_WITHERED_BONNIE.get(), SittingWitheredBonnieEntity.createAttributes().build());
		event.put(FnafModModEntities.SITTING_WITHERED_CHICA.get(), SittingWitheredChicaEntity.createAttributes().build());
		event.put(FnafModModEntities.UNWITHERED_FOXY.get(), UnwitheredFoxyEntity.createAttributes().build());
		event.put(FnafModModEntities.UNWITHERED_BONNIE.get(), UnwitheredBonnieEntity.createAttributes().build());
		event.put(FnafModModEntities.UNWITHERED_CHICA.get(), UnwitheredChicaEntity.createAttributes().build());
		event.put(FnafModModEntities.FREDDY_FAZBEAR.get(), FreddyFazbearEntity.createAttributes().build());
		event.put(FnafModModEntities.BONNIE_BUNNY.get(), BonnieBunnyEntity.createAttributes().build());
		event.put(FnafModModEntities.CHICA_CHICKEN.get(), ChicaChickenEntity.createAttributes().build());
		event.put(FnafModModEntities.FOXY_PIRATE.get(), FoxyPirateEntity.createAttributes().build());
		event.put(FnafModModEntities.FREDBEAR_ANIMATRONIC.get(), FredbearAnimatronicEntity.createAttributes().build());
		event.put(FnafModModEntities.SPRING_BONNIE_ANIMATRONIC.get(), SpringBonnieAnimatronicEntity.createAttributes().build());
		event.put(FnafModModEntities.DAY_TIME_FREDDY.get(), DayTimeFreddyEntity.createAttributes().build());
		event.put(FnafModModEntities.DAYTIME_CHICA.get(), DaytimeChicaEntity.createAttributes().build());
		event.put(FnafModModEntities.DAY_TIME_BONNIE.get(), DayTimeBonnieEntity.createAttributes().build());
		event.put(FnafModModEntities.DAY_TIME_FOXY.get(), DayTimeFoxyEntity.createAttributes().build());
		event.put(FnafModModEntities.GLITCH_BONNIE_ANIMATRONIC.get(), GlitchBonnieAnimatronicEntity.createAttributes().build());
	}
}
