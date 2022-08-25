
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.NightimeToyChicaEntity;
import net.mcreator.fnafmod.client.model.ModelToy_Chica;

public class NightimeToyChicaRenderer extends MobRenderer<NightimeToyChicaEntity, ModelToy_Chica<NightimeToyChicaEntity>> {
	public NightimeToyChicaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelToy_Chica(context.bakeLayer(ModelToy_Chica.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<NightimeToyChicaEntity, ModelToy_Chica<NightimeToyChicaEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/toy_chica_night_eye_spooky.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NightimeToyChicaEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/toy_chica_night.png");
	}
}
