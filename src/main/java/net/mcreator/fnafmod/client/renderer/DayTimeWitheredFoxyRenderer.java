
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.DayTimeWitheredFoxyEntity;
import net.mcreator.fnafmod.client.model.ModelDayTimeWitheredFoxy;

public class DayTimeWitheredFoxyRenderer extends MobRenderer<DayTimeWitheredFoxyEntity, ModelDayTimeWitheredFoxy<DayTimeWitheredFoxyEntity>> {
	public DayTimeWitheredFoxyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDayTimeWitheredFoxy(context.bakeLayer(ModelDayTimeWitheredFoxy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DayTimeWitheredFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/witheredfoxytexture.png");
	}
}
