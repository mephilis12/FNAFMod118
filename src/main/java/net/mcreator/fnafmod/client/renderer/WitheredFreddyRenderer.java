
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.WitheredFreddyEntity;
import net.mcreator.fnafmod.client.model.ModelWitheredFreddy;

public class WitheredFreddyRenderer extends MobRenderer<WitheredFreddyEntity, ModelWitheredFreddy<WitheredFreddyEntity>> {
	public WitheredFreddyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWitheredFreddy(context.bakeLayer(ModelWitheredFreddy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WitheredFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/witheredfreddytexture.png");
	}
}
