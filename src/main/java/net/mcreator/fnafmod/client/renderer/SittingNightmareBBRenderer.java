
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SittingNightmareBBEntity;
import net.mcreator.fnafmod.client.model.ModelNbbDay;

public class SittingNightmareBBRenderer extends MobRenderer<SittingNightmareBBEntity, ModelNbbDay<SittingNightmareBBEntity>> {
	public SittingNightmareBBRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNbbDay(context.bakeLayer(ModelNbbDay.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SittingNightmareBBEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nmmbb.png");
	}
}
