
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.NightmareBonnieModel;
import net.mcreator.fnafmod.entity.layer.NightmareBonnieLayer;
import net.mcreator.fnafmod.entity.NightmareBonnieEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NightmareBonnieRenderer extends GeoEntityRenderer<NightmareBonnieEntity> {
	public NightmareBonnieRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new NightmareBonnieModel());
		this.shadowRadius = 0.5f;
		this.addLayer(new NightmareBonnieLayer(this));
	}

	@Override
	public RenderType getRenderType(NightmareBonnieEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
