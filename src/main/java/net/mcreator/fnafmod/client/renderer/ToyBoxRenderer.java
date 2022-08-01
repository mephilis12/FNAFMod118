
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.ToyBoxEntity;
import net.mcreator.fnafmod.client.model.Modeltoybox;

public class ToyBoxRenderer extends MobRenderer<ToyBoxEntity, Modeltoybox<ToyBoxEntity>> {
	public ToyBoxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltoybox(context.bakeLayer(Modeltoybox.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ToyBoxEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/toybox.png");
	}
}
