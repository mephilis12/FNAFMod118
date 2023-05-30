
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.NightmareFreddyModel;
import net.mcreator.fnafmod.entity.layer.NightmareFreddyLayer;
import net.mcreator.fnafmod.entity.NightmareFreddyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NightmareFreddyRenderer extends GeoEntityRenderer<NightmareFreddyEntity> {
	public NightmareFreddyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new NightmareFreddyModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new NightmareFreddyLayer(this));
	}

	@Override
	public RenderType getRenderType(NightmareFreddyEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
