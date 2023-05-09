package net.mcreator.fnafmod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.block.model.UnWitheredChicaHeadDisplayModel;
import net.mcreator.fnafmod.block.display.UnWitheredChicaHeadDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class UnWitheredChicaHeadDisplayItemRenderer extends GeoItemRenderer<UnWitheredChicaHeadDisplayItem> {
	public UnWitheredChicaHeadDisplayItemRenderer() {
		super(new UnWitheredChicaHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(UnWitheredChicaHeadDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
