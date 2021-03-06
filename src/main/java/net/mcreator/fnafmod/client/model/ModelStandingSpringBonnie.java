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
public class ModelStandingSpringBonnie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_standing_spring_bonnie"),
			"main");
	public final ModelPart Body;

	public ModelStandingSpringBonnie(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(58, 73).addBox(-8.05F, -13.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 73)
						.addBox(6.05F, -13.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-4.5F, -4.5F, -3.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(77, 1)
						.addBox(-2.0F, -5.5F, 3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(59, 17)
						.addBox(-4.0F, -15.0F, -5.0F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -15.0F, -4.5F, 10.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-1.0F, -14.0F, -5.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 20)
						.addBox(-0.5F, -11.0F, -4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 20)
						.addBox(-0.5F, -9.0F, -4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-4.5F, -14.5F, -4.0F, 9.0F,
								10.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 1.0F, 0.2181F, -0.0038F, -0.0438F));
		PartDefinition LeftArm_r1 = Body.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(46, 58).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 62)
						.addBox(12.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.99F, -13.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(12, 46).addBox(-2.5F, -3.2F, -6.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-6.5F, -3.2F, -5.5F, 13.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 26).addBox(-4.0F, -7.2F, -5.0F, 8.0F,
								6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0866F, -0.0321F, -0.1342F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(32, 19).addBox(-3.5F, -0.8F, -3.4F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4F, -1.5F, 0.0873F, 0.0F, 0.0F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(29, 10).addBox(-4.0F, -0.85F, -6.1652F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-3.5F, -1.15F, -5.6652F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5068F, 1.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(23, 69).addBox(-1.5F, -6.2F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.0F, -6.2F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 37).addBox(-1.0F, 0.8F, -1.0F, 2.0F, 2.0F,
								1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -7.0F, -1.0F, 0.0894F, -0.2173F, 0.1988F));
		PartDefinition LeftTop = LeftEar.addOrReplaceChild("LeftTop",
				CubeListBuilder.create().texOffs(70, 21).addBox(-1.5F, -5.3F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 49)
						.addBox(-1.0F, -4.8F, 0.0F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.4F, 0.0F, 0.4749F, 0.0349F, 0.1028F));
		PartDefinition RightEar = Head.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(68, 48).addBox(-1.5F, -6.2F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.0F, -6.2F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 37).addBox(-1.0F, 0.8F, -1.0F, 2.0F, 2.0F,
								1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -7.0F, -1.0F, 0.0873F, 0.0F, -0.1745F));
		PartDefinition RightTop = RightEar.addOrReplaceChild("RightTop", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition LeftTop2 = RightEar.addOrReplaceChild("LeftTop2",
				CubeListBuilder.create().texOffs(0, 70).addBox(-1.5803F, -5.3F, -0.8211F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 49)
						.addBox(-1.0803F, -4.8F, 0.1789F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0803F, -6.4F, -0.1789F, 0.436F, -0.0211F, -0.058F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(48, 3).addBox(10.2381F, -1.7048F, -1.4143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 46).addBox(15.2381F, -1.7048F, -1.4143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 73)
						.addBox(11.2381F, -3.7048F, -0.4143F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 32)
						.addBox(11.7381F, -0.7048F, -3.4143F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 4)
						.addBox(12.2381F, -0.2048F, -3.3143F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 48)
						.addBox(10.2381F, -3.7048F, -2.7143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 67)
						.addBox(13.7381F, -4.2048F, -3.2143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 67)
						.addBox(9.7381F, -4.2048F, -3.2143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 48)
						.addBox(14.2381F, -3.7048F, -2.7143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 1)
						.addBox(14.7381F, -3.1548F, -2.8143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 1)
						.addBox(10.7381F, -3.1548F, -2.8143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 12).addBox(9.7381F, -0.4048F,
								-0.4143F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));
		PartDefinition bone = endo_head.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(28, 4).addBox(13.0F, -18.8F, -12.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 32)
						.addBox(12.5F, -18.3F, -12.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 28)
						.addBox(12.5F, -20.3F, -12.7F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.7619F, 19.5952F, 9.2857F));
		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(54, 22).addBox(-2.01F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 73)
						.addBox(-0.35F, 1.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 32)
						.addBox(-1.35F, 2.6F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 73).addBox(-0.8F, 7.5F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -13.4F, 0.0F, 0.0F, 0.2618F, -0.48F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(45, 73).addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.8F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(65, 0).addBox(-1.5F, 0.6F, -1.5F, 3.0F, 5.0F,
								3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.9163F, 0.0F, 0.0F));
		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone6 = bone3.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(48, 29).addBox(-0.5F, 0.6F, -1.625F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 58)
						.addBox(-1.0F, 0.5F, -2.125F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 5.6F, -0.125F, 2.9629F, -0.2148F, -3.1031F));
		PartDefinition LeftArm_r2 = bone6.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(44, 40).addBox(1.0F, -2.0F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.1F, 0.375F, -0.48F, -0.8727F, 0.0F));
		PartDefinition LeftArm_r3 = bone6.addOrReplaceChild("LeftArm_r3",
				CubeListBuilder.create().texOffs(0, 64).addBox(-0.4226F, -2.5F, -1.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5774F, 3.6F, -0.625F, 0.0F, 0.0F, 1.0036F));
		PartDefinition RightArm = Body.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(54, 22).addBox(-2.01F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 32)
						.addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 73)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 73).addBox(-1.0F, 7.5F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -13.3F, 0.0F, -0.6553F, 0.8252F, -0.1095F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(45, 73).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 65).addBox(-1.5F, 0.6F, -1.5F, 3.0F,
								5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -1.6469F, -0.001F, 0.3378F));
		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(69, 8).addBox(-0.9F, 0.5F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 29)
						.addBox(-0.4F, 0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 5.5F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition LeftArm_r4 = right_hand.addOrReplaceChild("LeftArm_r4",
				CubeListBuilder.create().texOffs(24, 63).addBox(-0.5F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, 3.2F, 0.0F, 0.0F, 0.0F, 1.6144F));
		PartDefinition LeftArm_r5 = right_hand.addOrReplaceChild("LeftArm_r5",
				CubeListBuilder.create().texOffs(44, 40).addBox(1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 2.2F, -1.0F, 0.2074F, 1.169F, -1.346F));
		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1176F, 1.1319F, 0.0F, 0.0F, 0.0F, 2.9671F));
		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(44, 45).addBox(-1.9913F, 0.0F, -2.1004F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 73)
						.addBox(-0.9913F, 9.0F, -0.6004F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.9913F, 3.0F, -1.1004F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 58)
						.addBox(-1.4913F, 1.5F, -1.6004F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 19)
						.addBox(-0.5349F, -1.0F, -0.5985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0913F, -2.0F, 0.1004F, -0.3846F, -0.2344F, 0.0125F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(30, 54).addBox(-2.0F, 0.5F, -1.5F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(69, 40)
						.addBox(-2.0F, -1.5F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 69).addBox(-0.5F, 0.0F, 0.0F, 1.0F,
								9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0087F, 10.0F, -0.1004F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone8 = bone4.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(16, 49).addBox(-1.5F, 1.0F, -7.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(52, 3)
						.addBox(-1.9F, 0.001F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 49)
						.addBox(-1.9F, 3.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 66).addBox(-1.4F, 1.001F, -1.5F, 3.0F,
								3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 6.0F, 0.5F, -0.3048F, 0.0151F, 0.0859F));
		PartDefinition LeftArm_r6 = bone8.addOrReplaceChild("LeftArm_r6",
				CubeListBuilder.create().texOffs(0, 58).addBox(-3.5F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1F, 2.1352F, -1.5948F, 0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone8.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(16, 49).addBox(-1.5F, -1.5F, -5.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 3.0F, -1.5F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r3 = bone8.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(16, 49).addBox(-1.5F, -1.5F, -5.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, -1.5F, 0.0F, 0.1745F, 0.0F));
		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(58, 73).addBox(-1.0087F, 9.0F, -0.6004F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0087F, 3.0F, -1.1004F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-2.0087F, 0.0F, -2.1004F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 58)
						.addBox(-1.5087F, 1.5F, -1.6004F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 19)
						.addBox(-0.4651F, -1.0F, -0.5985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9807F, -2.0F, 0.1428F, -0.3219F, 0.4671F, 0.1346F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(56, 53).addBox(-2.0F, 0.5F, -1.5F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 19)
						.addBox(-2.0F, -1.5F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 69).addBox(-0.5F, 0.0F, 0.0F, 1.0F,
								9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0087F, 10.0F, -0.1004F, 0.4363F, 0.0F, 0.0F));
		PartDefinition bone7 = right_lower_leg.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(16, 49).addBox(-1.5F, 1.0F, -7.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(52, 3)
						.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 49)
						.addBox(-2.0F, 3.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 66).addBox(-1.5F, 1.001F, -1.5F, 3.0F,
								3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.5F, -0.2591F, -0.0339F, -0.1711F));
		PartDefinition LeftArm_r7 = bone7.addOrReplaceChild("LeftArm_r7",
				CubeListBuilder.create().texOffs(0, 58).addBox(-2.0F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 2.1352F, -1.5948F, 0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone7.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(16, 49).addBox(-1.5F, -1.5F, -5.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, -1.5F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r5 = bone7.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(16, 49).addBox(-1.5F, -1.5F, -5.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 3.0F, -1.5F, 0.0F, -0.2182F, 0.0F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(58, 69).addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 67)
						.addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
						.addBox(-0.5F, -25.0F, -4.5F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 44)
						.addBox(-1.0F, -17.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 73)
						.addBox(2.0F, -30.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(46, 47)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(45, 44)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(28, 0)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(48, 0)
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
