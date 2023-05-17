package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.StageLightOnDisplayItem;

public class StageLightOnDisplayModel extends AnimatedGeoModel<StageLightOnDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelighton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightOnDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelighton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightOnDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/lighton.png");
	}
}
