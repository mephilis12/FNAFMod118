package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.UnWitheredFoxyHeadTileEntity;

public class UnWitheredFoxyHeadBlockModel extends AnimatedGeoModel<UnWitheredFoxyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnWitheredFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/unwitheredfoxyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnWitheredFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/unwitheredfoxyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnWitheredFoxyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/unwitheredfoxyhead.png");
	}
}
