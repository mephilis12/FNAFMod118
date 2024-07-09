package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.TameableSpringtrapEntity;

public class TameableSpringtrapModel extends AnimatedGeoModel<TameableSpringtrapEntity> {
	@Override
	public ResourceLocation getAnimationResource(TameableSpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/adventure_springtrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TameableSpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/adventure_springtrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TameableSpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
