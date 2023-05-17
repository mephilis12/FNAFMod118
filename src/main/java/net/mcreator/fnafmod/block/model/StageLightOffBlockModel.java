package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.StageLightOffTileEntity;

public class StageLightOffBlockModel extends AnimatedGeoModel<StageLightOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageLightOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightOffTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/light.png");
	}
}
