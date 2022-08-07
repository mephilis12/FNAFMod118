
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.StandingDaytimeSpringtrapEntity;
import net.mcreator.fnafmod.client.model.ModelSpringtrap;

public class StandingDaytimeSpringtrapRenderer
		extends
			MobRenderer<StandingDaytimeSpringtrapEntity, ModelSpringtrap<StandingDaytimeSpringtrapEntity>> {
	public StandingDaytimeSpringtrapRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpringtrap(context.bakeLayer(ModelSpringtrap.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StandingDaytimeSpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/springtrap.png");
	}
}
