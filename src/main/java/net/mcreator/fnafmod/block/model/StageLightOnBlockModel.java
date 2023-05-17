package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.StageLightOnTileEntity;

public class StageLightOnBlockModel extends AnimatedGeoModel<StageLightOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageLightOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelighton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelighton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightOnTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/lighton.png");
	}
}
