package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.NightmareMangleEntity;

public class NightmareMangleModel extends AnimatedGeoModel<NightmareMangleEntity> {
	@Override
	public ResourceLocation getAnimationResource(NightmareMangleEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/nightmare_mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NightmareMangleEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/nightmare_mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NightmareMangleEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
