
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.UnwitheredFreddyCutoutEntity;
import net.mcreator.fnafmod.client.model.ModelFredbear_Cutout;

public class UnwitheredFreddyCutoutRenderer extends MobRenderer<UnwitheredFreddyCutoutEntity, ModelFredbear_Cutout<UnwitheredFreddyCutoutEntity>> {
	public UnwitheredFreddyCutoutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFredbear_Cutout(context.bakeLayer(ModelFredbear_Cutout.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnwitheredFreddyCutoutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/unwitheredfreddy_cutout.png");
	}
}
