
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SittingWitheredBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelSittingWitheredBonnie;

public class SittingWitheredBonnieRenderer extends MobRenderer<SittingWitheredBonnieEntity, ModelSittingWitheredBonnie<SittingWitheredBonnieEntity>> {
	public SittingWitheredBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSittingWitheredBonnie(context.bakeLayer(ModelSittingWitheredBonnie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SittingWitheredBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/witheredbonnietexture.png");
	}
}
