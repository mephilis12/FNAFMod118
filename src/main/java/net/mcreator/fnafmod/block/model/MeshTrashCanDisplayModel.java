package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.MeshTrashCanDisplayItem;

public class MeshTrashCanDisplayModel extends AnimatedGeoModel<MeshTrashCanDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MeshTrashCanDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/mesh_trash_can.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MeshTrashCanDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/mesh_trash_can.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MeshTrashCanDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/bin.png");
	}
}
