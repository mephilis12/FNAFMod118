
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.SecretNightmareFredbearModel;
import net.mcreator.fnafmod.entity.layer.SecretNightmareFredbearLayer;
import net.mcreator.fnafmod.entity.SecretNightmareFredbearEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SecretNightmareFredbearRenderer extends GeoEntityRenderer<SecretNightmareFredbearEntity> {
	public SecretNightmareFredbearRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SecretNightmareFredbearModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new SecretNightmareFredbearLayer(this));
	}

	@Override
	public RenderType getRenderType(SecretNightmareFredbearEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
