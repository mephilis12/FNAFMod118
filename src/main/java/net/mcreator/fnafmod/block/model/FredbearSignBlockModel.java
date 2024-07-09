package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.FredbearSignTileEntity;

public class FredbearSignBlockModel extends AnimatedGeoModel<FredbearSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearSignTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/fredbearsign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearSignTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/fredbearsign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearSignTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/bear.png");
	}
}
