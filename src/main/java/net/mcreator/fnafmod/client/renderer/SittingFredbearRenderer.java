
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.SittingFredbearModel;
import net.mcreator.fnafmod.entity.layer.SittingFredbearLayer;
import net.mcreator.fnafmod.entity.SittingFredbearEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SittingFredbearRenderer extends GeoEntityRenderer<SittingFredbearEntity> {
	public SittingFredbearRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SittingFredbearModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new SittingFredbearLayer(this));
	}

	@Override
	public RenderType getRenderType(SittingFredbearEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
