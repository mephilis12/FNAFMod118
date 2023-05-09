package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.UnWitheredChicaHeadDisplayItem;

public class UnWitheredChicaHeadDisplayModel extends AnimatedGeoModel<UnWitheredChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnWitheredChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/unwitheredchicahead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnWitheredChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/unwitheredchicahead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnWitheredChicaHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/unwitheredchicahead.png");
	}
}
