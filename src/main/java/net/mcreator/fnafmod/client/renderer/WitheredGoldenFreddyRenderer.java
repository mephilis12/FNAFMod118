
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.WitheredGoldenFreddyEntity;
import net.mcreator.fnafmod.client.model.ModelWitheredGoldenFreddy;

public class WitheredGoldenFreddyRenderer extends MobRenderer<WitheredGoldenFreddyEntity, ModelWitheredGoldenFreddy<WitheredGoldenFreddyEntity>> {
	public WitheredGoldenFreddyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWitheredGoldenFreddy(context.bakeLayer(ModelWitheredGoldenFreddy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WitheredGoldenFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/witheredgoldenfreddytexture.png");
	}
}
