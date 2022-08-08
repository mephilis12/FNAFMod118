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
public class ModelDaytimeSpringtrap<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_daytime_springtrap"),
			"main");
	public final ModelPart Body;

	public ModelDaytimeSpringtrap(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(14, 38).addBox(-8.05F, -13.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 38)
						.addBox(6.05F, -13.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 52)
						.addBox(-4.0F, -6.5F, -2.5F, 8.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 52)
						.addBox(-0.5F, -13.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(57, 0).addBox(-4.5F, -14.5F, -4.0F, 9.0F,
								10.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 25.0F, 3.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(57, 18).addBox(-4.5F, -1.5F, -3.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition LeftArm_r1 = Body.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(87, 77).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(63, 78)
						.addBox(12.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.99F, -13.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.2587F, -0.0283F, 0.2164F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(24, 9).addBox(-4.0F, -0.5F, -5.1F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-3.5F, -0.8F, -4.6F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -0.7F, 0.1F, 0.2182F, 0.0F, 0.0F));
		PartDefinition endo_head = Head
				.addOrReplaceChild("endo_head",
						CubeListBuilder.create().texOffs(26, 24).addBox(-3.5F, -6.7F, -4.0F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
								.texOffs(65, 60).addBox(-3.5F, -1.7F, -4.5F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r2 = endo_head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(22, 35).addBox(-3.5F, -0.9F, -3.5F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.7365F, -0.3863F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone8 = endo_head.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(15, 42).addBox(-3.4F, -33.5F, 10.1F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 27.8F, -14.0F));
		PartDefinition bone10 = bone8.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(46, 38).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -31.8F, 11.2F));
		PartDefinition bone9 = bone10.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.1F, -1.1F));
		PartDefinition bone = endo_head.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(16, 104).addBox(0.3F, -33.5F, 10.1F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 27.8F, -14.0F));
		PartDefinition bone11 = bone.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(46, 38).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -32.0F, 11.2F));
		PartDefinition bone7 = bone11.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.1F, -1.1F));
		PartDefinition upperhead = Head
				.addOrReplaceChild("upperhead",
						CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -5.0F, -7.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
								.texOffs(43, 0).addBox(-2.5F, -1.0F, -8.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -2.2F, 2.0F));
		PartDefinition cube_r3 = upperhead.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(23, 0).addBox(-3.5F, -0.8F, -3.4F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.8F, -3.5F, 0.0873F, 0.0F, 0.0F));
		PartDefinition RightEar = upperhead.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(12, 80).addBox(-1.5F, -4.2F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 77)
						.addBox(-1.0F, -4.2F, 0.0F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -4.8F, -3.0F, 0.2182F, 0.0F, -0.3491F));
		PartDefinition RightTop = RightEar.addOrReplaceChild("RightTop", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition LeftEar = upperhead.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(2, 80).addBox(-1.5F, -6.2F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 75)
						.addBox(-1.0F, -6.2F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -4.8F, -3.0F, 0.4752F, -0.5522F, 0.212F));
		PartDefinition LeftTop = LeftEar.addOrReplaceChild("LeftTop",
				CubeListBuilder.create().texOffs(1, 92).addBox(-1.5F, -5.3F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 75)
						.addBox(-1.0F, -4.8F, 0.0F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.4F, 0.0F, 0.7481F, -0.1447F, -0.1982F));
		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(35, 73).addBox(-2.01F, 1.9F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(-0.35F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 66)
						.addBox(-0.85F, 1.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 39)
						.addBox(-1.35F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 38).addBox(-0.8F, 7.4F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -13.3F, 0.0F, 0.0F, -0.3927F, -0.2182F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 23)
						.addBox(-0.8F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 47).addBox(-1.5F, 0.6F, -1.5F, 3.0F,
								5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.2F, 0.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone6 = bone3.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(9, 45).addBox(-1.0909F, 0.1F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(99, 56)
						.addBox(-1.6362F, 0.0F, -2.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(111, 38)
						.addBox(-1.5909F, 1.6F, -2.1F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(99, 38)
						.addBox(-1.0909F, 2.1F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(94, 30)
						.addBox(0.4091F, 0.6F, -0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3909F, 6.1F, -0.1F, -2.086F, -0.8036F, 1.9578F));
		PartDefinition RightArm = Body.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(35, 73).addBox(-2.01F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(27, 65)
						.addBox(-1.0F, 1.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 39)
						.addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 38).addBox(-1.0F, 7.5F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -13.3F, 0.0F, -0.3011F, 0.0522F, 0.1666F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 23)
						.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 55).addBox(-1.5F, 0.6F, -1.5F, 3.0F,
								5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(57, 43).addBox(-0.9F, 0.5F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(9, 45)
						.addBox(-0.4F, 0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(99, 34)
						.addBox(1.1F, 1.2F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(99, 46)
						.addBox(-0.4F, 2.7F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(110, 46)
						.addBox(-0.9F, 2.2F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 5).addBox(-0.4F, 0.7F, -1.5F, 1.0F, 2.0F,
								0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 5.5F, 0.0F, -0.9924F, -0.6621F, 1.2979F));
		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1176F, 1.1319F, 0.0F, 0.0F, 0.0F, 2.9671F));
		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(74, 30).addBox(-1.9F, -0.5F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 38)
						.addBox(-0.9F, 8.5F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-0.9F, 2.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(95, 64)
						.addBox(-1.4F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 47)
						.addBox(-0.4436F, -1.5F, -0.4981F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.5F, -3.0F, -2.2894F, -0.2784F, 0.0096F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(95, 123).addBox(-1.9F, -1.5F, -2.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 47)
						.addBox(-0.4F, 0.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 111)
						.addBox(-0.9F, 1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 22).addBox(-0.9F, 7.001F, 0.0F, 2.0F,
								2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.5F, 0.5F, 1.8762F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r1 = bone4.addOrReplaceChild("LeftLeg_r1",
				CubeListBuilder.create().texOffs(106, 113).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 3.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone12 = bone4.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(0, 122).addBox(-1.5F, 0.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 123)
						.addBox(-2.0F, 2.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 7.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition LeftArm_r2 = bone12.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(44, 115).addBox(5.0F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 115)
						.addBox(6.0F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 115)
						.addBox(7.0F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(37, 122).addBox(4.5F, 0.0F, -4.0F, 3.0F,
								1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 1.1352F, -1.5948F, 0.2182F, 0.0F, 0.0F));
		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(14, 38).addBox(-1.0F, 8.5F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-1.0F, 2.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 42)
						.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(95, 64)
						.addBox(-1.5F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 47)
						.addBox(-0.4564F, -1.5F, -0.4981F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -2.5F, -3.0F, -1.9226F, 0.123F, -0.045F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(98, 9).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(83, 123)
						.addBox(-2.0F, -1.5F, -2.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 47)
						.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 111)
						.addBox(-1.0F, 1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 22).addBox(-1.0F, 7.0F, 0.0F, 2.0F, 2.0F,
								0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.5F, 0.5F, 0.9163F, 0.0F, 0.0F));
		PartDefinition bone13 = right_lower_leg.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(0, 122).addBox(-2.0F, 0.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 123)
						.addBox(-2.5F, 2.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 7.0F, 0.0F, 1.0472F, 0.0F, 0.0F));
		PartDefinition LeftArm_r3 = bone13.addOrReplaceChild("LeftArm_r3",
				CubeListBuilder.create().texOffs(44, 115).addBox(-1.5F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 115)
						.addBox(-0.5F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 115)
						.addBox(0.5F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(37, 122).addBox(-2.0F, 0.0F, -4.0F, 3.0F,
								1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.1352F, -1.5948F, 0.2182F, 0.0F, 0.0F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(0, 43).addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(27, 42)
						.addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 94)
						.addBox(1.0F, -25.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(59, 90)
						.addBox(-0.5F, -25.0F, -4.5F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(1, 105)
						.addBox(-1.5F, -25.0F, -1.0F, 9.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 94)
						.addBox(1.0F, -22.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
						.addBox(-1.0F, -17.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(103, 3)
						.addBox(2.0F, -30.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 2)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(24, 23)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(24, 23)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(23, 2)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(36, 35)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
