
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.GlitchBonnieStatueEntity;
import net.mcreator.fnafmod.client.model.ModelStandingSpringBonnie;

public class GlitchBonnieStatueRenderer extends MobRenderer<GlitchBonnieStatueEntity, ModelStandingSpringBonnie<GlitchBonnieStatueEntity>> {
	public GlitchBonnieStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStandingSpringBonnie(context.bakeLayer(ModelStandingSpringBonnie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GlitchBonnieStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/springbonniewithvestandwhiskers.png");
	}
}
