
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.NightimeToyChicaModel;
import net.mcreator.fnafmod.entity.layer.NightimeToyChicaLayer;
import net.mcreator.fnafmod.entity.NightimeToyChicaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NightimeToyChicaRenderer extends GeoEntityRenderer<NightimeToyChicaEntity> {
	public NightimeToyChicaRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new NightimeToyChicaModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new NightimeToyChicaLayer(this));
	}

	@Override
	public RenderType getRenderType(NightimeToyChicaEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
