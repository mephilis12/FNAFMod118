package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.VassDollDisplayModel;
import net.mcreator.fnafmod.block.display.VassDollDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class VassDollDisplayItemRenderer extends GeoItemRenderer<VassDollDisplayItem> {
	public VassDollDisplayItemRenderer() {
		super(new VassDollDisplayModel());
	}

	@Override
	public RenderType getRenderType(VassDollDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
