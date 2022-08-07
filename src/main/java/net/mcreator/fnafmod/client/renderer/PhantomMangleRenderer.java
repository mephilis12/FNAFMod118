
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.PhantomMangleEntity;
import net.mcreator.fnafmod.client.model.ModelMangle;

public class PhantomMangleRenderer extends MobRenderer<PhantomMangleEntity, ModelMangle<PhantomMangleEntity>> {
	public PhantomMangleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMangle(context.bakeLayer(ModelMangle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PhantomMangleEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/phantom_mangle.png");
	}
}
