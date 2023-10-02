package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FreddySignOffDisplayModel;
import net.mcreator.fnafmod.block.display.FreddySignOffDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FreddySignOffDisplayItemRenderer extends GeoItemRenderer<FreddySignOffDisplayItem> {
	public FreddySignOffDisplayItemRenderer() {
		super(new FreddySignOffDisplayModel());
	}

	@Override
	public RenderType getRenderType(FreddySignOffDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
