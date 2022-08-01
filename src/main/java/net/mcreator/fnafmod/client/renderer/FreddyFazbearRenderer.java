
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.FreddyFazbearEntity;
import net.mcreator.fnafmod.client.model.ModelFreddyFazbear;

public class FreddyFazbearRenderer extends MobRenderer<FreddyFazbearEntity, ModelFreddyFazbear<FreddyFazbearEntity>> {
	public FreddyFazbearRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFreddyFazbear(context.bakeLayer(ModelFreddyFazbear.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FreddyFazbearEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/freddyfazbeartexture.png");
	}
}
