
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.NightmarionneModel;
import net.mcreator.fnafmod.entity.layer.NightmarionneLayer;
import net.mcreator.fnafmod.entity.NightmarionneEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NightmarionneRenderer extends GeoEntityRenderer<NightmarionneEntity> {
	public NightmarionneRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new NightmarionneModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new NightmarionneLayer(this));
	}

	@Override
	public RenderType getRenderType(NightmarionneEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
