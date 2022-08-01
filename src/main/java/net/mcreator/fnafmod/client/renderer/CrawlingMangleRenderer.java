
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.CrawlingMangleEntity;
import net.mcreator.fnafmod.client.model.ModelCrawling_Mangle;

public class CrawlingMangleRenderer extends MobRenderer<CrawlingMangleEntity, ModelCrawling_Mangle<CrawlingMangleEntity>> {
	public CrawlingMangleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCrawling_Mangle(context.bakeLayer(ModelCrawling_Mangle.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CrawlingMangleEntity, ModelCrawling_Mangle<CrawlingMangleEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/eyemangle.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CrawlingMangleEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/mangle.png");
	}
}
