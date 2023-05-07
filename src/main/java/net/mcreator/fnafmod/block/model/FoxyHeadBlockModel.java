package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FoxyHeadTileEntity;

public class FoxyHeadBlockModel extends AnimatedGeoModel<FoxyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/foxyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/foxyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/foxyhead.png");
	}
}
