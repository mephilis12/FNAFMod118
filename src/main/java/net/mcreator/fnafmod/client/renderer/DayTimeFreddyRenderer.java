
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.DayTimeFreddyEntity;
import net.mcreator.fnafmod.client.model.ModelFreddyDayTime;

public class DayTimeFreddyRenderer extends MobRenderer<DayTimeFreddyEntity, ModelFreddyDayTime<DayTimeFreddyEntity>> {
	public DayTimeFreddyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFreddyDayTime(context.bakeLayer(ModelFreddyDayTime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DayTimeFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/freddyfazbeartexture.png");
	}
}
