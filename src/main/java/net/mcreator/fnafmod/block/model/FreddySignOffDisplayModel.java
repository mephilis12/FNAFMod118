package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FreddySignOffDisplayItem;

public class FreddySignOffDisplayModel extends AnimatedGeoModel<FreddySignOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddySignOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/freddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddySignOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/freddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddySignOffDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/movie_sign.png");
	}
}
