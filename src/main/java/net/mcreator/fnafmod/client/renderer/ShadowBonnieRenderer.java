
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.ShadowBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelToy_Bonnie;

public class ShadowBonnieRenderer extends MobRenderer<ShadowBonnieEntity, ModelToy_Bonnie<ShadowBonnieEntity>> {
	public ShadowBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelToy_Bonnie(context.bakeLayer(ModelToy_Bonnie.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<ShadowBonnieEntity, ModelToy_Bonnie<ShadowBonnieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/shadow_bonnie_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/shadow_bonnie.png");
	}
}
