package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.UnWitheredBonnieHeadDisplayItem;

public class UnWitheredBonnieHeadDisplayModel extends AnimatedGeoModel<UnWitheredBonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(UnWitheredBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/unwitheredbonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnWitheredBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/unwitheredbonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnWitheredBonnieHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/unwitheredbonniehead.png");
	}
}
