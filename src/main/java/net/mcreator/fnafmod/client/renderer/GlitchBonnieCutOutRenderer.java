
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.GlitchBonnieCutOutEntity;
import net.mcreator.fnafmod.client.model.ModelCutoutSpringBonnie;

public class GlitchBonnieCutOutRenderer extends MobRenderer<GlitchBonnieCutOutEntity, ModelCutoutSpringBonnie<GlitchBonnieCutOutEntity>> {
	public GlitchBonnieCutOutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCutoutSpringBonnie(context.bakeLayer(ModelCutoutSpringBonnie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GlitchBonnieCutOutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/glitch_bonnie_cutout.png");
	}
}
