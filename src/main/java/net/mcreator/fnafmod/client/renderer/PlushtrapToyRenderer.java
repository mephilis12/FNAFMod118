
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.PlushtrapToyEntity;
import net.mcreator.fnafmod.client.model.ModelPlushtrapSit;

public class PlushtrapToyRenderer extends MobRenderer<PlushtrapToyEntity, ModelPlushtrapSit<PlushtrapToyEntity>> {
	public PlushtrapToyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPlushtrapSit(context.bakeLayer(ModelPlushtrapSit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PlushtrapToyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/fixedplushtrap.png");
	}
}
