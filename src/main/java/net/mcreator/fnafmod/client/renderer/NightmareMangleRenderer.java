
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.NightmareMangleModel;
import net.mcreator.fnafmod.entity.layer.NightmareMangleLayer;
import net.mcreator.fnafmod.entity.NightmareMangleEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NightmareMangleRenderer extends GeoEntityRenderer<NightmareMangleEntity> {
	public NightmareMangleRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new NightmareMangleModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new NightmareMangleLayer(this));
	}

	@Override
	public RenderType getRenderType(NightmareMangleEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
