
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.BBEntity;
import net.mcreator.fnafmod.client.model.ModelBB;

public class BBRenderer extends MobRenderer<BBEntity, ModelBB<BBEntity>> {
	public BBRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBB(context.bakeLayer(ModelBB.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BBEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/balloonboytexture.png");
	}
}
