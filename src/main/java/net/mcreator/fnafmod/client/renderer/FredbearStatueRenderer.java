
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.FredbearStatueEntity;
import net.mcreator.fnafmod.client.model.ModelFredbearFNAF4;

public class FredbearStatueRenderer extends MobRenderer<FredbearStatueEntity, ModelFredbearFNAF4<FredbearStatueEntity>> {
	public FredbearStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFredbearFNAF4(context.bakeLayer(ModelFredbearFNAF4.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FredbearStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/fredbear4.png");
	}
}
