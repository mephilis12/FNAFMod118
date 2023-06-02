package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.NightmareFreddyStatueEntity;

public class NightmareFreddyStatueModel extends AnimatedGeoModel<NightmareFreddyStatueEntity> {
	@Override
	public ResourceLocation getAnimationResource(NightmareFreddyStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/nightmare_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NightmareFreddyStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/nightmare_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NightmareFreddyStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
