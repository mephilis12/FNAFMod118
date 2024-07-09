package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.ToyFreddySignOffDisplayItem;

public class ToyFreddySignOffDisplayModel extends AnimatedGeoModel<ToyFreddySignOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddySignOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/toyfreddyjr.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddySignOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/toyfreddyjr.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddySignOffDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/fnaf_jr.png");
	}
}
