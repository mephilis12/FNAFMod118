
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.DayTimePuppetEntity;
import net.mcreator.fnafmod.client.model.ModelDaytimePuppet;

public class DayTimePuppetRenderer extends MobRenderer<DayTimePuppetEntity, ModelDaytimePuppet<DayTimePuppetEntity>> {
	public DayTimePuppetRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDaytimePuppet(context.bakeLayer(ModelDaytimePuppet.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DayTimePuppetEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/daytimepuppet.png");
	}
}
