
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.BonnieStandEntity;
import net.mcreator.fnafmod.client.model.ModelBonnieStand;

public class BonnieStandRenderer extends MobRenderer<BonnieStandEntity, ModelBonnieStand<BonnieStandEntity>> {
	public BonnieStandRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBonnieStand(context.bakeLayer(ModelBonnieStand.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BonnieStandEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/bonniestand.png");
	}
}
