package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.StageLightPinkOnTileEntity;

public class StageLightPinkOnBlockModel extends AnimatedGeoModel<StageLightPinkOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageLightPinkOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelighton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightPinkOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelighton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightPinkOnTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/lightonpink.png");
	}
}
