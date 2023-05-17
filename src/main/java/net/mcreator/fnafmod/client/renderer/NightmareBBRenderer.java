
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.NightmareBBEntity;
import net.mcreator.fnafmod.client.model.ModelNightmare_Balloon_Boy;

public class NightmareBBRenderer extends MobRenderer<NightmareBBEntity, ModelNightmare_Balloon_Boy<NightmareBBEntity>> {
	public NightmareBBRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmare_Balloon_Boy(context.bakeLayer(ModelNightmare_Balloon_Boy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NightmareBBEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nmmbb.png");
	}
}
