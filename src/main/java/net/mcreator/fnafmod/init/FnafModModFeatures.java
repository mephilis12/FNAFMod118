
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

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
import net.mcreator.fnafmod.world.features.AftonHouseFeature;
import net.mcreator.fnafmod.world.features.AbandonedFredbearFeature;
import net.mcreator.fnafmod.FnafModMod;

@Mod.EventBusSubscriber
public class FnafModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FnafModMod.MODID);
	public static final RegistryObject<Feature<?>> PIZZERIA_1 = REGISTRY.register("pizzeria_1", Pizzeria1Feature::feature);
	public static final RegistryObject<Feature<?>> PIZZERIA_2 = REGISTRY.register("pizzeria_2", Pizzeria2Feature::feature);
	public static final RegistryObject<Feature<?>> PIZZERIA_3 = REGISTRY.register("pizzeria_3", Pizzeria3Feature::feature);
	public static final RegistryObject<Feature<?>> FREDBEAR = REGISTRY.register("fredbear", FredbearFeature::feature);
	public static final RegistryObject<Feature<?>> WORKSHOP = REGISTRY.register("workshop", WorkshopFeature::feature);
	public static final RegistryObject<Feature<?>> PIZZERIA_4 = REGISTRY.register("pizzeria_4", Pizzeria4Feature::feature);
	public static final RegistryObject<Feature<?>> PIZZERIA_5 = REGISTRY.register("pizzeria_5", Pizzeria5Feature::feature);
	public static final RegistryObject<Feature<?>> RETRO = REGISTRY.register("retro", RetroFeature::feature);
	public static final RegistryObject<Feature<?>> MODERN = REGISTRY.register("modern", ModernFeature::feature);
	public static final RegistryObject<Feature<?>> FRIGHT = REGISTRY.register("fright", FrightFeature::feature);
	public static final RegistryObject<Feature<?>> ARCADE_A = REGISTRY.register("arcade_a", ArcadeAFeature::feature);
	public static final RegistryObject<Feature<?>> ARCADE_B = REGISTRY.register("arcade_b", ArcadeBFeature::feature);
	public static final RegistryObject<Feature<?>> ABANDONED_FREDBEAR = REGISTRY.register("abandoned_fredbear", AbandonedFredbearFeature::feature);
	public static final RegistryObject<Feature<?>> AFTON_HOUSE = REGISTRY.register("afton_house", AftonHouseFeature::feature);
}
