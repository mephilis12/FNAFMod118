
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.UnwitheredFreddyStatueEntity;
import net.mcreator.fnafmod.client.model.ModelUnwitheredFreddyPosed;

public class UnwitheredFreddyStatueRenderer
		extends
			MobRenderer<UnwitheredFreddyStatueEntity, ModelUnwitheredFreddyPosed<UnwitheredFreddyStatueEntity>> {
	public UnwitheredFreddyStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelUnwitheredFreddyPosed(context.bakeLayer(ModelUnwitheredFreddyPosed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnwitheredFreddyStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/unwithered_freddy.png");
	}
}
