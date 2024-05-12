package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.AdventureSpringtrapEntity;

public class AdventureSpringtrapModel extends AnimatedGeoModel<AdventureSpringtrapEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdventureSpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/adventure_springtrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdventureSpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/adventure_springtrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdventureSpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
