
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.NightmareBonnieStatueEntity;
import net.mcreator.fnafmod.client.model.ModelNightmare_Bonnie_Statue;

public class NightmareBonnieStatueRenderer
		extends
			MobRenderer<NightmareBonnieStatueEntity, ModelNightmare_Bonnie_Statue<NightmareBonnieStatueEntity>> {
	public NightmareBonnieStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmare_Bonnie_Statue(context.bakeLayer(ModelNightmare_Bonnie_Statue.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareBonnieStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmare_bonnie.png");
	}
}
