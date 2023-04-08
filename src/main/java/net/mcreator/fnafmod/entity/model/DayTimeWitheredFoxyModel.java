package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.DayTimeWitheredFoxyEntity;

public class DayTimeWitheredFoxyModel extends AnimatedGeoModel<DayTimeWitheredFoxyEntity> {
	@Override
	public ResourceLocation getAnimationResource(DayTimeWitheredFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/witheredfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayTimeWitheredFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/witheredfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayTimeWitheredFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
