
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.ShadowFreddyStandingEntity;
import net.mcreator.fnafmod.client.model.ModelFreddyFazbear;

public class ShadowFreddyStandingRenderer extends MobRenderer<ShadowFreddyStandingEntity, ModelFreddyFazbear<ShadowFreddyStandingEntity>> {
	public ShadowFreddyStandingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFreddyFazbear(context.bakeLayer(ModelFreddyFazbear.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<ShadowFreddyStandingEntity, ModelFreddyFazbear<ShadowFreddyStandingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/shadow_freddy_white_eye_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowFreddyStandingEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/shadow_freddy.png");
	}
}
