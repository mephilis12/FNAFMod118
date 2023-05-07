package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.DayTimeFreddyEntity;

public class DayTimeFreddyModel extends AnimatedGeoModel<DayTimeFreddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(DayTimeFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayTimeFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayTimeFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
