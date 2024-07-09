package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.RetroFreddySignDisplayModel;
import net.mcreator.fnafmod.block.display.RetroFreddySignDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RetroFreddySignDisplayItemRenderer extends GeoItemRenderer<RetroFreddySignDisplayItem> {
	public RetroFreddySignDisplayItemRenderer() {
		super(new RetroFreddySignDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroFreddySignDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
