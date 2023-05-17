package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.StageLightOrangeOffDisplayItem;

public class StageLightOrangeOffDisplayModel extends AnimatedGeoModel<StageLightOrangeOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightOrangeOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightOrangeOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightOrangeOffDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/light.png");
	}
}
