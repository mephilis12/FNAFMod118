package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.NightmareBonnieStatueEntity;

public class NightmareBonnieStatueModel extends AnimatedGeoModel<NightmareBonnieStatueEntity> {
	@Override
	public ResourceLocation getAnimationResource(NightmareBonnieStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/nightmare_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NightmareBonnieStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/nightmare_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NightmareBonnieStatueEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
