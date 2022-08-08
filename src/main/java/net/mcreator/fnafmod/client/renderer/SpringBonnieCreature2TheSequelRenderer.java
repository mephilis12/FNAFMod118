
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SpringBonnieCreature2TheSequelEntity;
import net.mcreator.fnafmod.client.model.ModelSpringBonnie;

public class SpringBonnieCreature2TheSequelRenderer
		extends
			MobRenderer<SpringBonnieCreature2TheSequelEntity, ModelSpringBonnie<SpringBonnieCreature2TheSequelEntity>> {
	public SpringBonnieCreature2TheSequelRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpringBonnie(context.bakeLayer(ModelSpringBonnie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpringBonnieCreature2TheSequelEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/springbonniewithvestandwhiskers.png");
	}
}
