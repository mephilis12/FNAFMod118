
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.StatueBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelDaytime_Bonnie;

public class StatueBonnieRenderer extends MobRenderer<StatueBonnieEntity, ModelDaytime_Bonnie<StatueBonnieEntity>> {
	public StatueBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDaytime_Bonnie(context.bakeLayer(ModelDaytime_Bonnie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StatueBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/fnaf_1_bonnie_daytime.png");
	}
}
