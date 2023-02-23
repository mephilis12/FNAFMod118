package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.TrashCanDisplayItem;

public class TrashCanDisplayModel extends AnimatedGeoModel<TrashCanDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrashCanDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/trash_can.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrashCanDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/trash_can.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrashCanDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/trash_can.png");
	}
}
