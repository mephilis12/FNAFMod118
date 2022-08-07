
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.ChicaChickenEntity;
import net.mcreator.fnafmod.client.model.ModelChica;

public class ChicaChickenRenderer extends MobRenderer<ChicaChickenEntity, ModelChica<ChicaChickenEntity>> {
	public ChicaChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelChica(context.bakeLayer(ModelChica.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChicaChickenEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/chica.png");
	}
}
