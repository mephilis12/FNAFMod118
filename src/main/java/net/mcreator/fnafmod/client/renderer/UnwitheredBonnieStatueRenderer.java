
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.UnwitheredBonnieStatueEntity;
import net.mcreator.fnafmod.client.model.ModelUnwithered_Bonnie_Posed;

public class UnwitheredBonnieStatueRenderer
		extends
			MobRenderer<UnwitheredBonnieStatueEntity, ModelUnwithered_Bonnie_Posed<UnwitheredBonnieStatueEntity>> {
	public UnwitheredBonnieStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelUnwithered_Bonnie_Posed(context.bakeLayer(ModelUnwithered_Bonnie_Posed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnwitheredBonnieStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/unwithered_bonnie.png");
	}
}
