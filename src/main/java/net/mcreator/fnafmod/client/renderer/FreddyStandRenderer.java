
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.FreddyStandEntity;
import net.mcreator.fnafmod.client.model.ModelStandFreddly;

public class FreddyStandRenderer extends MobRenderer<FreddyStandEntity, ModelStandFreddly<FreddyStandEntity>> {
	public FreddyStandRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStandFreddly(context.bakeLayer(ModelStandFreddly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FreddyStandEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/freddystand.png");
	}
}
