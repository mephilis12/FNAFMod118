package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FreddySignOffTileEntity;

public class FreddySignOffBlockModel extends AnimatedGeoModel<FreddySignOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddySignOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/freddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddySignOffTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/freddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddySignOffTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/movie_sign.png");
	}
}
