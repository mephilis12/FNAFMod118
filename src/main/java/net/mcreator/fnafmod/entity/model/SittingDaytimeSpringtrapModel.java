package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.SittingDaytimeSpringtrapEntity;

public class SittingDaytimeSpringtrapModel extends AnimatedGeoModel<SittingDaytimeSpringtrapEntity> {
	@Override
	public ResourceLocation getAnimationResource(SittingDaytimeSpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/springtrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SittingDaytimeSpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/springtrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SittingDaytimeSpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
