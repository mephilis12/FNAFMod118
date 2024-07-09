package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.ToyFreddySignOnDisplayItem;

public class ToyFreddySignOnDisplayModel extends AnimatedGeoModel<ToyFreddySignOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddySignOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/toyfreddyjr.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddySignOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/toyfreddyjr.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddySignOnDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/fnaf_jr_lit.png");
	}
}
