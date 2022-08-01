
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.FullHostileFoxyEntity;
import net.mcreator.fnafmod.client.model.ModelFoxy;

public class FullHostileFoxyRenderer extends MobRenderer<FullHostileFoxyEntity, ModelFoxy<FullHostileFoxyEntity>> {
	public FullHostileFoxyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFoxy(context.bakeLayer(ModelFoxy.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FullHostileFoxyEntity, ModelFoxy<FullHostileFoxyEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/evil_foxy_eye_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FullHostileFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/foxy_evil_eyes.png");
	}
}
