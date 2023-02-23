package net.mcreator.fnafmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class Modelpuppet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "modelpuppet"), "main");
	public final ModelPart Head;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart Body;

	public Modelpuppet(ModelPart root) {
		this.Head = root.getChild("Head");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(14, 0).addBox(-3.5F, -3.5F, -3.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
				.addBox(-3.0F, -7.5F, -3.0F, 6.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5F, -7.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -16.0F, 0.5F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(8, 21).addBox(-0.9393F, -0.3536F, -2.2F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -11.0F, 1.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition left_lower_arm = left_arm.addOrReplaceChild("left_lower_arm", CubeListBuilder.create().texOffs(4, 34).addBox(-1.3056F, -3.3536F, -1.3914F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r1 = left_lower_arm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(8, 30).addBox(0.0F, -4.5F, -1.0F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36).addBox(-1.0F, -4.5F, 0.0F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8056F, 1.1464F, -0.8914F, 0.0F, -0.7854F, 0.0F));
		PartDefinition right_hand2 = left_lower_arm.addOrReplaceChild("right_hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 2.5F, -2.0F, 0.0F, 2.3562F, 0.0F));
		PartDefinition bone5 = right_hand2.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(24, 39).addBox(-0.4414F, -0.235F, -0.5325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4142F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone5.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 16).addBox(-1.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0586F, 3.1186F, -0.5931F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone6 = right_hand2.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(38, 12).addBox(-0.4414F, -0.1501F, -0.5358F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4142F, 3.15F, -1.2F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone6.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 8).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0586F, 3.6864F, -0.2776F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone7 = right_hand2.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 11).addBox(-0.4414F, -0.235F, -0.5325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5858F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone7.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9414F, 3.5684F, -0.31F, -0.3054F, 0.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(26, 15).addBox(-1.4142F, 0.0F, -2.2F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -11.0F, 1.5F, -0.0131F, 0.0416F, 0.2615F));
		PartDefinition right_lower_arm = right_arm.addOrReplaceChild("right_lower_arm", CubeListBuilder.create().texOffs(34, 11).addBox(-1.6414F, -3.0F, -1.0556F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r5 = right_lower_arm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -4.5F, -1.0F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 27).addBox(-1.0F, -4.5F, 0.0F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1414F, 1.5F, -0.5556F, 0.0F, -0.829F, 0.0F));
		PartDefinition right_hand = right_lower_arm.addOrReplaceChild("right_hand", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, 3.0F, 0.5F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone2 = right_hand.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(24, 39).addBox(-0.4373F, -0.3907F, -0.5793F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4142F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 16).addBox(-1.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0627F, 3.4127F, -0.3568F, -0.3054F, 0.0F, 0.0F));
		PartDefinition bone3 = right_hand.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(38, 12).addBox(-0.4373F, -0.311F, -0.5124F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4142F, 3.15F, -1.2F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 8).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0627F, 3.5255F, -0.2542F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone4 = right_hand.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 11).addBox(-0.4373F, -0.3907F, -0.5793F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5858F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9373F, 2.9628F, -0.6399F, -0.7854F, 0.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 3.5F, 0.5F));
		PartDefinition left_lower_leg = left_leg.addOrReplaceChild("left_lower_leg", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5F, -4.3333F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.8333F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r9 = left_lower_leg.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 34).addBox(0.0F, -4.0F, -1.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3333F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(18, 15).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 3.5F, 0.5F));
		PartDefinition right_lower_leg = right_leg.addOrReplaceChild("right_lower_leg", CubeListBuilder.create().texOffs(33, 31).addBox(-0.5F, -4.3333F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.8333F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r10 = right_lower_leg.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(37, 36).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 34).addBox(0.0F, -4.0F, -1.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3333F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(23, 26).addBox(-1.5F, -23.0F, -1.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(25, 31).addBox(-0.5F, -26.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 29)
						.addBox(-1.0F, -30.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 21).addBox(-0.5F, -40.0F, -0.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-2.0F, -36.0F, -1.7F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
