
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.fnafmod.world.features.WorkshopFeature;
import net.mcreator.fnafmod.world.features.RetroFeature;
import net.mcreator.fnafmod.world.features.Pizzeria5Feature;
import net.mcreator.fnafmod.world.features.Pizzeria4Feature;
import net.mcreator.fnafmod.world.features.Pizzeria3Feature;
import net.mcreator.fnafmod.world.features.Pizzeria2Feature;
import net.mcreator.fnafmod.world.features.Pizzeria1Feature;
import net.mcreator.fnafmod.world.features.ModernFeature;
import net.mcreator.fnafmod.world.features.FrightFeature;
import net.mcreator.fnafmod.world.features.FredbearFeature;
import net.mcreator.fnafmod.world.features.ArcadeBFeature;
import net.mcreator.fnafmod.world.features.ArcadeAFeature;
import net.mcreator.fnafmod.FnafModMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class FnafModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FnafModMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> PIZZERIA_1 = register("pizzeria_1", Pizzeria1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Pizzeria1Feature.GENERATE_BIOMES, Pizzeria1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> PIZZERIA_2 = register("pizzeria_2", Pizzeria2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Pizzeria2Feature.GENERATE_BIOMES, Pizzeria2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> PIZZERIA_3 = register("pizzeria_3", Pizzeria3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Pizzeria3Feature.GENERATE_BIOMES, Pizzeria3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> FREDBEAR = register("fredbear", FredbearFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, FredbearFeature.GENERATE_BIOMES, FredbearFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WORKSHOP = register("workshop", WorkshopFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, WorkshopFeature.GENERATE_BIOMES, WorkshopFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PIZZERIA_4 = register("pizzeria_4", Pizzeria4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Pizzeria4Feature.GENERATE_BIOMES, Pizzeria4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> PIZZERIA_5 = register("pizzeria_5", Pizzeria5Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Pizzeria5Feature.GENERATE_BIOMES, Pizzeria5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> RETRO = register("retro", RetroFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RetroFeature.GENERATE_BIOMES, RetroFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MODERN = register("modern", ModernFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, ModernFeature.GENERATE_BIOMES, ModernFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FRIGHT = register("fright", FrightFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, FrightFeature.GENERATE_BIOMES, FrightFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ARCADE_A = register("arcade_a", ArcadeAFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, ArcadeAFeature.GENERATE_BIOMES, ArcadeAFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ARCADE_B = register("arcade_b", ArcadeBFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, ArcadeBFeature.GENERATE_BIOMES, ArcadeBFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
