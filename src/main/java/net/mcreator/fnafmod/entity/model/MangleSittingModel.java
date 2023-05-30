package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.MangleSittingEntity;

public class MangleSittingModel extends AnimatedGeoModel<MangleSittingEntity> {
	@Override
	public ResourceLocation getAnimationResource(MangleSittingEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MangleSittingEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MangleSittingEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
