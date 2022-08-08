
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.ToyBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelToy_Bonnie;

public class ToyBonnieRenderer extends MobRenderer<ToyBonnieEntity, ModelToy_Bonnie<ToyBonnieEntity>> {
	public ToyBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelToy_Bonnie(context.bakeLayer(ModelToy_Bonnie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ToyBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/toy_bonnie.png");
	}
}
