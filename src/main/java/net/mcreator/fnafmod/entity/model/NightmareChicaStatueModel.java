package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.NightmareChicaStatueEntity;

public class NightmareChicaStatueModel extends AnimatedGeoModel<NightmareChicaStatueEntity> {
	@Override
	public ResourceLocation getAnimationResource(NightmareChicaStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/nightmare_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NightmareChicaStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/nightmare_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NightmareChicaStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
