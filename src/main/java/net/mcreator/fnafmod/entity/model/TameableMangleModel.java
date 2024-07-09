package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.TameableMangleEntity;

public class TameableMangleModel extends AnimatedGeoModel<TameableMangleEntity> {
	@Override
	public ResourceLocation getAnimationResource(TameableMangleEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/adventure_mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TameableMangleEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/adventure_mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TameableMangleEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
