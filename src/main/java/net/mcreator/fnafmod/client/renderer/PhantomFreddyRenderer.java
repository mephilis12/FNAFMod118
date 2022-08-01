
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.PhantomFreddyEntity;
import net.mcreator.fnafmod.client.model.ModelPhantom_Freddy;

public class PhantomFreddyRenderer extends MobRenderer<PhantomFreddyEntity, ModelPhantom_Freddy<PhantomFreddyEntity>> {
	public PhantomFreddyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPhantom_Freddy(context.bakeLayer(ModelPhantom_Freddy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PhantomFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/phantom_freddy.png");
	}
}
