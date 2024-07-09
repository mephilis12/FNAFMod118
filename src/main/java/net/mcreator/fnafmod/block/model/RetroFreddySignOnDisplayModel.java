package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.RetroFreddySignOnDisplayItem;

public class RetroFreddySignOnDisplayModel extends AnimatedGeoModel<RetroFreddySignOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroFreddySignOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fnaf6sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFreddySignOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fnaf6sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFreddySignOnDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/fnaf_6sign_lit.png");
	}
}
