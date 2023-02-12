
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.UnwitheredBonnieCutoutEntity;
import net.mcreator.fnafmod.client.model.ModelUnwithered_Bonnie_Cutout;

public class UnwitheredBonnieCutoutRenderer extends MobRenderer<UnwitheredBonnieCutoutEntity, ModelUnwithered_Bonnie_Cutout<UnwitheredBonnieCutoutEntity>> {
	public UnwitheredBonnieCutoutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelUnwithered_Bonnie_Cutout(context.bakeLayer(ModelUnwithered_Bonnie_Cutout.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnwitheredBonnieCutoutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/unwithered_bonnie_cutout.png");
	}
}
