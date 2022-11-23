
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.NightmarioneStatueEntity;
import net.mcreator.fnafmod.client.model.Modelnightmarionne_statue;

public class NightmarioneStatueRenderer extends MobRenderer<NightmarioneStatueEntity, Modelnightmarionne_statue<NightmarioneStatueEntity>> {
	public NightmarioneStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnightmarionne_statue(context.bakeLayer(Modelnightmarionne_statue.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmarioneStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmarionne.png");
	}
}
