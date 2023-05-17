package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.StageLightRedOffDisplayModel;
import net.mcreator.fnafmod.block.display.StageLightRedOffDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StageLightRedOffDisplayItemRenderer extends GeoItemRenderer<StageLightRedOffDisplayItem> {
	public StageLightRedOffDisplayItemRenderer() {
		super(new StageLightRedOffDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageLightRedOffDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
