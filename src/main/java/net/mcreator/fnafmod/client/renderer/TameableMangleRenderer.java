
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.TameableMangleModel;
import net.mcreator.fnafmod.entity.TameableMangleEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TameableMangleRenderer extends GeoEntityRenderer<TameableMangleEntity> {
	public TameableMangleRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TameableMangleModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(TameableMangleEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
