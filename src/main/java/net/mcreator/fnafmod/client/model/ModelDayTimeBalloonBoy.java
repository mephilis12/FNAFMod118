package net.mcreator.fnafmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelDayTimeBalloonBoy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_day_time_balloon_boy"),
			"main");
	public final ModelPart body;

	public ModelDayTimeBalloonBoy(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 79).addBox(-18.0F, -15.4375F, -3.8813F, 9.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-4.5F, 0.0625F, -3.8813F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(-7.5F, 1.0625F, -0.8813F, 15.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-12.5F, 2.0625F, 0.1187F, 25.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-1.0F, 0.0625F, -3.9812F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-1.0F, 2.5625F, -3.9812F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 47)
						.addBox(7.5F, 1.5625F, -0.3813F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 47)
						.addBox(12.5F, 1.5625F, -0.3813F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 46)
						.addBox(-1.0F, -1.4375F, -0.3813F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 47)
						.addBox(-9.5F, 1.5625F, -0.3813F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 47)
						.addBox(-14.5F, 1.5625F, -0.3813F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-14.0F, -4.4375F, 0.6187F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 54)
						.addBox(13.0F, -5.4375F, 0.1188F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 55)
						.addBox(8.0F, -4.4375F, 0.1188F, 11.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 57)
						.addBox(8.5F, -3.9375F, -0.0812F, 10.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 8.2375F, 1.8813F, 0.0F, -0.1745F, 0.0F));
		PartDefinition left_leg = body.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(0, 42).addBox(-1.5F, 0.3F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 42)
						.addBox(-2.0F, 5.3F, -6.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 6).addBox(-1.5F, 5.3F, -3.0F, 3.0F, 2.0F,
								5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 8.7625F, 0.6187F, 0.0F, -0.2182F, 0.0F));
		PartDefinition right_leg = body.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 42).addBox(-1.5F, 0.3F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 6)
						.addBox(-1.5F, 5.3F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 42).addBox(-2.0F, 5.3F, -6.0F, 4.0F,
								2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 8.7625F, 0.6187F, 0.0F, 0.2618F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -6.0556F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 6)
						.addBox(-2.5F, -3.5556F, -3.9F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-1.0F, -4.0556F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(0.0F, -5.0556F, -6.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.5F, -6.0556F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 29)
						.addBox(-3.0F, -6.5556F, -4.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 29)
						.addBox(0.0F, -6.5556F, -4.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-2.5F, -4.0556F, -4.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 40)
						.addBox(-4.0F, -4.0556F, -4.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(-4.0F, -7.0556F, -2.5F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 32)
						.addBox(-3.5F, -7.0556F, -4.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-4.5F, -9.0556F, -5.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-1.0F, -10.0556F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -12.0556F, -0.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 24)
						.addBox(-0.5F, -13.0556F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 18)
						.addBox(-4.0F, -12.5556F, -4.5F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3819F, 0.1187F, -0.3131F, 0.3018F, -0.0034F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
