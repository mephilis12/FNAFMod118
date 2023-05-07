
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.NightmareFreddyEntity;
import net.mcreator.fnafmod.client.model.ModelNightmare_Freddy;

public class NightmareFreddyRenderer extends MobRenderer<NightmareFreddyEntity, ModelNightmare_Freddy<NightmareFreddyEntity>> {
	public NightmareFreddyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmare_Freddy(context.bakeLayer(ModelNightmare_Freddy.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<NightmareFreddyEntity, ModelNightmare_Freddy<NightmareFreddyEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/nightmare_freddy_eye_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmarefreddy.png");
	}
}
