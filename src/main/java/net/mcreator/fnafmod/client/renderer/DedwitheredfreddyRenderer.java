
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.DedwitheredfreddyEntity;
import net.mcreator.fnafmod.client.model.ModelWithered_Freddy_Daytime;

public class DedwitheredfreddyRenderer extends MobRenderer<DedwitheredfreddyEntity, ModelWithered_Freddy_Daytime<DedwitheredfreddyEntity>> {
	public DedwitheredfreddyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWithered_Freddy_Daytime(context.bakeLayer(ModelWithered_Freddy_Daytime.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DedwitheredfreddyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/witheredfreddytexture.png");
	}
}
