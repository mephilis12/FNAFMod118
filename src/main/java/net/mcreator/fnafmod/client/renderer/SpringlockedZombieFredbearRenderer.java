
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.fnafmod.entity.SpringlockedZombieFredbearEntity;

public class SpringlockedZombieFredbearRenderer extends HumanoidMobRenderer<SpringlockedZombieFredbearEntity, HumanoidModel<SpringlockedZombieFredbearEntity>> {
	public SpringlockedZombieFredbearRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(SpringlockedZombieFredbearEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/springlocked_zombie.png");
	}
}
