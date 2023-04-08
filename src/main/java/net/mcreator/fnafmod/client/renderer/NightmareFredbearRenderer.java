
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.NightmareFredbearEntity;
import net.mcreator.fnafmod.client.model.ModelNightmareFredbear;

public class NightmareFredbearRenderer extends MobRenderer<NightmareFredbearEntity, ModelNightmareFredbear<NightmareFredbearEntity>> {
	public NightmareFredbearRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmareFredbear(context.bakeLayer(ModelNightmareFredbear.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<NightmareFredbearEntity, ModelNightmareFredbear<NightmareFredbearEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/nightmare_fredbear_eye_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmare_fredbear.png");
	}
}
