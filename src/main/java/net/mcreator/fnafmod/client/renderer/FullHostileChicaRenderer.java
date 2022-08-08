
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.FullHostileChicaEntity;
import net.mcreator.fnafmod.client.model.ModelChica;

public class FullHostileChicaRenderer extends MobRenderer<FullHostileChicaEntity, ModelChica<FullHostileChicaEntity>> {
	public FullHostileChicaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelChica(context.bakeLayer(ModelChica.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FullHostileChicaEntity, ModelChica<FullHostileChicaEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/freddy_spooky_eyes_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FullHostileChicaEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/spooky_eye_chica.png");
	}
}
