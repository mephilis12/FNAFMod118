package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.CenteredFreddySignDisplayItem;

public class CenteredFreddySignDisplayModel extends AnimatedGeoModel<CenteredFreddySignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CenteredFreddySignDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/centeredfreddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CenteredFreddySignDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/centeredfreddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CenteredFreddySignDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/movie_sign.png");
	}
}
