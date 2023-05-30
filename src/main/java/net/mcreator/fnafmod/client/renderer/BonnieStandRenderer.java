
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.BonnieStandEntity;
import net.mcreator.fnafmod.client.model.ModelStandBonnie;

public class BonnieStandRenderer extends MobRenderer<BonnieStandEntity, ModelStandBonnie<BonnieStandEntity>> {
	public BonnieStandRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStandBonnie(context.bakeLayer(ModelStandBonnie.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<BonnieStandEntity, ModelStandBonnie<BonnieStandEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/bonniestandemissive.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BonnieStandEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/bonniestand.png");
	}
}
