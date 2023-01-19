
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.UnwitheredChicaCutoutEntity;
import net.mcreator.fnafmod.client.model.ModelFredbear_Cutout;

public class UnwitheredChicaCutoutRenderer extends MobRenderer<UnwitheredChicaCutoutEntity, ModelFredbear_Cutout<UnwitheredChicaCutoutEntity>> {
	public UnwitheredChicaCutoutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFredbear_Cutout(context.bakeLayer(ModelFredbear_Cutout.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnwitheredChicaCutoutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/unwitheredchica_cutout.png");
	}
}
