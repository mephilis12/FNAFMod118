
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.FullHostileFreddyEntity;
import net.mcreator.fnafmod.client.model.ModelFreddyFazbear;

public class FullHostileFreddyRenderer extends MobRenderer<FullHostileFreddyEntity, ModelFreddyFazbear<FullHostileFreddyEntity>> {
	public FullHostileFreddyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFreddyFazbear(context.bakeLayer(ModelFreddyFazbear.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FullHostileFreddyEntity, ModelFreddyFazbear<FullHostileFreddyEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/freddy_spooky_eyes_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FullHostileFreddyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/freddy_spooky_eyes_texture.png");
	}
}
