
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.DayTimeBBModel;
import net.mcreator.fnafmod.entity.DayTimeBBEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DayTimeBBRenderer extends GeoEntityRenderer<DayTimeBBEntity> {
	public DayTimeBBRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new DayTimeBBModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(DayTimeBBEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
