package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.AdventureLolbitEntity;

public class AdventureLolbitModel extends AnimatedGeoModel<AdventureLolbitEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdventureLolbitEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/adventure_lolbit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdventureLolbitEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/adventure_lolbit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdventureLolbitEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
