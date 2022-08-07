
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.FredbearCreatureEntity;
import net.mcreator.fnafmod.client.model.ModelFredbear;

public class FredbearCreatureRenderer extends MobRenderer<FredbearCreatureEntity, ModelFredbear<FredbearCreatureEntity>> {
	public FredbearCreatureRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFredbear(context.bakeLayer(ModelFredbear.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FredbearCreatureEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/fredbear.png");
	}
}
