
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.NightmareFoxyModel;
import net.mcreator.fnafmod.entity.layer.NightmareFoxyLayer;
import net.mcreator.fnafmod.entity.NightmareFoxyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NightmareFoxyRenderer extends GeoEntityRenderer<NightmareFoxyEntity> {
	public NightmareFoxyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new NightmareFoxyModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new NightmareFoxyLayer(this));
	}

	@Override
	public RenderType getRenderType(NightmareFoxyEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
