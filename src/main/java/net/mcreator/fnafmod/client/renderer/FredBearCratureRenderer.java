
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.FredBearCratureEntity;
import net.mcreator.fnafmod.client.model.ModelFredbear;

public class FredBearCratureRenderer extends MobRenderer<FredBearCratureEntity, ModelFredbear<FredBearCratureEntity>> {
	public FredBearCratureRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFredbear(context.bakeLayer(ModelFredbear.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FredBearCratureEntity, ModelFredbear<FredBearCratureEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/freddy_model_white_eye_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FredBearCratureEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/sitting_fredbear.png");
	}
}
