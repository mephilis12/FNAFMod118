
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.Endo02Entity;
import net.mcreator.fnafmod.client.model.ModelEndo02;

public class Endo02Renderer extends MobRenderer<Endo02Entity, ModelEndo02<Endo02Entity>> {
	public Endo02Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelEndo02(context.bakeLayer(ModelEndo02.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Endo02Entity entity) {
		return new ResourceLocation("fnaf_mod:textures/endo02.png");
	}
}
