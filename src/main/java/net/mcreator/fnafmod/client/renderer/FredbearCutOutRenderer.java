
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.FredbearCutOutEntity;
import net.mcreator.fnafmod.client.model.ModelCutoutFredbear;

public class FredbearCutOutRenderer extends MobRenderer<FredbearCutOutEntity, ModelCutoutFredbear<FredbearCutOutEntity>> {
	public FredbearCutOutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCutoutFredbear(context.bakeLayer(ModelCutoutFredbear.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FredbearCutOutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/fredbear_cutout.png");
	}
}
