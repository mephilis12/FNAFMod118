package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.ChicaHeadDecorationDisplayItem;

public class ChicaHeadDecorationDisplayModel extends AnimatedGeoModel<ChicaHeadDecorationDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaHeadDecorationDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/chicaheadprop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaHeadDecorationDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/chicaheadprop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaHeadDecorationDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/chicahead.png");
	}
}
