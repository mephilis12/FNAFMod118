package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.SittingWitheredBonnieEntity;

public class SittingWitheredBonnieModel extends AnimatedGeoModel<SittingWitheredBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(SittingWitheredBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/witheredbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SittingWitheredBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/witheredbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SittingWitheredBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
