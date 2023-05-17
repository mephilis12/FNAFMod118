
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.JackOChicaEntity;
import net.mcreator.fnafmod.client.model.ModelNightmare_Chica;

public class JackOChicaRenderer extends MobRenderer<JackOChicaEntity, ModelNightmare_Chica<JackOChicaEntity>> {
	public JackOChicaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmare_Chica(context.bakeLayer(ModelNightmare_Chica.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<JackOChicaEntity, ModelNightmare_Chica<JackOChicaEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/jack_o_chica_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(JackOChicaEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/jack_o_chica.png");
	}
}
