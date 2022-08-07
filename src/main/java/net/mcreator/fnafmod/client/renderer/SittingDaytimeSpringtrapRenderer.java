
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SittingDaytimeSpringtrapEntity;
import net.mcreator.fnafmod.client.model.ModelDaytimeSpringtrap;

public class SittingDaytimeSpringtrapRenderer
		extends
			MobRenderer<SittingDaytimeSpringtrapEntity, ModelDaytimeSpringtrap<SittingDaytimeSpringtrapEntity>> {
	public SittingDaytimeSpringtrapRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDaytimeSpringtrap(context.bakeLayer(ModelDaytimeSpringtrap.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SittingDaytimeSpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/springtrap.png");
	}
}
