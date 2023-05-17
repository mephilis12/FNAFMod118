package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightOrangeOffBlockModel;
import net.mcreator.fnafmod.block.entity.StageLightOrangeOffTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StageLightOrangeOffTileRenderer extends GeoBlockRenderer<StageLightOrangeOffTileEntity> {
	public StageLightOrangeOffTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new StageLightOrangeOffBlockModel());
	}

	@Override
	public RenderType getRenderType(StageLightOrangeOffTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
