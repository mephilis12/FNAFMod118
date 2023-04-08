
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.ChicaChickenModel;
import net.mcreator.fnafmod.entity.ChicaChickenEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ChicaChickenRenderer extends GeoEntityRenderer<ChicaChickenEntity> {
	public ChicaChickenRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ChicaChickenModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(ChicaChickenEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
