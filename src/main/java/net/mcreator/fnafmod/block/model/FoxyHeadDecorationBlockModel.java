package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FoxyHeadDecorationTileEntity;

public class FoxyHeadDecorationBlockModel extends AnimatedGeoModel<FoxyHeadDecorationTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyHeadDecorationTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/foxyheadprop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyHeadDecorationTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/foxyheadprop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyHeadDecorationTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/foxyheaddecor.png");
	}
}
