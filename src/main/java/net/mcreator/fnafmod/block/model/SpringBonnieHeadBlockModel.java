package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.SpringBonnieHeadTileEntity;

public class SpringBonnieHeadBlockModel extends AnimatedGeoModel<SpringBonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/springbonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/springbonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieHeadTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/springbonniehead.png");
	}
}
