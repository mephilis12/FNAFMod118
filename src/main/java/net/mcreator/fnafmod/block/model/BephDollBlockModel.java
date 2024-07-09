package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.BephDollTileEntity;

public class BephDollBlockModel extends AnimatedGeoModel<BephDollTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BephDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/chibi_beph.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BephDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/chibi_beph.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BephDollTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/chibibeph.png");
	}
}
