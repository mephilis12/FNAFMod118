
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.NightmareBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelNighmare_Bonnie;

public class NightmareBonnieRenderer extends MobRenderer<NightmareBonnieEntity, ModelNighmare_Bonnie<NightmareBonnieEntity>> {
	public NightmareBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNighmare_Bonnie(context.bakeLayer(ModelNighmare_Bonnie.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<NightmareBonnieEntity, ModelNighmare_Bonnie<NightmareBonnieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/nightmare_bonnie_eye_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmare_bonnie.png");
	}
}
