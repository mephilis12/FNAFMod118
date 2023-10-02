package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.FreddySignOnDisplayModel;
import net.mcreator.fnafmod.block.display.FreddySignOnDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FreddySignOnDisplayItemRenderer extends GeoItemRenderer<FreddySignOnDisplayItem> {
	public FreddySignOnDisplayItemRenderer() {
		super(new FreddySignOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(FreddySignOnDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
