
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.ToyFreddyEntity;
import net.mcreator.fnafmod.client.model.ModelToy_Freddy;

public class ToyFreddyRenderer extends MobRenderer<ToyFreddyEntity, ModelToy_Freddy<ToyFreddyEntity>> {
	public ToyFreddyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelToy_Freddy(context.bakeLayer(ModelToy_Freddy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ToyFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/toy_freddy.png");
	}
}
