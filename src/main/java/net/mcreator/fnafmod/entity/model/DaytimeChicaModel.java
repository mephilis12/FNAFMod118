package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.DaytimeChicaEntity;

public class DaytimeChicaModel extends AnimatedGeoModel<DaytimeChicaEntity> {
	@Override
	public ResourceLocation getAnimationResource(DaytimeChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DaytimeChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DaytimeChicaEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
