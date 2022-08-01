
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.DayTimeBBEntity;
import net.mcreator.fnafmod.client.model.ModelDaytimeBB;

public class DayTimeBBRenderer extends MobRenderer<DayTimeBBEntity, ModelDaytimeBB<DayTimeBBEntity>> {
	public DayTimeBBRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDaytimeBB(context.bakeLayer(ModelDaytimeBB.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DayTimeBBEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/balloonboytexture.png");
	}
}
