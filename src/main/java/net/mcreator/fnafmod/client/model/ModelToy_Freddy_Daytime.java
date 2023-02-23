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
public class ModelToy_Freddy_Daytime<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_toy_freddy_daytime"), "main");
	public final ModelPart Head;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Body;

	public ModelToy_Freddy_Daytime(ModelPart root) {
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 26).addBox(-5.0F, -3.2F, -3.3F, 10.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 19).addBox(-3.0F, -3.7F, 1.7F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 20)
						.addBox(-4.5F, -8.2F, -3.3F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 12).addBox(-3.0F, -9.2F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(54, 15)
						.addBox(-2.0F, -13.2F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.3F, 1.0F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 1.6F, 0.2182F, 0.0F, 0.0F));
		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -7.0F, 3.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -11.0F, 4.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(15, 58).addBox(9.7381F, -5.4048F, 0.7857F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(13.2381F, -4.9048F, -1.7143F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(2, 36)
						.addBox(13.2381F, -3.9048F, -2.7143F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 13).addBox(12.2381F, -1.4048F, 0.7857F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 37)
						.addBox(11.2381F, -0.9048F, -3.2143F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 15).addBox(10.7381F, -1.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 59)
						.addBox(10.7381F, -3.2048F, -0.7143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 59).addBox(14.4381F, -3.2048F, -0.7143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 15)
						.addBox(14.7381F, -1.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0).addBox(14.7381F, -4.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(10.7381F, -4.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(10.7381F, -4.4048F, -1.2143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(14.7381F, -4.4048F, -1.2143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 18).addBox(12.2381F, -0.4048F, 0.7857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 28)
						.addBox(11.7381F, -0.4048F, -2.7143F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(66, 65).addBox(10.7381F, -2.9048F, -3.1143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 4)
						.addBox(10.2381F, -3.4048F, -3.6143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 4).addBox(13.2381F, -3.4048F, -3.6143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(66, 65)
						.addBox(13.7381F, -2.9048F, -3.1143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(14.1381F, -2.4048F, -3.2143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(11.3381F, -2.4048F, -3.2143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -2.2952F, 0.4143F));
		PartDefinition RightEar2 = endo_head.addOrReplaceChild("RightEar2",
				CubeListBuilder.create().texOffs(28, 48).addBox(-2.9239F, -6.3817F, -0.4982F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 37).addBox(-1.9239F, -4.3827F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.8381F, -4.2048F, -0.2143F, 0.0F, 0.0F, -0.7854F));
		PartDefinition RightTop = RightEar2.addOrReplaceChild("RightTop", CubeListBuilder.create(), PartPose.offset(-1.1F, -8.7F, 0.0F));
		PartDefinition LeftEar2 = endo_head.addOrReplaceChild("LeftEar2",
				CubeListBuilder.create().texOffs(44, 49).addBox(-1.0431F, -5.9981F, -0.5431F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 37).addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.6381F, -4.2048F, -0.2143F, 0.0F, 0.0F, 0.7854F));
		PartDefinition LeftTop = LeftEar2.addOrReplaceChild("LeftTop", CubeListBuilder.create(), PartPose.offset(0.0F, -8.7F, 0.0F));
		PartDefinition bone10 = endo_head.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(14.2381F, -4.6359F, -4.5256F));
		PartDefinition Head_r1 = bone10.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(28, 19).addBox(-4.5F, -0.4F, 0.6F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));
		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(), PartPose.offset(13.2381F, 1.8452F, 0.7857F));
		PartDefinition cube_r1 = endoi_jaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(64, 28).addBox(-1.5F, -0.75F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(31, 58).addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition snout = Head.addOrReplaceChild("snout",
				CubeListBuilder.create().texOffs(43, 58).addBox(11.5F, -18.0F, -8.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 15).addBox(12.0F, -18.5F, -7.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 15)
						.addBox(12.0F, -20.0F, -7.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(35, 40).addBox(13.0F, -22.0F, -8.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 42)
						.addBox(11.0F, -21.5F, -8.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.0F, 18.3F, 2.7F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 67).addBox(-0.35F, 0.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 49)
				.addBox(-1.85F, 1.6F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 11).addBox(-0.8F, 6.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -1.0F, 1.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(4, 67).addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 59).addBox(-1.3F, 0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.3F, 0.0F));
		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2", CubeListBuilder.create().texOffs(24, 63).addBox(-0.89F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 49)
				.addBox(1.11F, 0.7F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-0.89F, 1.7F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(32, 49).addBox(-2.0F, 1.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
				.addBox(-0.5F, 0.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 11).addBox(-1.0F, 6.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -1.0F, 1.0F, -0.9156F, 0.0942F, 0.5445F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(4, 67).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 59).addBox(-1.5F, 0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.3F, 0.0F, -0.9552F, -0.4446F, -0.6752F));
		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(34, 63).addBox(-0.91F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(15, 37).addBox(0.09F, 0.7F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 6)
						.addBox(0.59F, 1.2F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 62).addBox(-0.91F, 1.7F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 23)
						.addBox(1.09F, 0.7F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 5.5F, 0.0F, -0.053F, 0.023F, -0.481F));
		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6176F, 0.1319F, -1.0F, 0.0F, 0.0F, 2.9671F));
		PartDefinition bone6 = right_hand.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(14.7176F, 3.6319F, -2.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(66, 11).addBox(-1.0019F, 6.0F, -1.0436F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
				.addBox(-2.6F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.6F, 9.0F, 1.0F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(60, 23).addBox(-1.5F, 6.901F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 31).addBox(-2.6F, 5.901F, -6.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 40)
						.addBox(-2.6F, 4.901F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 1.001F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 48)
						.addBox(-2.1F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition bone7 = bone4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-0.5F, 7.0F, -1.5F));
		PartDefinition bone9 = bone4.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 7.0F, 0.7F, 0.0F, -0.1309F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(66, 11).addBox(-1.0019F, 6.0F, -0.9564F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
				.addBox(-2.5F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 9.0F, 1.0F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(0, 49).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 1.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition bone8 = right_lower_leg.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(50, 31).addBox(-2.8F, -1.099F, -7.2F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 23)
				.addBox(-1.8F, -0.099F, -2.7F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 40).addBox(-2.8F, -2.099F, -3.2F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.3F, 7.0F, 0.7F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(12, 63).addBox(-3.0F, -15.0F, -4.9F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 5).addBox(-1.0F, -14.0F, -5.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -11.0F, -4.4F, 12.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(26, 31).addBox(-4.5F, -4.5F, -3.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -9.5F, -4.9F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.5F, -11.5F, -4.9F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-5.0F, -14.0F, -4.4F, 10.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(60, 46).addBox(-6.5F, -13.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 46)
						.addBox(3.5F, -13.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 1.0F));
		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, -3.5F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(61, 55).addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 20).addBox(2.0F, -18.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 0)
						.addBox(-1.0F, -17.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 15).addBox(2.0F, -28.5F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 26)
						.addBox(2.5F, -29.5F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(0, 26)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(40, 40).addBox(-0.5F, -26.0F, -2.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
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
