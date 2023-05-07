package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.FreddyHeadDisplayItem;

public class FreddyHeadDisplayModel extends AnimatedGeoModel<FreddyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/freddyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/freddyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/freddyhead.png");
	}
}
