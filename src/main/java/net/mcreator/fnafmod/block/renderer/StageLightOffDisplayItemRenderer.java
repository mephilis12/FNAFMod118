package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightOffDisplayModel;
import net.mcreator.fnafmod.block.display.StageLightOffDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StageLightOffDisplayItemRenderer extends GeoItemRenderer<StageLightOffDisplayItem> {
	public StageLightOffDisplayItemRenderer() {
		super(new StageLightOffDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageLightOffDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
