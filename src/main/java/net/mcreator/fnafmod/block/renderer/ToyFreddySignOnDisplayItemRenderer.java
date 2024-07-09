package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.ToyFreddySignOnDisplayModel;
import net.mcreator.fnafmod.block.display.ToyFreddySignOnDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ToyFreddySignOnDisplayItemRenderer extends GeoItemRenderer<ToyFreddySignOnDisplayItem> {
	public ToyFreddySignOnDisplayItemRenderer() {
		super(new ToyFreddySignOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyFreddySignOnDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
