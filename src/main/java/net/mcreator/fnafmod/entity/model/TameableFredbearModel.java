package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.TameableFredbearEntity;

public class TameableFredbearModel extends AnimatedGeoModel<TameableFredbearEntity> {
	@Override
	public ResourceLocation getAnimationResource(TameableFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/adventure_nightmare_fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TameableFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/adventure_nightmare_fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TameableFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
