
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.PhantomChicaModel;
import net.mcreator.fnafmod.entity.PhantomChicaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PhantomChicaRenderer extends GeoEntityRenderer<PhantomChicaEntity> {
	public PhantomChicaRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PhantomChicaModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(PhantomChicaEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
