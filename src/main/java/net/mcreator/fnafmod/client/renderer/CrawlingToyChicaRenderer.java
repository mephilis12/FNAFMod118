
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.CrawlingToyChicaEntity;
import net.mcreator.fnafmod.client.model.ModelCrawling_Toy_Chica;

public class CrawlingToyChicaRenderer extends MobRenderer<CrawlingToyChicaEntity, ModelCrawling_Toy_Chica<CrawlingToyChicaEntity>> {
	public CrawlingToyChicaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCrawling_Toy_Chica(context.bakeLayer(ModelCrawling_Toy_Chica.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CrawlingToyChicaEntity, ModelCrawling_Toy_Chica<CrawlingToyChicaEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/toy_chica_night_eye_spooky.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CrawlingToyChicaEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/toy_chica_night.png");
	}
}
