
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.PhantomBBEntity;
import net.mcreator.fnafmod.client.model.ModelPhantom_BB;

public class PhantomBBRenderer extends MobRenderer<PhantomBBEntity, ModelPhantom_BB<PhantomBBEntity>> {
	public PhantomBBRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPhantom_BB(context.bakeLayer(ModelPhantom_BB.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PhantomBBEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/phantom_bb.png");
	}
}
