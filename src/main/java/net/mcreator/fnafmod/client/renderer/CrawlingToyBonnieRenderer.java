
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.CrawlingToyBonnieModel;
import net.mcreator.fnafmod.entity.CrawlingToyBonnieEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CrawlingToyBonnieRenderer extends GeoEntityRenderer<CrawlingToyBonnieEntity> {
	public CrawlingToyBonnieRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new CrawlingToyBonnieModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(CrawlingToyBonnieEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
