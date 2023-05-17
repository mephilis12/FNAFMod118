package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightOnDisplayModel;
import net.mcreator.fnafmod.block.display.StageLightOnDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StageLightOnDisplayItemRenderer extends GeoItemRenderer<StageLightOnDisplayItem> {
	public StageLightOnDisplayItemRenderer() {
		super(new StageLightOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageLightOnDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
