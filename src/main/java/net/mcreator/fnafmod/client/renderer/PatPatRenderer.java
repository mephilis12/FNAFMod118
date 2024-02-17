
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fnafmod.entity.PatPatEntity;
import net.mcreator.fnafmod.client.model.ModelPatPat;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PatPatRenderer extends MobRenderer<PatPatEntity, ModelPatPat<PatPatEntity>> {
	public PatPatRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPatPat(context.bakeLayer(ModelPatPat.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<PatPatEntity, ModelPatPat<PatPatEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("fnaf_mod:textures/entities/patpat_e.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PatPatEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PatPatEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/patpat.png");
	}
}
