
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.StatueFoxyEntity;
import net.mcreator.fnafmod.client.model.ModelFoxyDayTime;

public class StatueFoxyRenderer extends MobRenderer<StatueFoxyEntity, ModelFoxyDayTime<StatueFoxyEntity>> {
	public StatueFoxyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFoxyDayTime(context.bakeLayer(ModelFoxyDayTime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StatueFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/foxy.png");
	}
}
