
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.StatueChicaEntity;
import net.mcreator.fnafmod.client.model.ModelDaytime_Chica;

public class StatueChicaRenderer extends MobRenderer<StatueChicaEntity, ModelDaytime_Chica<StatueChicaEntity>> {
	public StatueChicaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDaytime_Chica(context.bakeLayer(ModelDaytime_Chica.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StatueChicaEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/chica.png");
	}
}
