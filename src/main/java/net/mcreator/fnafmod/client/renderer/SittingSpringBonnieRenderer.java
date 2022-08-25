
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SittingSpringBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelSpringBonnieSitting;

public class SittingSpringBonnieRenderer extends MobRenderer<SittingSpringBonnieEntity, ModelSpringBonnieSitting<SittingSpringBonnieEntity>> {
	public SittingSpringBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpringBonnieSitting(context.bakeLayer(ModelSpringBonnieSitting.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SittingSpringBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/springbonnie.png");
	}
}
