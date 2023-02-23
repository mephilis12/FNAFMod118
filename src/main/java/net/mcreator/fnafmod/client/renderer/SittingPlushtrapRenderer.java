
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SittingPlushtrapEntity;
import net.mcreator.fnafmod.client.model.ModelPlushtrapSit;

public class SittingPlushtrapRenderer extends MobRenderer<SittingPlushtrapEntity, ModelPlushtrapSit<SittingPlushtrapEntity>> {
	public SittingPlushtrapRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPlushtrapSit(context.bakeLayer(ModelPlushtrapSit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SittingPlushtrapEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/plushtrap.png");
	}
}
