package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.SpringBonnieDecorTileEntity;

public class SpringBonnieDecorBlockModel extends AnimatedGeoModel<SpringBonnieDecorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieDecorTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/floorspringbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieDecorTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/floorspringbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieDecorTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/floor_spring_bonnie.png");
	}
}
