
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.DayTimeToyFreddyEntity;
import net.mcreator.fnafmod.client.model.ModelToy_Freddy_Daytime;

public class DayTimeToyFreddyRenderer extends MobRenderer<DayTimeToyFreddyEntity, ModelToy_Freddy_Daytime<DayTimeToyFreddyEntity>> {
	public DayTimeToyFreddyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelToy_Freddy_Daytime(context.bakeLayer(ModelToy_Freddy_Daytime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DayTimeToyFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/toy_freddy.png");
	}
}
