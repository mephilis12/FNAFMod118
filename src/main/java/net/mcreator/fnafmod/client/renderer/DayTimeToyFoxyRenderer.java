
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.DayTimeToyFoxyEntity;
import net.mcreator.fnafmod.client.model.ModelToy_Foxy_Daytime;

public class DayTimeToyFoxyRenderer extends MobRenderer<DayTimeToyFoxyEntity, ModelToy_Foxy_Daytime<DayTimeToyFoxyEntity>> {
	public DayTimeToyFoxyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelToy_Foxy_Daytime(context.bakeLayer(ModelToy_Foxy_Daytime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DayTimeToyFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/toy_foxy.png");
	}
}
