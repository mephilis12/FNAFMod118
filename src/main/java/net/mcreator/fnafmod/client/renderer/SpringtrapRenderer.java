
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SpringtrapEntity;
import net.mcreator.fnafmod.client.model.ModelSpringtrap;

public class SpringtrapRenderer extends MobRenderer<SpringtrapEntity, ModelSpringtrap<SpringtrapEntity>> {
	public SpringtrapRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpringtrap(context.bakeLayer(ModelSpringtrap.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/springtrap.png");
	}
}
