package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.StageLightOffDisplayItem;

public class StageLightOffDisplayModel extends AnimatedGeoModel<StageLightOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightOffDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/light.png");
	}
}
