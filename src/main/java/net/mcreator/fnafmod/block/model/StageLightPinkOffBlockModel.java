package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.StageLightPinkOffTileEntity;

public class StageLightPinkOffBlockModel extends AnimatedGeoModel<StageLightPinkOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageLightPinkOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightPinkOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightPinkOffTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/light.png");
	}
}
