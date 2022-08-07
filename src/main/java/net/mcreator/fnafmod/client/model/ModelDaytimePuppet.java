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
public class ModelDaytimePuppet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_daytime_puppet"), "main");
	public final ModelPart Head;
	public final ModelPart bone;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart bb_main;

	public ModelDaytimePuppet(ModelPart root) {
		this.Head = root.getChild("Head");
		this.bone = root.getChild("bone");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(14, 0).addBox(-3.5F, -3.5F, -3.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(-3.0F, -7.5F, -3.0F, 6.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.5F, -7.0F, -2.0F, 5.0F,
								7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -16.0F, 0.5F, 0.48F, 0.0F, 0.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.5F, 6.7032F, 1.7113F, 0.3054F, 0.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 3.5F, 0.5F, -0.0873F, -0.1745F, 0.0F));
		PartDefinition left_lower_leg = left_leg.addOrReplaceChild("left_lower_leg",
				CubeListBuilder.create().texOffs(34, 0).addBox(-0.5F, -0.3333F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.8333F, 0.0F, 0.2194F, 0.3745F, 0.0487F));
		PartDefinition cube_r1 = left_lower_leg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 34)
						.addBox(0.0F, -4.0F, -1.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.6667F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(18, 15).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 3.5F, 0.5F, -0.0382F, 0.1326F, 0.0382F));
		PartDefinition right_lower_leg = right_leg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(33, 31).addBox(-0.5F, -0.3333F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.8333F, 0.0F, 0.0436F, -0.7844F, -0.0617F));
		PartDefinition cube_r2 = right_lower_leg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(37, 36).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 34)
						.addBox(0.0F, -4.0F, -1.0F, 0.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.6667F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(26, 15).addBox(-1.4142F, 0.0F, -2.2F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -11.0F, 1.5F, -0.0131F, 0.0416F, 0.2615F));
		PartDefinition right_lower_arm = right_arm.addOrReplaceChild("right_lower_arm",
				CubeListBuilder.create().texOffs(34, 11).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4142F, 9.5F, -1.2F, -1.2961F, -0.353F, 0.5966F));
		PartDefinition cube_r3 = right_lower_arm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -4.5F, -1.0F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 27)
						.addBox(-1.0F, -4.5F, 0.0F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, -0.829F, 0.0F));
		PartDefinition right_hand = right_lower_arm.addOrReplaceChild("right_hand", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.5586F, 5.5F, 1.0556F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone2 = right_hand.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(24, 39).addBox(-0.4373F, -0.3907F, -0.5793F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4142F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(38, 16).addBox(-1.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0627F, 3.4127F, -0.3568F, -0.3054F, 0.0F, 0.0F));
		PartDefinition bone3 = right_hand.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(38, 12).addBox(-0.4373F, -0.311F, -0.5124F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4142F, 3.15F, -1.2F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(38, 8).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0627F, 3.5255F, -0.2542F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone4 = right_hand.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 11).addBox(-0.4373F, -0.3907F, -0.5793F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5858F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bone4.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9373F, 2.9628F, -0.6399F, -0.7854F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(8, 21).addBox(-0.9393F, -0.3536F, -2.2F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -11.0F, 1.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition left_lower_arm = left_arm.addOrReplaceChild("left_lower_arm",
				CubeListBuilder.create().texOffs(4, 34).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0607F, 9.1464F, -1.2F, -1.0398F, -0.3141F, 0.8926F));
		PartDefinition cube_r7 = left_lower_arm.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(8, 30).addBox(0.0F, -4.5F, -1.0F, 0.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36)
						.addBox(-1.0F, -4.5F, 0.0F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition right_hand2 = left_lower_arm.addOrReplaceChild("right_hand2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.6056F, 5.3536F, -1.1086F, 0.0F, 2.3562F, 0.0F));
		PartDefinition bone5 = right_hand2.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(24, 39).addBox(-0.4414F, -0.235F, -0.5325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4142F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone5.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(38, 16).addBox(-1.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0586F, 3.1186F, -0.5931F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone6 = right_hand2.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(38, 12).addBox(-0.4414F, -0.1501F, -0.5358F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4142F, 3.15F, -1.2F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r9 = bone6.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(38, 8).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0586F, 3.6864F, -0.2776F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone7 = right_hand2.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(0, 11).addBox(-0.4414F, -0.235F, -0.5325F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5858F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r10 = bone7.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9414F, 3.5684F, -0.31F, -0.3054F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(25, 31).addBox(-0.5F, -26.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-2.0F, -36.0F, -1.7F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(13, 29)
						.addBox(-1.0F, -30.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 26)
						.addBox(-1.5F, -23.0F, -1.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 21)
						.addBox(-0.5F, -40.0F, -0.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 52)
						.addBox(-2.5F, -24.0F, -10.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 52)
						.addBox(-2.5F, -24.0F, -10.5F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
