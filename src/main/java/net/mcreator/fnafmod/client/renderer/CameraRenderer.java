
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fnafmod.entity.CameraEntity;
import net.mcreator.fnafmod.client.model.Modelcamera;

public class CameraRenderer extends MobRenderer<CameraEntity, Modelcamera<CameraEntity>> {
	public CameraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcamera(context.bakeLayer(Modelcamera.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CameraEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/camera.png");
	}
}
