package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.StageLightRedOnTileEntity;

public class StageLightRedOnBlockModel extends AnimatedGeoModel<StageLightRedOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageLightRedOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/stagelighton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightRedOnTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/stagelighton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightRedOnTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/lightred.png");
	}
}
