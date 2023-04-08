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

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelPlushtrap<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_plushtrap"), "main");
	public final ModelPart Head;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart Body;

	public ModelPlushtrap(ModelPart root) {
		this.Head = root.getChild("Head");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, 0.5F));
		PartDefinition Head2 = Head.addOrReplaceChild("Head2",
				CubeListBuilder.create().texOffs(14, 25).addBox(-0.5F, -3.1F, -3.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 27).addBox(-1.8F, -3.6F, -2.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.2F)).texOffs(17, 27)
						.addBox(0.8F, -3.6F, -2.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.2F)).texOffs(34, 46).addBox(-2.0F, -2.6F, -3.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 47).mirror()
						.addBox(-2.5F, -4.6F, -2.5F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(43, 57).addBox(-1.5F, -5.6F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(7, 16)
						.addBox(-2.3F, -2.05F, -2.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 15).addBox(-1.5F, -2.05F, -3.3F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 16)
						.addBox(2.3F, -2.05F, -2.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 15).addBox(-1.8F, -3.6F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(55, 15)
						.addBox(0.8F, -3.6F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(37, 37).addBox(-2.0F, -4.1F, -2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0435F, 0.0038F, -0.0872F));
		PartDefinition bone20 = Head2.addOrReplaceChild("bone20",
				CubeListBuilder.create().texOffs(22, 8).addBox(-1.5F, -0.5F, -3.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 0).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 28)
						.addBox(2.3F, -1.05F, -2.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 27).addBox(-1.5F, -1.05F, -3.3F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 28)
						.addBox(-2.3F, -1.05F, -2.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition LeftEar = Head2.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(33, 0).addBox(-1.1305F, -4.4914F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 0).addBox(-0.6305F, -4.9914F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -4.0F, 0.0F, 0.3043F, -0.0262F, 0.0832F));
		PartDefinition bone16 = LeftEar.addOrReplaceChild("bone16",
				CubeListBuilder.create().texOffs(13, 0).addBox(-0.6305F, -4.2011F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(39, 1).addBox(-1.1305F, -2.2011F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone16.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 4).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1305F, -2.3794F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition RightEar = Head2.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(33, 0).addBox(-0.8695F, -4.4914F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 0).addBox(-0.3695F, -4.9914F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -4.0F, 0.0F, 0.258F, 0.045F, -0.1687F));
		PartDefinition bone15 = RightEar.addOrReplaceChild("bone15",
				CubeListBuilder.create().texOffs(13, 0).addBox(-0.3695F, -4.2011F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(39, 1).addBox(-0.8695F, -2.2011F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, 0.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone15.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(39, 4).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1305F, -2.3794F, 0.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(2.5F, 11.5F, 0.5F));
		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2",
				CubeListBuilder.create().texOffs(53, 27).addBox(0.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 26).addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2232F, -0.5055F, 0.989F));
		PartDefinition bone7 = LeftArm2.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(24, 10).addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 49).addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.8727F, 0.0F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(1, 17).addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 11)
				.addBox(1.0F, -0.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 21).addBox(2.0F, -0.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-2.5F, 11.5F, 0.5F));
		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2",
				CubeListBuilder.create().texOffs(39, 27).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 26).addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0927F, 0.154F, -0.9548F));
		PartDefinition bone10 = RightArm2.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(15, 55).addBox(-3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 24).addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.598F, -1.3681F, 0.282F));
		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(1, 21).addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0917F, -0.1199F, 0.313F));
		PartDefinition cube_r3 = bone11.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(21, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r4 = bone11.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.0F, -1.5F, -0.8303F, 0.5545F, 0.4486F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(24, 30).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, -1).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 17.5F, 0.5F));
		PartDefinition bone4 = RightLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 19).addBox(0.0F, 0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 33).addBox(-1.0F, -0.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition bone17 = bone4.addOrReplaceChild("bone17",
				CubeListBuilder.create().texOffs(0, 40).addBox(-1.6F, 1.0F, -4.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 59).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.5F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(24, 38).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, -1).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 17.5F, 0.5F));
		PartDefinition bone5 = LeftLeg.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(17, 19).addBox(0.0F, 0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 41).addBox(-1.0F, -0.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition bone18 = bone5.addOrReplaceChild("bone18",
				CubeListBuilder.create().texOffs(0, 40).addBox(-1.6F, 1.0F, -4.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 59).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.5F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(17, 7).addBox(-2.0F, 1.8125F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 5).addBox(-2.5F, -3.6875F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-0.5F, 1.3125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 16).addBox(1.0F, 1.3125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 10)
						.addBox(-2.0F, 1.3125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-0.5F, -6.1875F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 8)
						.addBox(-1.5F, 0.8125F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 8).addBox(-1.5F, -3.6875F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.6875F, 0.5F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone12 = Body.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(33, 12).addBox(-2.5F, -13.5F, -1.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.3125F, -0.5F));
		PartDefinition cube_r5 = bone12.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 58).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.7F, 0.5F, -0.0873F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
