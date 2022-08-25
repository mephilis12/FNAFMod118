
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.UnwitheredChicaStatueEntity;
import net.mcreator.fnafmod.client.model.ModelUnwitheredChica_Posed;

public class UnwitheredChicaStatueRenderer extends MobRenderer<UnwitheredChicaStatueEntity, ModelUnwitheredChica_Posed<UnwitheredChicaStatueEntity>> {
	public UnwitheredChicaStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelUnwitheredChica_Posed(context.bakeLayer(ModelUnwitheredChica_Posed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnwitheredChicaStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/unwithered_chica.png");
	}
}
