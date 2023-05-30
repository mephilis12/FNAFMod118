package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.DayTimePuppetEntity;

public class DayTimePuppetModel extends AnimatedGeoModel<DayTimePuppetEntity> {
	@Override
	public ResourceLocation getAnimationResource(DayTimePuppetEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/puppet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DayTimePuppetEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/puppet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DayTimePuppetEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
