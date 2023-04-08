
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.FredbearAnimatronicModel;
import net.mcreator.fnafmod.entity.FredbearAnimatronicEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FredbearAnimatronicRenderer extends GeoEntityRenderer<FredbearAnimatronicEntity> {
	public FredbearAnimatronicRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FredbearAnimatronicModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(FredbearAnimatronicEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
