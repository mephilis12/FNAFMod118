
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.BonnieBunnyEntity;
import net.mcreator.fnafmod.client.model.ModelBonnie_The_Bunny;

public class BonnieBunnyRenderer extends MobRenderer<BonnieBunnyEntity, ModelBonnie_The_Bunny<BonnieBunnyEntity>> {
	public BonnieBunnyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBonnie_The_Bunny(context.bakeLayer(ModelBonnie_The_Bunny.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BonnieBunnyEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/bonnie_the_bunny.png");
	}
}
