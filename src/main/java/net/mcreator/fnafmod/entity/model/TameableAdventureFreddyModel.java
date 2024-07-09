package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.TameableAdventureFreddyEntity;

public class TameableAdventureFreddyModel extends AnimatedGeoModel<TameableAdventureFreddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(TameableAdventureFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/adventure_freddy2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TameableAdventureFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/adventure_freddy2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TameableAdventureFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
