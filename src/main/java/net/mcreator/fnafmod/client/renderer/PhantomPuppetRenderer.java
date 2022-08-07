
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.PhantomPuppetEntity;
import net.mcreator.fnafmod.client.model.Modelpuppet;

public class PhantomPuppetRenderer extends MobRenderer<PhantomPuppetEntity, Modelpuppet<PhantomPuppetEntity>> {
	public PhantomPuppetRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpuppet(context.bakeLayer(Modelpuppet.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PhantomPuppetEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/phantom_puppet.png");
	}
}
