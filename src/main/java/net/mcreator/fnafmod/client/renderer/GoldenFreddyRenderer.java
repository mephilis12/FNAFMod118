
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.GoldenFreddyEntity;
import net.mcreator.fnafmod.client.model.Modelgolden_freddy;

public class GoldenFreddyRenderer extends MobRenderer<GoldenFreddyEntity, Modelgolden_freddy<GoldenFreddyEntity>> {
	public GoldenFreddyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgolden_freddy(context.bakeLayer(Modelgolden_freddy.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<GoldenFreddyEntity, Modelgolden_freddy<GoldenFreddyEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/freddy_model_white_eye_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GoldenFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/real_golden_freddy.png");
	}
}
