
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.OfficeChairEntity;
import net.mcreator.fnafmod.client.model.Modeloffice_chair_dark;

public class OfficeChairRenderer extends MobRenderer<OfficeChairEntity, Modeloffice_chair_dark<OfficeChairEntity>> {
	public OfficeChairRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeloffice_chair_dark(context.bakeLayer(Modeloffice_chair_dark.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OfficeChairEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/office_chair_texture.png");
	}
}
