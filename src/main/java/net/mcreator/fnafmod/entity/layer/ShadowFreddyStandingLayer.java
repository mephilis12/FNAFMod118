package net.mcreator.fnafmod.entity.layer;

import software.bernie.geckolib3.renderers.geo.IGeoRenderer;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.PoseStack;

public class ShadowFreddyStandingLayer extends GeoLayerRenderer {
	private static final ResourceLocation LAYER = new ResourceLocation("fnaf_mod", "textures/entities/shadow_freddy_white_eye_glow.png");
	private static final ResourceLocation MODEL = new ResourceLocation("fnaf_mod", "geo/freddyfazbear.geo.json");

	public ShadowFreddyStandingLayer(IGeoRenderer<?> entityRendererIn) {
		super(entityRendererIn);
	}

	@Override
	public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, Entity entityLivingBaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
		RenderType cameo = RenderType.eyes(LAYER);
		matrixStackIn.pushPose();
		matrixStackIn.scale(1.0f, 1.0f, 1.0f);
		matrixStackIn.translate(0.0d, 0.0d, 0.0d);
		this.getRenderer().render(this.getEntityModel().getModel(MODEL), entityLivingBaseIn, partialTicks, cameo, matrixStackIn, bufferIn, bufferIn.getBuffer(cameo), packedLightIn, OverlayTexture.NO_OVERLAY, 1f, 1f, 1f, 1f);
		matrixStackIn.popPose();
	}
}
