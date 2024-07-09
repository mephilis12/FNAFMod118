package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.ToyFreddySignOffTileEntity;

public class ToyFreddySignOffBlockModel extends AnimatedGeoModel<ToyFreddySignOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddySignOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/toyfreddyjr.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddySignOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/toyfreddyjr.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddySignOffTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/fnaf_jr.png");
	}
}
