package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightPinkOnDisplayModel;
import net.mcreator.fnafmod.block.display.StageLightPinkOnDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StageLightPinkOnDisplayItemRenderer extends GeoItemRenderer<StageLightPinkOnDisplayItem> {
	public StageLightPinkOnDisplayItemRenderer() {
		super(new StageLightPinkOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageLightPinkOnDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
