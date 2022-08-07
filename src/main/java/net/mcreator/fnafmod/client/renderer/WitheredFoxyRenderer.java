
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.WitheredFoxyEntity;
import net.mcreator.fnafmod.client.model.ModelWitheredFoxy;

public class WitheredFoxyRenderer extends MobRenderer<WitheredFoxyEntity, ModelWitheredFoxy<WitheredFoxyEntity>> {
	public WitheredFoxyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWitheredFoxy(context.bakeLayer(ModelWitheredFoxy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WitheredFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/witheredfoxytexture.png");
	}
}
