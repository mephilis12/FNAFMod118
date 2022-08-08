
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SittingWitheredChicaEntity;
import net.mcreator.fnafmod.client.model.ModelSittingWitheredChica;

public class SittingWitheredChicaRenderer extends MobRenderer<SittingWitheredChicaEntity, ModelSittingWitheredChica<SittingWitheredChicaEntity>> {
	public SittingWitheredChicaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSittingWitheredChica(context.bakeLayer(ModelSittingWitheredChica.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SittingWitheredChicaEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/witheredchicatexture.png");
	}
}
