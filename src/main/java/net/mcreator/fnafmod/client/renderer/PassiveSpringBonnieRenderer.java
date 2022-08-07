
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.PassiveSpringBonnieEntity;
import net.mcreator.fnafmod.client.model.ModelUCN_Spring_Bonnie;

public class PassiveSpringBonnieRenderer extends MobRenderer<PassiveSpringBonnieEntity, ModelUCN_Spring_Bonnie<PassiveSpringBonnieEntity>> {
	public PassiveSpringBonnieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelUCN_Spring_Bonnie(context.bakeLayer(ModelUCN_Spring_Bonnie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PassiveSpringBonnieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/spring_bonnie_fnaf1.png");
	}
}
