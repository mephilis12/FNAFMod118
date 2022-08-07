
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.PhantomFoxyEntity;
import net.mcreator.fnafmod.client.model.ModelPhantom_Foxy;

public class PhantomFoxyRenderer extends MobRenderer<PhantomFoxyEntity, ModelPhantom_Foxy<PhantomFoxyEntity>> {
	public PhantomFoxyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPhantom_Foxy(context.bakeLayer(ModelPhantom_Foxy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PhantomFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/phantom_foxy.png");
	}
}
