
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.WitheredBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelWithered_Bonnie;

public class WitheredBonnieRenderer extends MobRenderer<WitheredBonnieEntity, ModelWithered_Bonnie<WitheredBonnieEntity>> {
	public WitheredBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWithered_Bonnie(context.bakeLayer(ModelWithered_Bonnie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WitheredBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/witheredbonnietexture.png");
	}
}
