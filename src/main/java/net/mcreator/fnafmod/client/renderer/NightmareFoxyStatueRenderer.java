
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.NightmareFoxyStatueEntity;
import net.mcreator.fnafmod.client.model.ModelNighmare_Foxy_Statue;

public class NightmareFoxyStatueRenderer extends MobRenderer<NightmareFoxyStatueEntity, ModelNighmare_Foxy_Statue<NightmareFoxyStatueEntity>> {
	public NightmareFoxyStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNighmare_Foxy_Statue(context.bakeLayer(ModelNighmare_Foxy_Statue.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareFoxyStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmare_foxy.png");
	}
}
