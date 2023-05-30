
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.ShadowFreddyStandingModel;
import net.mcreator.fnafmod.entity.layer.ShadowFreddyStandingLayer;
import net.mcreator.fnafmod.entity.ShadowFreddyStandingEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShadowFreddyStandingRenderer extends GeoEntityRenderer<ShadowFreddyStandingEntity> {
	public ShadowFreddyStandingRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ShadowFreddyStandingModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new ShadowFreddyStandingLayer(this));
	}

	@Override
	public RenderType getRenderType(ShadowFreddyStandingEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
