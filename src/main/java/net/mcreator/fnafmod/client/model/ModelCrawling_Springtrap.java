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
public class ModelCrawling_Springtrap<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_crawling_springtrap"), "main");
	public final ModelPart Head;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Body;

	public ModelCrawling_Springtrap(ModelPart root) {
		this.Head = root.getChild("Head");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.2F, -11.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(24, 9).addBox(-4.0F, -0.5F, -5.1F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-3.5F, -0.8F, -4.6F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -0.7F, 0.1F, 0.2182F, 0.0F, 0.0F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(26, 24).addBox(-3.5F, -6.7F, -4.0F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(65, 60).addBox(-3.5F, -1.7F, -4.5F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = endo_head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 35).addBox(-3.5F, -0.9F, -3.5F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.7365F, -0.3863F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone8 = endo_head.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(15, 42).addBox(-3.4F, -33.5F, 10.1F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 27.8F, -14.0F));
		PartDefinition bone10 = bone8.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(46, 38).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -31.8F, 11.2F));
		PartDefinition bone9 = bone10.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.1F, -1.1F));
		PartDefinition bone = endo_head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(16, 104).addBox(0.3F, -33.5F, 10.1F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 27.8F, -14.0F));
		PartDefinition bone11 = bone.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(46, 38).addBox(-1.0F, -0.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -32.0F, 11.2F));
		PartDefinition bone7 = bone11.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -0.4F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.1F, -1.1F));
		PartDefinition upperhead = Head.addOrReplaceChild("upperhead",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -5.0F, -7.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(43, 0).addBox(-2.5F, -1.0F, -8.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.2F, 2.0F));
		PartDefinition cube_r2 = upperhead.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 0).addBox(-3.5F, -0.8F, -3.4F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.8F, -3.5F, 0.0873F, 0.0F, 0.0F));
		PartDefinition RightEar = upperhead.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(12, 80).addBox(-1.5F, -4.2F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 77).addBox(-1.0F, -4.2F, 0.0F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -4.8F, -3.0F, 0.2182F, 0.0F, -0.3491F));
		PartDefinition RightTop = RightEar.addOrReplaceChild("RightTop", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition LeftEar = upperhead.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(2, 80).addBox(-1.5F, -6.2F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 75).addBox(-1.0F, -6.2F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -4.8F, -3.0F, 0.2233F, -0.2129F, 0.3011F));
		PartDefinition LeftTop = LeftEar.addOrReplaceChild("LeftTop",
				CubeListBuilder.create().texOffs(1, 92).addBox(-1.5F, -5.3F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 75).addBox(-1.0F, -4.8F, 0.0F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.4F, 0.0F, 0.7481F, -0.1447F, -0.1982F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(35, 73).addBox(-2.01F, 0.9F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 47).addBox(-0.35F, 0.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 66)
						.addBox(-0.85F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 39).addBox(-1.35F, 1.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 38)
						.addBox(-0.8F, 6.4F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 17.7F, -7.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 23)
				.addBox(-0.8F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 47).addBox(-1.5F, 0.6F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.2F, 0.0F, -1.113F, 0.2909F, -0.4418F));
		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone6 = bone3.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(9, 45).addBox(-0.5724F, 0.0681F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(99, 56).addBox(-1.1176F, -0.0319F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(111, 38)
						.addBox(-1.0724F, 1.5681F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(99, 38).addBox(-0.5724F, 2.0681F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(94, 30)
						.addBox(0.9276F, 0.5681F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1276F, 6.1319F, 0.0F, 2.9193F, -1.0326F, -2.8841F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(35, 73).addBox(-2.01F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(27, 65).addBox(-1.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 39)
						.addBox(-1.5F, 1.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 47).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 38)
						.addBox(-1.0F, 6.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 18.7F, -7.0F, -0.9599F, 0.0F, 0.0F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 23)
				.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 55).addBox(-1.5F, 0.6F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.3F, 0.0F, -0.6003F, -0.484F, 0.3084F));
		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(57, 43).addBox(-0.9F, 0.5F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(9, 45).addBox(-0.4F, 0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(99, 34)
						.addBox(1.1F, 1.2F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(99, 46).addBox(-0.4F, 2.7F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(110, 46)
						.addBox(-0.9F, 2.2F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 5).addBox(-0.4F, 0.7F, -1.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 5.5F, 0.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1176F, 1.1319F, 0.0F, 0.0F, 0.0F, 2.9671F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(74, 30).addBox(-1.9F, -0.5F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 38).addBox(-0.9F, 8.5F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-0.9F, 2.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(95, 64).addBox(-1.4F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 47)
						.addBox(-0.4436F, -1.5F, -0.4981F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 19.5F, 4.0F, 0.9599F, 0.0F, 0.0F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(95, 123).addBox(-1.9F, -1.5F, -2.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 47)
				.addBox(-0.4F, 0.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 111).addBox(-0.9F, 1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.5F, 0.5F, 1.0472F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r1 = bone4.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(106, 113).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 3.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone12 = bone4.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(0, 122).addBox(-1.5F, 0.5915F, -1.2209F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 123)
				.addBox(-2.0F, 2.5915F, -5.2209F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 22).addBox(-1.0F, 0.5915F, 0.2791F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 6.4095F, -0.2791F, 0.1745F, 0.0F, 0.0F));
		PartDefinition LeftArm_r1 = bone12.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(44, 115).addBox(5.0F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 115).addBox(6.0F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 115)
						.addBox(7.0F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(37, 122).addBox(4.5F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 1.7258F, -1.3157F, 0.2182F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(14, 38).addBox(-1.0F, 8.5F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-1.0F, 2.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 42)
						.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(95, 64).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 47)
						.addBox(-0.4564F, -1.5F, -0.4981F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 20.5F, 3.0F, 1.2654F, 0.0F, 0.0F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(98, 9).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(83, 123).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 47)
						.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 111).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.5F, 0.5F, 0.6109F, 0.0F, 0.0F));
		PartDefinition bone13 = right_lower_leg.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(28, 22).addBox(-1.0F, -0.4093F, 0.2791F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 122)
				.addBox(-1.5F, -0.4083F, -1.2209F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 123).addBox(-2.0F, 1.5917F, -5.2209F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.4093F, -0.2791F, 0.2182F, 0.0F, 0.0F));
		PartDefinition LeftArm_r2 = bone13.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(44, 115).addBox(0.5F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 115).addBox(-0.5F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 115)
						.addBox(-1.5F, -1.0F, -4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(37, 122).addBox(-2.0F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.7259F, -1.3157F, 0.2182F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(14, 38).addBox(-8.05F, -13.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 38).addBox(6.05F, -13.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(57, 18)
						.addBox(-4.5F, -4.5F, -3.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(70, 52).addBox(-4.0F, -6.5F, -2.5F, 8.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 52)
						.addBox(-0.5F, -13.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(57, 0).addBox(-4.5F, -14.5F, -4.0F, 9.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, 5.0F, 1.3526F, 0.0F, 0.0F));
		PartDefinition LeftArm_r3 = Body.addOrReplaceChild("LeftArm_r3",
				CubeListBuilder.create().texOffs(87, 77).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(63, 78).addBox(12.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.99F, -13.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(0, 43).addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(27, 42).addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 94)
						.addBox(1.0F, -25.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(59, 90).addBox(-0.5F, -25.0F, -4.5F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(1, 105)
						.addBox(-1.5F, -25.0F, -1.0F, 9.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 94).addBox(1.0F, -22.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
						.addBox(-1.0F, -17.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(103, 3).addBox(2.0F, -30.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 2)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(24, 23).addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(24, 23)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(23, 2).addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(36, 35)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
