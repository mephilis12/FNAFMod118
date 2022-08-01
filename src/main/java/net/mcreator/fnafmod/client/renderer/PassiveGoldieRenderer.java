
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.PassiveGoldieEntity;
import net.mcreator.fnafmod.client.model.ModelFreddyFazbear;

public class PassiveGoldieRenderer extends MobRenderer<PassiveGoldieEntity, ModelFreddyFazbear<PassiveGoldieEntity>> {
	public PassiveGoldieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFreddyFazbear(context.bakeLayer(ModelFreddyFazbear.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PassiveGoldieEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/golden_freddy_normal_eyes.png");
	}
}
