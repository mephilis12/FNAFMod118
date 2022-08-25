
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.PassiveChicaEntity;
import net.mcreator.fnafmod.client.model.ModelChica;

public class PassiveChicaRenderer extends MobRenderer<PassiveChicaEntity, ModelChica<PassiveChicaEntity>> {
	public PassiveChicaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelChica(context.bakeLayer(ModelChica.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PassiveChicaEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/chica.png");
	}
}
