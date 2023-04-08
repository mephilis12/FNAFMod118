
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.NightmareFoxyEntity;
import net.mcreator.fnafmod.client.model.ModelNightmare_Foxy;

public class NightmareFoxyRenderer extends MobRenderer<NightmareFoxyEntity, ModelNightmare_Foxy<NightmareFoxyEntity>> {
	public NightmareFoxyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmare_Foxy(context.bakeLayer(ModelNightmare_Foxy.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<NightmareFoxyEntity, ModelNightmare_Foxy<NightmareFoxyEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/nightmare_foxy_eye_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmare_foxy.png");
	}
}
