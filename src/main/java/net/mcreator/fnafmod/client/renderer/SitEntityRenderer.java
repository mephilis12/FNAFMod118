
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.SitEntityEntity;
import net.mcreator.fnafmod.client.model.Modeloffice_chair_dark;

public class SitEntityRenderer extends MobRenderer<SitEntityEntity, Modeloffice_chair_dark<SitEntityEntity>> {
	public SitEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeloffice_chair_dark(context.bakeLayer(Modeloffice_chair_dark.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(SitEntityEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/sitentity.png");
	}
}
