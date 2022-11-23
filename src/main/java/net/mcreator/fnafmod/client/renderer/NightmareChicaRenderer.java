
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.NightmareChicaEntity;
import net.mcreator.fnafmod.client.model.ModelNightmare_Chica;

public class NightmareChicaRenderer extends MobRenderer<NightmareChicaEntity, ModelNightmare_Chica<NightmareChicaEntity>> {
	public NightmareChicaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmare_Chica(context.bakeLayer(ModelNightmare_Chica.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<NightmareChicaEntity, ModelNightmare_Chica<NightmareChicaEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/nightmare_chica_eye_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareChicaEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmare_chica.png");
	}
}
