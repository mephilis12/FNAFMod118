package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.UnWitheredBonnieHeadDisplayModel;
import net.mcreator.fnafmod.block.display.UnWitheredBonnieHeadDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class UnWitheredBonnieHeadDisplayItemRenderer extends GeoItemRenderer<UnWitheredBonnieHeadDisplayItem> {
	public UnWitheredBonnieHeadDisplayItemRenderer() {
		super(new UnWitheredBonnieHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(UnWitheredBonnieHeadDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
