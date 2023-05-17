
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.JackOBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelNighmare_Bonnie;

public class JackOBonnieRenderer extends MobRenderer<JackOBonnieEntity, ModelNighmare_Bonnie<JackOBonnieEntity>> {
	public JackOBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNighmare_Bonnie(context.bakeLayer(ModelNighmare_Bonnie.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<JackOBonnieEntity, ModelNighmare_Bonnie<JackOBonnieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/jack_o_bonnie_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(JackOBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/jack_o_bonnie.png");
	}
}
