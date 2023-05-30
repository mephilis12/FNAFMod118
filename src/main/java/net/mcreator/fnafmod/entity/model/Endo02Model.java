package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.entity.Endo02Entity;

public class Endo02Model extends AnimatedGeoModel<Endo02Entity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02Entity entity) {
		return new ResourceLocation("fnaf_mod", "animations/witheredfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02Entity entity) {
		return new ResourceLocation("fnaf_mod", "geo/witheredfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02Entity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
