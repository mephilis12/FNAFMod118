
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.PlushtrapEntity;
import net.mcreator.fnafmod.client.model.ModelPlushtrap;

public class PlushtrapRenderer extends MobRenderer<PlushtrapEntity, ModelPlushtrap<PlushtrapEntity>> {
	public PlushtrapRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPlushtrap(context.bakeLayer(ModelPlushtrap.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PlushtrapEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/plushtrap.png");
	}
}
