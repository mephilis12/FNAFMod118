package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.ToyFreddySignOnTileEntity;

public class ToyFreddySignOnBlockModel extends AnimatedGeoModel<ToyFreddySignOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/toyfreddyjr.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddySignOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/toyfreddyjr.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddySignOnTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/fnaf_jr_lit.png");
	}
}
