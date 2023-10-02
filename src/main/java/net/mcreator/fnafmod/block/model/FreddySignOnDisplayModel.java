package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FreddySignOnDisplayItem;

public class FreddySignOnDisplayModel extends AnimatedGeoModel<FreddySignOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddySignOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/freddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddySignOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/freddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddySignOnDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/movie_sign_glow.png");
	}
}
