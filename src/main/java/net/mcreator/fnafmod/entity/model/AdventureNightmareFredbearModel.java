package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.AdventureNightmareFredbearEntity;

public class AdventureNightmareFredbearModel extends AnimatedGeoModel<AdventureNightmareFredbearEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdventureNightmareFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/adventure_nightmare_fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdventureNightmareFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/adventure_nightmare_fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdventureNightmareFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
