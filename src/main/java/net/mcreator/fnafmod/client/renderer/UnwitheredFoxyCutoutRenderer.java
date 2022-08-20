
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.UnwitheredFoxyCutoutEntity;
import net.mcreator.fnafmod.client.model.ModelFredbear_Cutout;

public class UnwitheredFoxyCutoutRenderer extends MobRenderer<UnwitheredFoxyCutoutEntity, ModelFredbear_Cutout<UnwitheredFoxyCutoutEntity>> {
	public UnwitheredFoxyCutoutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFredbear_Cutout(context.bakeLayer(ModelFredbear_Cutout.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnwitheredFoxyCutoutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/unwitheredfoxy_cutout.png");
	}
}
