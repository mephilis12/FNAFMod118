package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.VassDollTileEntity;

public class VassDollBlockModel extends AnimatedGeoModel<VassDollTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(VassDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/vassdoll.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VassDollTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/vassdoll.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VassDollTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/vassdoll.png");
	}
}
