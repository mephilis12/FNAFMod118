package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.AdventureMangleEntity;

public class AdventureMangleModel extends AnimatedGeoModel<AdventureMangleEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdventureMangleEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/adventure_mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdventureMangleEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/adventure_mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdventureMangleEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
