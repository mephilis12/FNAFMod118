package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.CenteredFreddySignTileEntity;

public class CenteredFreddySignBlockModel extends AnimatedGeoModel<CenteredFreddySignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CenteredFreddySignTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/centeredfreddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CenteredFreddySignTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/centeredfreddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CenteredFreddySignTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/movie_sign.png");
	}
}
