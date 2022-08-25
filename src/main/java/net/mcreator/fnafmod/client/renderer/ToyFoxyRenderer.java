
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.ToyFoxyEntity;
import net.mcreator.fnafmod.client.model.ModelToy_Foxy;

public class ToyFoxyRenderer extends MobRenderer<ToyFoxyEntity, ModelToy_Foxy<ToyFoxyEntity>> {
	public ToyFoxyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelToy_Foxy(context.bakeLayer(ModelToy_Foxy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ToyFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/toy_foxy.png");
	}
}
