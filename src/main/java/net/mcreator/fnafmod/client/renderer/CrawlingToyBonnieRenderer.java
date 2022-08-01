
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.CrawlingToyBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelVent_Toy_Bonnie;

public class CrawlingToyBonnieRenderer extends MobRenderer<CrawlingToyBonnieEntity, ModelVent_Toy_Bonnie<CrawlingToyBonnieEntity>> {
	public CrawlingToyBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVent_Toy_Bonnie(context.bakeLayer(ModelVent_Toy_Bonnie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrawlingToyBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/toy_bonnie.png");
	}
}
