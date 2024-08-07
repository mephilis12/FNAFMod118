
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.JackOBonnieModel;
import net.mcreator.fnafmod.entity.layer.JackOBonnieLayer;
import net.mcreator.fnafmod.entity.JackOBonnieEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class JackOBonnieRenderer extends GeoEntityRenderer<JackOBonnieEntity> {
	public JackOBonnieRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new JackOBonnieModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new JackOBonnieLayer(this));
	}

	@Override
	public RenderType getRenderType(JackOBonnieEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
