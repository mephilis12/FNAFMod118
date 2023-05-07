package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.SpringBonnieHeadDisplayModel;
import net.mcreator.fnafmod.block.display.SpringBonnieHeadDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SpringBonnieHeadDisplayItemRenderer extends GeoItemRenderer<SpringBonnieHeadDisplayItem> {
	public SpringBonnieHeadDisplayItemRenderer() {
		super(new SpringBonnieHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(SpringBonnieHeadDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
