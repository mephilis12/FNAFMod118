package net.mcreator.fnafmod.entity.model;

import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.entity.FredbearsFreddyEntity;

public class FredbearsFreddyModel extends AnimatedGeoModel<FredbearsFreddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearsFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "animations/dinerfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearsFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "geo/dinerfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearsFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(FredbearsFreddyEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("Head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}
