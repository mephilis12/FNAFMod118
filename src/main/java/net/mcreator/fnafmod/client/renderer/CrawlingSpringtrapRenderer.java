
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.CrawlingSpringtrapEntity;
import net.mcreator.fnafmod.client.model.ModelCrawling_Springtrap;

public class CrawlingSpringtrapRenderer extends MobRenderer<CrawlingSpringtrapEntity, ModelCrawling_Springtrap<CrawlingSpringtrapEntity>> {
	public CrawlingSpringtrapRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCrawling_Springtrap(context.bakeLayer(ModelCrawling_Springtrap.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrawlingSpringtrapEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/springtrap.png");
	}
}
