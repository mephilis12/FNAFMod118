
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.MangleEntity;
import net.mcreator.fnafmod.client.model.ModelMangle;

public class MangleRenderer extends MobRenderer<MangleEntity, ModelMangle<MangleEntity>> {
	public MangleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMangle(context.bakeLayer(ModelMangle.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MangleEntity, ModelMangle<MangleEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/eyemangle.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MangleEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/mangle.png");
	}
}
