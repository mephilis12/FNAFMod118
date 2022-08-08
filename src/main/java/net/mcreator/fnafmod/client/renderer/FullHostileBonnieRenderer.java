
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.FullHostileBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelBonnie_The_Bunny;

public class FullHostileBonnieRenderer extends MobRenderer<FullHostileBonnieEntity, ModelBonnie_The_Bunny<FullHostileBonnieEntity>> {
	public FullHostileBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBonnie_The_Bunny(context.bakeLayer(ModelBonnie_The_Bunny.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FullHostileBonnieEntity, ModelBonnie_The_Bunny<FullHostileBonnieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/freddy_spooky_eyes_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FullHostileBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/evil_eyes_bonnie.png");
	}
}
