package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.BephDollDisplayModel;
import net.mcreator.fnafmod.block.display.BephDollDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BephDollDisplayItemRenderer extends GeoItemRenderer<BephDollDisplayItem> {
	public BephDollDisplayItemRenderer() {
		super(new BephDollDisplayModel());
	}

	@Override
	public RenderType getRenderType(BephDollDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
