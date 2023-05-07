package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.EndoBlockDisplayItem;

public class EndoBlockDisplayModel extends AnimatedGeoModel<EndoBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EndoBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/endoblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EndoBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/endoblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EndoBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/endo01.png");
	}
}
