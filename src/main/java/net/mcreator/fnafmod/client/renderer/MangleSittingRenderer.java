
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.MangleSittingEntity;
import net.mcreator.fnafmod.client.model.ModelMangle_Day;

public class MangleSittingRenderer extends MobRenderer<MangleSittingEntity, ModelMangle_Day<MangleSittingEntity>> {
	public MangleSittingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMangle_Day(context.bakeLayer(ModelMangle_Day.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MangleSittingEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/mangle.png");
	}
}
