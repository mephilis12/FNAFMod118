package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.ChicaHeadDisplayItem;

public class ChicaHeadDisplayModel extends AnimatedGeoModel<ChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/chicahead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/chicahead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/chicahead.png");
	}
}
