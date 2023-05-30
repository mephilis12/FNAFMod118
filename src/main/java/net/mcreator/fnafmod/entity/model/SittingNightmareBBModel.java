package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.SittingNightmareBBEntity;

public class SittingNightmareBBModel extends AnimatedGeoModel<SittingNightmareBBEntity> {
	@Override
	public ResourceLocation getAnimationResource(SittingNightmareBBEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/nightmare_balloon_boy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SittingNightmareBBEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/nightmare_balloon_boy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SittingNightmareBBEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
