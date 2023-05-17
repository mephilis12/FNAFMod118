package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.StageLightRedOffTileEntity;

public class StageLightRedOffBlockModel extends AnimatedGeoModel<StageLightRedOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageLightRedOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightRedOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightRedOffTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/light.png");
	}
}
