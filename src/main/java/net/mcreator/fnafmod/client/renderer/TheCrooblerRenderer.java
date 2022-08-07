
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.TheCrooblerEntity;
import net.mcreator.fnafmod.client.model.ModelThe_Croobler;

public class TheCrooblerRenderer extends MobRenderer<TheCrooblerEntity, ModelThe_Croobler<TheCrooblerEntity>> {
	public TheCrooblerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelThe_Croobler(context.bakeLayer(ModelThe_Croobler.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TheCrooblerEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/the_croobler.png");
	}
}
