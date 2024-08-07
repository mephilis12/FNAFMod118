
package net.mcreator.fnafmod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.model.AdventureMangleModel;
import net.mcreator.fnafmod.entity.AdventureMangleEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AdventureMangleRenderer extends GeoEntityRenderer<AdventureMangleEntity> {
	public AdventureMangleRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new AdventureMangleModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(AdventureMangleEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
