package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.MeshTrashCanTileEntity;

public class MeshTrashCanBlockModel extends AnimatedGeoModel<MeshTrashCanTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MeshTrashCanTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/mesh_trash_can.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MeshTrashCanTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/mesh_trash_can.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MeshTrashCanTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/bin.png");
	}
}
