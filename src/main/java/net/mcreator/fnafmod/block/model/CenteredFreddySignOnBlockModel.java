package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.CenteredFreddySignOnTileEntity;

public class CenteredFreddySignOnBlockModel extends AnimatedGeoModel<CenteredFreddySignOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CenteredFreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/centeredfreddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CenteredFreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/centeredfreddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CenteredFreddySignOnTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/movie_sign_glow.png");
	}
}
