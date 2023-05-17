
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.NightmareMangleEntity;
import net.mcreator.fnafmod.client.model.Modelnightmare_mangle;

public class NightmareMangleRenderer extends MobRenderer<NightmareMangleEntity, Modelnightmare_mangle<NightmareMangleEntity>> {
	public NightmareMangleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnightmare_mangle(context.bakeLayer(Modelnightmare_mangle.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<NightmareMangleEntity, Modelnightmare_mangle<NightmareMangleEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/nootmangleemissive.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareMangleEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nmmangul.png");
	}
}
