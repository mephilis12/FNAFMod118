
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.UnwitheredFoxyStatueEntity;
import net.mcreator.fnafmod.client.model.ModelUnwitheredFoxy_Pose;

public class UnwitheredFoxyStatueRenderer extends MobRenderer<UnwitheredFoxyStatueEntity, ModelUnwitheredFoxy_Pose<UnwitheredFoxyStatueEntity>> {
	public UnwitheredFoxyStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelUnwitheredFoxy_Pose(context.bakeLayer(ModelUnwitheredFoxy_Pose.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnwitheredFoxyStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/unwithered_foxy.png");
	}
}
