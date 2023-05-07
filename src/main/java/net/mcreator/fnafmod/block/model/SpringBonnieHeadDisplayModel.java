package net.mcreator.fnafmod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.block.display.SpringBonnieHeadDisplayItem;

public class SpringBonnieHeadDisplayModel extends AnimatedGeoModel<SpringBonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "animations/springbonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_mod", "geo/springbonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_mod", "textures/blocks/springbonniehead.png");
	}
}
