
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.PatPatEntity;
import net.mcreator.fnafmod.client.model.ModelPatPat;

public class PatPatRenderer extends MobRenderer<PatPatEntity, ModelPatPat<PatPatEntity>> {
	public PatPatRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPatPat(context.bakeLayer(ModelPatPat.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<PatPatEntity, ModelPatPat<PatPatEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/patpat_e.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PatPatEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/patpat.png");
	}
}
