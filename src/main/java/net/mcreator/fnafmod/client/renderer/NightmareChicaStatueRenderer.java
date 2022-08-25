
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.NightmareChicaStatueEntity;
import net.mcreator.fnafmod.client.model.ModelNightmare_Chica_Statue;

public class NightmareChicaStatueRenderer extends MobRenderer<NightmareChicaStatueEntity, ModelNightmare_Chica_Statue<NightmareChicaStatueEntity>> {
	public NightmareChicaStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmare_Chica_Statue(context.bakeLayer(ModelNightmare_Chica_Statue.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareChicaStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmare_chica.png");
	}
}
