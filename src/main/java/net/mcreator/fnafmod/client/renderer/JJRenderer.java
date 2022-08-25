
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.JJEntity;
import net.mcreator.fnafmod.client.model.ModelJJ;

public class JJRenderer extends MobRenderer<JJEntity, ModelJJ<JJEntity>> {
	public JJRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelJJ(context.bakeLayer(ModelJJ.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JJEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/jj.png");
	}
}
