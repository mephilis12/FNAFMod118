
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.DayTimeBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelDaytime_Bonnie;

public class DayTimeBonnieRenderer extends MobRenderer<DayTimeBonnieEntity, ModelDaytime_Bonnie<DayTimeBonnieEntity>> {
	public DayTimeBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDaytime_Bonnie(context.bakeLayer(ModelDaytime_Bonnie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DayTimeBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/fnaf_1_bonnie_daytime.png");
	}
}
