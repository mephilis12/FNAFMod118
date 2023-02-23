
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.NightmareFreddyStatueEntity;
import net.mcreator.fnafmod.client.model.ModelNightmare_Freddy_Statue;

public class NightmareFreddyStatueRenderer extends MobRenderer<NightmareFreddyStatueEntity, ModelNightmare_Freddy_Statue<NightmareFreddyStatueEntity>> {
	public NightmareFreddyStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmare_Freddy_Statue(context.bakeLayer(ModelNightmare_Freddy_Statue.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareFreddyStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmarefreddy.png");
	}
}
