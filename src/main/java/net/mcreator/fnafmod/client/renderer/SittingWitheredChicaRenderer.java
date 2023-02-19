
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.SittingWitheredChicaModel;
import net.mcreator.fnafmod.entity.SittingWitheredChicaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SittingWitheredChicaRenderer extends GeoEntityRenderer<SittingWitheredChicaEntity> {
	public SittingWitheredChicaRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SittingWitheredChicaModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(SittingWitheredChicaEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		if (!animatable.isBaby())
			stack.scale(1.0F, 1.0F, 1.0F);
		else
			stack.scale(0.5F, 0.5F, 0.5F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
