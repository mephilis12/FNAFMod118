package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FredbearHeadTileEntity;

public class FredbearHeadBlockModel extends AnimatedGeoModel<FredbearHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fredbearhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fredbearhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearHeadTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/fredbearhead.png");
	}
}
