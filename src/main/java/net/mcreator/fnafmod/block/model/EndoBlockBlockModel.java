package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.EndoBlockTileEntity;

public class EndoBlockBlockModel extends AnimatedGeoModel<EndoBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EndoBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/endoblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EndoBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/endoblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EndoBlockTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/endo01.png");
	}
}
