
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.EndoSkeletonEntity;
import net.mcreator.fnafmod.client.model.ModelEndo;

public class EndoSkeletonRenderer extends MobRenderer<EndoSkeletonEntity, ModelEndo<EndoSkeletonEntity>> {
	public EndoSkeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEndo(context.bakeLayer(ModelEndo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EndoSkeletonEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/endoskeleton.png");
	}
}
