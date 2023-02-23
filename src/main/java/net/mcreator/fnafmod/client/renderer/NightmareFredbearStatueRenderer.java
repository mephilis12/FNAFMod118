
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.NightmareFredbearStatueEntity;
import net.mcreator.fnafmod.client.model.ModelNightmare_Fredbear;

public class NightmareFredbearStatueRenderer extends MobRenderer<NightmareFredbearStatueEntity, ModelNightmare_Fredbear<NightmareFredbearStatueEntity>> {
	public NightmareFredbearStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmare_Fredbear(context.bakeLayer(ModelNightmare_Fredbear.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareFredbearStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmare_fredbear.png");
	}
}
