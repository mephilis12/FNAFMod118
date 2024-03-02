
package net.mcreator.fnafmod.world.biome;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import java.util.List;

public class LiligearLakeBiome {
	public static final List<Climate.ParameterPoint> UNDERGROUND_PARAMETER_POINTS = List.of(new Climate.ParameterPoint(Climate.Parameter.span(0f, 0.8f), Climate.Parameter.span(-0.9f, 0.5f), Climate.Parameter.span(-1f, -0.1f),
			Climate.Parameter.span(-0.5f, 0f), Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-2f, 1f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(-10053121).waterFogColor(329011).skyColor(7972607).foliageColorOverride(-16711834).grassColorOverride(-16711834)
				.ambientLoopSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:lilygeartemp"))).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addSwampVegetation(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.5f).downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
