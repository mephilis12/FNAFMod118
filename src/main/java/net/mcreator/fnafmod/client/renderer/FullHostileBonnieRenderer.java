
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.FullHostileBonnieModel;
import net.mcreator.fnafmod.entity.layer.FullHostileBonnieLayer;
import net.mcreator.fnafmod.entity.FullHostileBonnieEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FullHostileBonnieRenderer extends GeoEntityRenderer<FullHostileBonnieEntity> {
	public FullHostileBonnieRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FullHostileBonnieModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new FullHostileBonnieLayer(this));
	}

	@Override
	public RenderType getRenderType(FullHostileBonnieEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
