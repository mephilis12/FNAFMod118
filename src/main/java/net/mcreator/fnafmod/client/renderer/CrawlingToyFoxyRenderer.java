
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.CrawlingToyFoxyEntity;
import net.mcreator.fnafmod.client.model.ModelCrawling_Toy_Foxy;

public class CrawlingToyFoxyRenderer extends MobRenderer<CrawlingToyFoxyEntity, ModelCrawling_Toy_Foxy<CrawlingToyFoxyEntity>> {
	public CrawlingToyFoxyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCrawling_Toy_Foxy(context.bakeLayer(ModelCrawling_Toy_Foxy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrawlingToyFoxyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/toy_foxy.png");
	}
}
