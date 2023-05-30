
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.MangleSittingModel;
import net.mcreator.fnafmod.entity.MangleSittingEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MangleSittingRenderer extends GeoEntityRenderer<MangleSittingEntity> {
	public MangleSittingRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MangleSittingModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(MangleSittingEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
