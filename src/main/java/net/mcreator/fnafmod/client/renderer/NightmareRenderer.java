
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.NightmareEntity;
import net.mcreator.fnafmod.client.model.ModelNightmareFredbear;

public class NightmareRenderer extends MobRenderer<NightmareEntity, ModelNightmareFredbear<NightmareEntity>> {
	public NightmareRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmareFredbear(context.bakeLayer(ModelNightmareFredbear.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<NightmareEntity, ModelNightmareFredbear<NightmareEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/nightmare_fredbear_eye_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmare.png");
	}
}
