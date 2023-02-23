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
public class ModelCrawling_Mangle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_crawling_mangle"), "main");
	public final ModelPart LeftArm;
	public final ModelPart RightArmHead;
	public final ModelPart RightArm;
	public final ModelPart LeftLowerLeg;
	public final ModelPart BackLowerLeg;
	public final ModelPart RightLoweLeg;
	public final ModelPart Neck3;
	public final ModelPart Body;

	public ModelCrawling_Mangle(ModelPart root) {
		this.LeftArm = root.getChild("LeftArm");
		this.RightArmHead = root.getChild("RightArmHead");
		this.RightArm = root.getChild("RightArm");
		this.LeftLowerLeg = root.getChild("LeftLowerLeg");
		this.BackLowerLeg = root.getChild("BackLowerLeg");
		this.RightLoweLeg = root.getChild("RightLoweLeg");
		this.Neck3 = root.getChild("Neck3");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(23, 52).addBox(-0.35F, 1.1F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 37)
				.addBox(-1.35F, 1.1F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-0.8F, 7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5F, 17.5F, -9.0F, 1.9253F, -0.0731F, 0.6623F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 13).addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 30)
				.addBox(-0.8F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-0.8F, 6.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.8F, 0.0F, -1.4835F, 0.0F, 0.0F));
		PartDefinition LeftArm2 = bone3.addOrReplaceChild("LeftArm2", CubeListBuilder.create().texOffs(23, 52).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 37)
				.addBox(-1.5F, 1.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-0.95F, 6.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 7.2F, 0.0F, 0.7854F, 0.0F, -0.6981F));
		PartDefinition bone5 = LeftArm2.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 13).addBox(-0.45F, 1.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 37)
				.addBox(-1.5F, 1.1F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-0.95F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.9F, 0.0F, 0.1745F, 0.0F, 0.829F));
		PartDefinition RightArmHead = partdefinition.addOrReplaceChild("RightArmHead", CubeListBuilder.create().texOffs(29, 37).addBox(-1.5F, 2.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 52)
				.addBox(-0.5F, 1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, 16.5F, -9.0F, 1.6581F, 0.0F, 1.9199F));
		PartDefinition bone2 = RightArmHead.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 24).addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.8F, 0.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition endo_head2 = bone2.addOrReplaceChild("endo_head2",
				CubeListBuilder.create().texOffs(28, 12).addBox(-3.0F, -3.5F, 0.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 35).addBox(-3.5F, -7.5F, 0.0F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(0.0F, -7.0F, -4.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 53).addBox(-1.0F, -3.5F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 0)
						.addBox(-2.0F, -3.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 51).addBox(-5.5F, -7.5F, -1.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -6.5F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.5F, -6.5F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 45)
						.addBox(1.2F, -5.3F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(-1.0F, -2.5F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 14)
						.addBox(-1.5F, -2.5F, -3.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 37).addBox(0.5F, -6.3F, -3.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 4)
						.addBox(1.0F, -5.8F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 18).addBox(1.5F, -5.3F, -3.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.7F, 0.0F, 0.0F, 0.0F, -2.0071F));
		PartDefinition endoi_jaw2 = endo_head2.addOrReplaceChild("endoi_jaw2", CubeListBuilder.create(), PartPose.offset(0.5F, 0.75F, -0.3F));
		PartDefinition cube_r1 = endoi_jaw2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(46, 14).addBox(-1.5F, -0.75F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -1.0F, -1.7F, 0.1745F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(50, 36).addBox(-1.0F, 7.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 50).addBox(-1.0F, 1.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 19.0F, 1.0F, 1.5639F, 0.0325F, 1.5764F));
		PartDefinition right_lower_leg = RightArm.addOrReplaceChild("right_lower_leg", CubeListBuilder.create().texOffs(49, 48).addBox(-1.0F, 1.0F, -1.1F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -0.9F, -0.0863F, 0.0064F, -0.9734F));
		PartDefinition right_hand3 = right_lower_leg.addOrReplaceChild("right_hand3", CubeListBuilder.create().texOffs(31, 45).addBox(-1.1F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 17)
				.addBox(0.9F, 1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 5).addBox(-1.1F, 2.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, -0.1F, 0.0F, 0.0F, 1.1345F));
		PartDefinition LeftLowerLeg = partdefinition.addOrReplaceChild("LeftLowerLeg",
				CubeListBuilder.create().texOffs(39, 26).addBox(-1.5F, 5.901F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 48).addBox(-1.0F, 0.001F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, 17.0F, -5.5F, -0.002F, -0.4276F, 0.0291F));
		PartDefinition bone7 = LeftLowerLeg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, 0.902F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 6.0F, -2.0F));
		PartDefinition RightLeg_r1 = bone7.addOrReplaceChild("RightLeg_r1", CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, 1.0F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.002F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg_r2 = bone7.addOrReplaceChild("RightLeg_r2", CubeListBuilder.create().texOffs(18, 0).addBox(-0.3F, 1.0F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.002F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone9 = LeftLowerLeg.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 6.0F, 0.2F, 0.0F, -0.1309F, 0.0F));
		PartDefinition BackLowerLeg = partdefinition.addOrReplaceChild("BackLowerLeg",
				CubeListBuilder.create().texOffs(39, 26).addBox(-1.3F, 5.901F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 48).addBox(-0.8F, 0.001F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 17.0F, 8.5F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone12 = BackLowerLeg.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(18, 0).addBox(-0.9F, 0.902F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, 6.0F, -2.0F));
		PartDefinition RightLeg_r3 = bone12.addOrReplaceChild("RightLeg_r3", CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, 1.0F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.002F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg_r4 = bone12.addOrReplaceChild("RightLeg_r4", CubeListBuilder.create().texOffs(18, 0).addBox(-0.3F, 1.0F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.002F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone13 = BackLowerLeg.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 6.0F, 0.2F, 0.0F, -0.1309F, 0.0F));
		PartDefinition RightLoweLeg = partdefinition.addOrReplaceChild("RightLoweLeg", CubeListBuilder.create().texOffs(49, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, 17.0F, -5.5F, 0.1329F, 0.173F, 0.023F));
		PartDefinition bone14 = RightLoweLeg.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(18, 29).addBox(-2.8F, -1.099F, -7.2F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 21)
				.addBox(-1.8F, -0.099F, -2.7F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 21).addBox(-2.8F, -2.099F, -3.2F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3F, 6.0F, 0.2F, -0.0873F, 0.0F, 0.0F));
		PartDefinition Neck3 = partdefinition.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 24)
				.addBox(-0.5F, 1.1F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-0.5F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 13.4F, -10.0F, -2.1273F, -0.1005F, -2.9294F));
		PartDefinition Head = Neck3.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 22).addBox(-7.0F, -8.2F, -1.0F, 14.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -9.2F, -4.5F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(21, 13)
						.addBox(-6.0F, -4.2F, -4.5F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 32).addBox(-3.0F, -4.2F, -7.5F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 29)
						.addBox(-1.0F, -5.2F, -9.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 0).addBox(-2.0F, -4.2F, -9.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.0F, -2.2F, -9.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, -2.0345F, -0.2651F, -3.0497F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(28, 12).addBox(11.7381F, 4.0952F, 0.5857F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 35).addBox(11.2381F, 0.0952F, 0.0857F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(14.7381F, 0.5952F, -3.9143F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 53).addBox(13.7381F, 4.0952F, 0.0857F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 0)
						.addBox(12.7381F, 4.5952F, -3.9143F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 13).addBox(12.2381F, 4.0952F, -1.9143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 45)
						.addBox(12.2381F, 2.2952F, -1.4143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 45).addBox(15.9381F, 2.2952F, -1.4143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 13)
						.addBox(16.2381F, 4.0952F, -1.9143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 0).addBox(16.2381F, 1.0952F, -1.9143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 0)
						.addBox(12.2381F, 1.0952F, -1.9143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 15).addBox(12.2381F, 1.0952F, -1.9143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 15)
						.addBox(16.2381F, 1.0952F, -1.9143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(13.7381F, 5.0952F, 0.0857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 14)
						.addBox(13.2381F, 5.0952F, -3.4143F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 4).addBox(11.7381F, 1.7952F, -2.9143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 37)
						.addBox(11.2381F, 1.2952F, -3.4143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 37).addBox(15.2381F, 1.2952F, -3.4143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 22)
						.addBox(15.7381F, 1.7952F, -2.9143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 9).addBox(16.2381F, 2.2952F, -3.0143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 18)
						.addBox(12.2381F, 2.2952F, -3.0143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.7381F, -8.0952F, -0.5857F));
		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(), PartPose.offset(13.2381F, 1.8452F, 0.7857F));
		PartDefinition cube_r2 = endoi_jaw.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(46, 14).addBox(-1.5F, -0.75F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-3.5F, -0.25F, -2.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-2.5F, 1.75F, 0.5F, 5.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 46).addBox(-1.5F, -0.75F, -5.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 6)
						.addBox(-2.5F, -0.25F, -6.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 5.5F, -2.7F, 0.1745F, 0.0F, 0.0F));
		PartDefinition LeftEar = endo_head.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 43).addBox(-2.0F, -8.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.7381F, 0.6952F, -0.4143F, 0.0F, 0.0F, 0.7854F));
		PartDefinition RightEar = endo_head.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 45).addBox(-2.5F, -8.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.7381F, 0.6952F, -0.4143F, 0.0F, 0.0F, -0.7854F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 1.0F));
		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(50, 36).addBox(-0.5019F, 6.0F, -1.0436F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 50).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, -1.9778F, -0.4149F, -0.1393F));
		PartDefinition BackLeg = Body.addOrReplaceChild("BackLeg",
				CubeListBuilder.create().texOffs(50, 36).addBox(-1.4019F, 6.0F, -1.0436F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 50).addBox(-1.4F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1F, -3.0F, 1.0F, 1.1786F, 0.0865F, -3.1302F));
		PartDefinition RightLeg2 = Body.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(50, 36).addBox(-1.5019F, 6.0F, -0.9564F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 50).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 0.0F, -2.0805F, 0.2909F, 0.0945F));
		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, -3.5F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(28, 17).addBox(-1.0F, -17.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 50).addBox(1.0F, -15.0F, -2.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));
		PartDefinition bone6 = endo_torso.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(16, 49).addBox(-4.0F, 0.4644F, -0.3247F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 40).addBox(-5.0F, -0.5356F, 2.6753F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, -17.0F, 0.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition bone4 = endo_torso.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(48, 18).addBox(-1.3758F, -2.25F, -1.4192F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-7.3658F, -9.76F, -0.9092F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 36)
						.addBox(-2.3658F, -9.76F, -1.9092F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(5.6142F, -9.76F, -0.9092F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 40)
						.addBox(-0.8758F, -1.25F, -0.9192F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 41).addBox(-0.8758F, -11.75F, -0.9192F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 26)
						.addBox(-0.3758F, -13.25F, -0.4192F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 54).addBox(3.6242F, -9.75F, -0.9192F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(22, 4)
						.addBox(4.6242F, -9.25F, 0.0808F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(22, 4).addBox(-6.3758F, -9.25F, 0.0808F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(0, 54)
						.addBox(-4.3758F, -9.75F, -0.9192F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(0, 26).addBox(-3.3758F, -9.25F, -0.9192F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8758F, -16.75F, -1.0808F, 1.4399F, 0.0F, 0.0F));
		PartDefinition right_hand4 = bone4.addOrReplaceChild("right_hand4", CubeListBuilder.create().texOffs(31, 45).addBox(-1.0F, -0.2F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 17)
				.addBox(1.0F, 0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 5).addBox(-1.0F, 1.8F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1242F, -12.05F, 0.0808F, -1.5708F, 0.2182F, 1.5708F));
		PartDefinition Neck = bone4.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(50, 24).addBox(-1.0F, 2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 52)
				.addBox(-0.5F, 1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3758F, -8.75F, -0.9192F, 2.3637F, -0.1334F, 3.0287F));
		PartDefinition Neck2 = Neck.addOrReplaceChild("Neck2",
				CubeListBuilder.create().texOffs(23, 52).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-1.0F, 6.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 24)
						.addBox(-1.0F, 2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 37).addBox(-1.0F, 3.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 10)
						.addBox(-3.0F, 2.0F, -1.5F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -2.4435F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArmHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLowerLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackLowerLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLoweLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.LeftArm.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.BackLowerLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.RightLoweLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightArmHead.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLowerLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Neck3.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Neck3.xRot = headPitch / (180F / (float) Math.PI);
	}
}
