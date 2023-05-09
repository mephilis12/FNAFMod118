package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.entity.UnWitheredBonnieHeadTileEntity;

public class UnWitheredBonnieHeadBlockModel extends AnimatedGeoModel<UnWitheredBonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnWitheredBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "animations/unwitheredbonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnWitheredBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_mod", "geo/unwitheredbonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnWitheredBonnieHeadTileEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/unwitheredbonniehead.png");
	}
}
