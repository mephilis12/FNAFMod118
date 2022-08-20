
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.WitheredChicaEntity;
import net.mcreator.fnafmod.client.model.ModelWitheredChica;

public class WitheredChicaRenderer extends MobRenderer<WitheredChicaEntity, ModelWitheredChica<WitheredChicaEntity>> {
	public WitheredChicaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWitheredChica(context.bakeLayer(ModelWitheredChica.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WitheredChicaEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/witheredchicatexture.png");
	}
}
