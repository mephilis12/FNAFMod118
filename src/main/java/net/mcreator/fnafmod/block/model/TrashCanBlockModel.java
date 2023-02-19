package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.TrashCanTileEntity;

public class TrashCanBlockModel extends AnimatedGeoModel<TrashCanTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/trash_can.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/trash_can.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/trash_can.png");
	}
}
