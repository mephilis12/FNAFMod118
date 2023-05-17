package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.StageLightRedOffDisplayItem;

public class StageLightRedOffDisplayModel extends AnimatedGeoModel<StageLightRedOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightRedOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightRedOffDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightRedOffDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/light.png");
	}
}
