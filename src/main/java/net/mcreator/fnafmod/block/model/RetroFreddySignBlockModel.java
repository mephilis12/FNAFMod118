package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.RetroFreddySignTileEntity;

public class RetroFreddySignBlockModel extends AnimatedGeoModel<RetroFreddySignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroFreddySignTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fnaf6sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFreddySignTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fnaf6sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFreddySignTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/fnaf_6sign.png");
	}
}
