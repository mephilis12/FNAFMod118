
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.DayTimeFoxyEntity;
import net.mcreator.fnafmod.client.model.ModelFoxyDayTime;

public class DayTimeFoxyRenderer extends MobRenderer<DayTimeFoxyEntity, ModelFoxyDayTime<DayTimeFoxyEntity>> {
	public DayTimeFoxyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFoxyDayTime(context.bakeLayer(ModelFoxyDayTime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DayTimeFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/foxy.png");
	}
}
