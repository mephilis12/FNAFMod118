package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.FreddlesEntity;

public class FreddlesModel extends AnimatedGeoModel<FreddlesEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddlesEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/freddles.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddlesEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/freddles.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddlesEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
