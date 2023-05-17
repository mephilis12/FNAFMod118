package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.StageLightOrangeOnDisplayItem;

public class StageLightOrangeOnDisplayModel extends AnimatedGeoModel<StageLightOrangeOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightOrangeOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelighton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightOrangeOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelighton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightOrangeOnDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/lightonorange.png");
	}
}
