
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SpringBonnieCreatureEntity;
import net.mcreator.fnafmod.client.model.ModelSpringBonnie;

public class SpringBonnieCreatureRenderer extends MobRenderer<SpringBonnieCreatureEntity, ModelSpringBonnie<SpringBonnieCreatureEntity>> {
	public SpringBonnieCreatureRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpringBonnie(context.bakeLayer(ModelSpringBonnie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpringBonnieCreatureEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/springbonnie.png");
	}
}
