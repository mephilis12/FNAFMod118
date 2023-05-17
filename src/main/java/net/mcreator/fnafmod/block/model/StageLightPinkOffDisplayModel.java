package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.StageLightPinkOffDisplayItem;

public class StageLightPinkOffDisplayModel extends AnimatedGeoModel<StageLightPinkOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightPinkOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightPinkOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightPinkOffDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/light.png");
	}
}
