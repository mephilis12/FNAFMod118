
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.SittingFredbearEntity;
import net.mcreator.fnafmod.client.model.Modelsitting_fredbear;

public class SittingFredbearRenderer extends MobRenderer<SittingFredbearEntity, Modelsitting_fredbear<SittingFredbearEntity>> {
	public SittingFredbearRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsitting_fredbear(context.bakeLayer(Modelsitting_fredbear.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SittingFredbearEntity, Modelsitting_fredbear<SittingFredbearEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/freddy_model_white_eye_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SittingFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/sitting_fredbear.png");
	}
}
