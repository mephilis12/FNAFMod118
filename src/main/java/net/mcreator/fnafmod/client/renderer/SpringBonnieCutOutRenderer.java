
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SpringBonnieCutOutEntity;
import net.mcreator.fnafmod.client.model.ModelSpringBonnieCutOut;

public class SpringBonnieCutOutRenderer extends MobRenderer<SpringBonnieCutOutEntity, ModelSpringBonnieCutOut<SpringBonnieCutOutEntity>> {
	public SpringBonnieCutOutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpringBonnieCutOut(context.bakeLayer(ModelSpringBonnieCutOut.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpringBonnieCutOutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/spring_bonnie_cutout.png");
	}
}
