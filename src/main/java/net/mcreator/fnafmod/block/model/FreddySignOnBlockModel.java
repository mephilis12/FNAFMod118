package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FreddySignOnTileEntity;

public class FreddySignOnBlockModel extends AnimatedGeoModel<FreddySignOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/freddysign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/freddysign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddySignOnTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/movie_sign_glow.png");
	}
}
