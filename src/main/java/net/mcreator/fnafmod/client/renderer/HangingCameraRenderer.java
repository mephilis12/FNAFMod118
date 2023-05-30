
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.HangingCameraEntity;
import net.mcreator.fnafmod.client.model.Modelcamera_hanging_Converted;

public class HangingCameraRenderer extends MobRenderer<HangingCameraEntity, Modelcamera_hanging_Converted<HangingCameraEntity>> {
	public HangingCameraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcamera_hanging_Converted(context.bakeLayer(Modelcamera_hanging_Converted.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HangingCameraEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/camera.png");
	}
}
