package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.CrawlingMangleEntity;

public class CrawlingMangleModel extends AnimatedGeoModel<CrawlingMangleEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrawlingMangleEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrawlingMangleEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrawlingMangleEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
