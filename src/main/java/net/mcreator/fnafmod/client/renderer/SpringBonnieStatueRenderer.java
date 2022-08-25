
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SpringBonnieStatueEntity;
import net.mcreator.fnafmod.client.model.ModelStandingSpringBonnie;

public class SpringBonnieStatueRenderer extends MobRenderer<SpringBonnieStatueEntity, ModelStandingSpringBonnie<SpringBonnieStatueEntity>> {
	public SpringBonnieStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStandingSpringBonnie(context.bakeLayer(ModelStandingSpringBonnie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpringBonnieStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/springbonnie.png");
	}
}
