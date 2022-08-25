
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.DayTimeToyBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelToy_Bonnie_Day;

public class DayTimeToyBonnieRenderer extends MobRenderer<DayTimeToyBonnieEntity, ModelToy_Bonnie_Day<DayTimeToyBonnieEntity>> {
	public DayTimeToyBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelToy_Bonnie_Day(context.bakeLayer(ModelToy_Bonnie_Day.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DayTimeToyBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/toy_bonnie.png");
	}
}
