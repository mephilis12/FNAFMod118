
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.FoxyPirateEntity;
import net.mcreator.fnafmod.client.model.ModelFoxy;

public class FoxyPirateRenderer extends MobRenderer<FoxyPirateEntity, ModelFoxy<FoxyPirateEntity>> {
	public FoxyPirateRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFoxy(context.bakeLayer(ModelFoxy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FoxyPirateEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/foxy.png");
	}
}
