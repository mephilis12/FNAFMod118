package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.EndoSkeletonEntity;

public class EndoSkeletonModel extends AnimatedGeoModel<EndoSkeletonEntity> {
	@Override
	public ResourceLocation getAnimationResource(EndoSkeletonEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/endo01.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EndoSkeletonEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/endo01.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EndoSkeletonEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
