
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.ToyChicaEntity;
import net.mcreator.fnafmod.client.model.ModelToy_Chica_Daytime;

public class ToyChicaRenderer extends MobRenderer<ToyChicaEntity, ModelToy_Chica_Daytime<ToyChicaEntity>> {
	public ToyChicaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelToy_Chica_Daytime(context.bakeLayer(ModelToy_Chica_Daytime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ToyChicaEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/toy_chica.png");
	}
}
