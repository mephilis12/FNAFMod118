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

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelNightmare_Balloon_Boy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_nightmare_balloon_boy"), "main");
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart Pivot;

	public ModelNightmare_Balloon_Boy(ModelPart root) {
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Pivot = root.getChild("Pivot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(31, 0).addBox(-6.0F, -7.0F, -2.0F, 12.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(62, 0).addBox(-6.0F, -7.0F, -4.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-5.0F, -8.0F, -7.0F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -4.5F, -9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 64)
						.addBox(4.0F, -4.0F, -7.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(71, 56).addBox(-6.0F, -4.0F, -7.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 77)
						.addBox(-4.0F, -6.5F, -6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 77).addBox(1.0F, -6.5F, -6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 43)
						.addBox(-6.0F, -11.0F, -4.0F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(39, 56).addBox(-6.0F, -11.0F, -7.0F, 12.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(17, 85)
						.addBox(-0.5F, -14.0F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 85).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(31, 30)
						.addBox(-5.0F, -2.0F, -7.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(86, 0).addBox(-5.0F, -1.0F, -7.0F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.7F, 0.0F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(31, 11).addBox(-5.5F, 0.4092F, -8.2638F, 11.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(-5.5F, 2.4092F, -8.2638F, 11.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(62, 26)
						.addBox(-5.5F, 1.4092F, -4.2638F, 11.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(55, 121).addBox(-3.5F, 1.4092F, -6.2638F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(55, 113)
						.addBox(-3.5F, 0.4092F, -6.2638F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-4.5F, -0.5908F, -8.2638F, 9.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 1.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition RightEye = Head.addOrReplaceChild("RightEye", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -5.0F, -6.1F));
		PartDefinition LeftEye = Head.addOrReplaceChild("LeftEye", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -5.0F, -6.1F));
		PartDefinition RightEyelid = Head.addOrReplaceChild("RightEyelid", CubeListBuilder.create().texOffs(72, 72).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -5.6F, -4.5F));
		PartDefinition LeftEyelid = Head.addOrReplaceChild("LeftEyelid", CubeListBuilder.create().texOffs(72, 72).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -5.6F, -4.5F));
		PartDefinition Properller = Head.addOrReplaceChild("Properller", CubeListBuilder.create().texOffs(-9, 97).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.0F, -2.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(27, 54).addBox(-5.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(65, 81).addBox(-6.0F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 6.7F, 1.5F, 0.0F, 0.0F, -1.2217F));
		PartDefinition RightArmLower = RightArm.addOrReplaceChild("RightArmLower", CubeListBuilder.create().texOffs(13, 77).addBox(-5.0F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, -0.9599F, 0.0F));
		PartDefinition RightHand = RightArmLower.addOrReplaceChild("RightHand", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 0.0F));
		PartDefinition RightThumb = RightHand.addOrReplaceChild("RightThumb", CubeListBuilder.create().texOffs(81, 116).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 1.0F, -1.0F));
		PartDefinition RightFingers = RightHand.addOrReplaceChild("RightFingers",
				CubeListBuilder.create().texOffs(93, 120).addBox(-4.0F, -1.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(81, 122).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(80, 5).addBox(1.0F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 42).addBox(0.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 6.7F, 1.5F, 0.0F, 0.0F, 1.2654F));
		PartDefinition LeftArmLower = LeftArm.addOrReplaceChild("LeftArmLower", CubeListBuilder.create().texOffs(28, 77).addBox(0.3244F, -1.0F, -0.7373F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.829F, 0.0F));
		PartDefinition LeftHand = LeftArmLower.addOrReplaceChild("LeftHand", CubeListBuilder.create().texOffs(0, 5).addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.3244F, 0.0F, 0.2627F));
		PartDefinition LeftFingers = LeftHand.addOrReplaceChild("LeftFingers",
				CubeListBuilder.create().texOffs(113, 120).addBox(2.0F, -1.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(116, 111).addBox(0.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 0.0F, 0.0F));
		PartDefinition LeftThumb = LeftHand.addOrReplaceChild("LeftThumb", CubeListBuilder.create().texOffs(105, 122).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 1.0F, -1.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(76, 38).addBox(-2.5F, -1.0F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 92).addBox(-1.5F, 2.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 15.2F, 2.5F));
		PartDefinition RightLegLower = RightLeg.addOrReplaceChild("RightLegLower", CubeListBuilder.create().texOffs(0, 83).addBox(-2.5F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offset(0.0F, 3.0F, -0.5F));
		PartDefinition RightFoot = RightLegLower.addOrReplaceChild("RightFoot",
				CubeListBuilder.create().texOffs(0, 69).addBox(-2.5F, -1.0F, -3.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 68).addBox(-3.0F, -2.0F, -8.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.5F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(74, 13).addBox(-1.5F, -1.0F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 92).addBox(-0.5F, 2.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 15.2F, 2.5F));
		PartDefinition LeftLegLower = LeftLeg.addOrReplaceChild("LeftLegLower", CubeListBuilder.create().texOffs(14, 92).addBox(-1.5F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offset(0.0F, 3.0F, -0.5F));
		PartDefinition LeftFoot = LeftLegLower.addOrReplaceChild("LeftFoot",
				CubeListBuilder.create().texOffs(55, 68).addBox(-1.5F, -1.0F, -3.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 5).addBox(-2.0F, -2.0F, -8.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.5F));
		PartDefinition Pivot = partdefinition.addOrReplaceChild("Pivot", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Body = Pivot.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 107).addBox(-6.0F, -9.75F, -5.5F, 12.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.05F, 1.5F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 34).addBox(13.0F, -1.0F, -1.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.0F, -25.25F, 0.0F, 0.0F, 0.0F, 1.5708F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Pivot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
