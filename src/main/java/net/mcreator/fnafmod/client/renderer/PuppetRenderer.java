
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.PuppetEntity;
import net.mcreator.fnafmod.client.model.Modelpuppet;

public class PuppetRenderer extends MobRenderer<PuppetEntity, Modelpuppet<PuppetEntity>> {
	public PuppetRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpuppet(context.bakeLayer(Modelpuppet.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PuppetEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/puppet.png");
	}
}
