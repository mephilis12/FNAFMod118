package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.StageLightOrangeOffTileEntity;

public class StageLightOrangeOffBlockModel extends AnimatedGeoModel<StageLightOrangeOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageLightOrangeOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightOrangeOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightOrangeOffTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/light.png");
	}
}
