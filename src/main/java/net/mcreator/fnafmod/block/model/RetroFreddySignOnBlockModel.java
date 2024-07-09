package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.RetroFreddySignOnTileEntity;

public class RetroFreddySignOnBlockModel extends AnimatedGeoModel<RetroFreddySignOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroFreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fnaf6sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fnaf6sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFreddySignOnTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/fnaf_6sign_lit.png");
	}
}
