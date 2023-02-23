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
public class ModelJJ<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_jj"), "main");
	public final ModelPart head;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart body;

	public ModelJJ(ModelPart root) {
		this.head = root.getChild("head");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(35, 42).addBox(-2.5F, -3.25F, -3.4F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(43, 0).addBox(-1.0F, -3.75F, -5.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(0.0F, -4.75F, -5.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 25).addBox(-2.5F, -3.75F, -3.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 8)
						.addBox(-4.0F, -3.75F, -4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 29).addBox(-4.5F, -6.75F, -2.5F, 9.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(29, 11)
						.addBox(-3.5F, -6.75F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-4.5F, -8.75F, -4.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(36, 31)
						.addBox(-1.0F, -9.75F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.5F, -11.75F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 29)
						.addBox(-0.5F, -12.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0).addBox(-4.0F, -12.25F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 7.25F, 3.5F));
		PartDefinition bone = head.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 5).addBox(-0.5F, -11.2F, -0.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 22).addBox(-1.0F, -11.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(2.5F, -11.2F, -0.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 22).addBox(2.0F, -11.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 42)
						.addBox(1.5F, -12.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 42).addBox(-1.5F, -12.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 5.95F, -2.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 36).addBox(-1.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 10.5F, 3.5F, 0.0F, 0.0F, 1.3526F));
		PartDefinition LeftHand = LeftArm.addOrReplaceChild("LeftHand",
				CubeListBuilder.create().texOffs(27, 25).addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(4.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 41).addBox(-3.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 10.5F, 3.5F, 0.0F, 0.0F, -1.3526F));
		PartDefinition RightHand = RightArm.addOrReplaceChild("RightHand",
				CubeListBuilder.create().texOffs(27, 25).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-6.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 0.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(14, 41).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 17.5F, 3.5F));
		PartDefinition bone2 = left_leg.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(25, 29).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(41, 31).addBox(-2.0F, -0.5F, -6.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(14, 41).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 17.5F, 3.5F));
		PartDefinition RightFoot = right_leg.addOrReplaceChild("RightFoot",
				CubeListBuilder.create().texOffs(41, 31).addBox(-2.0F, -0.5F, -6.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(25, 29).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -15.7F, -1.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 29).addBox(0.5F, -15.7F, -1.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(0.5F, -13.2F, -1.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.5F, -17.2F, 2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 23.7F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
