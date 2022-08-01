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
public class ModelToy_Bonnie_Day<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_toy_bonnie_day"), "main");
	public final ModelPart Head;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Body;
	public final ModelPart group;

	public ModelToy_Bonnie_Day(ModelPart root) {
		this.Head = root.getChild("Head");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Body = root.getChild("Body");
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -2.2F, -4.8F, 10.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.8F, 1.0F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 0.2182F, 0.0F, 0.0F));
		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.5F, -6.0F, 2.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.5F, -10.0F, 3.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(26, 16).addBox(10.2381F, -1.4048F, 1.2857F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(0, 12).addBox(8.7381F, -5.9048F, -3.7143F, 9.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(50, 15)
						.addBox(9.7381F, -5.4048F, 0.7857F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 27)
						.addBox(13.2381F, -4.9048F, -1.7143F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 25)
						.addBox(13.2381F, -3.9048F, -2.7143F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 34)
						.addBox(12.2381F, -1.4048F, 0.7857F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 49)
						.addBox(11.2381F, -0.9048F, -3.2143F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 12)
						.addBox(10.7381F, -1.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 56)
						.addBox(10.7381F, -3.2048F, -0.7143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 56)
						.addBox(14.4381F, -3.2048F, -0.7143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 12)
						.addBox(14.7381F, -1.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(14.7381F, -4.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(10.7381F, -4.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 29)
						.addBox(10.7381F, -4.4048F, -1.2143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 29)
						.addBox(14.7381F, -4.4048F, -1.2143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 25)
						.addBox(12.2381F, -0.4048F, 0.7857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 0)
						.addBox(11.7381F, -0.4048F, -2.7143F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 38)
						.addBox(10.2381F, -2.9048F, -2.7143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 56)
						.addBox(9.7381F, -3.5048F, -3.2143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(13, 56)
						.addBox(13.7381F, -3.5048F, -3.2143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 38)
						.addBox(14.2381F, -2.9048F, -2.7143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(14.7381F, -2.4048F, -2.8143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(10.7381F, -2.4048F,
								-2.8143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));
		PartDefinition RightEar2 = endo_head.addOrReplaceChild("RightEar2",
				CubeListBuilder.create().texOffs(0, 59).addBox(-2.9239F, -8.3817F, -0.4982F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(20, 62).addBox(-1.9239F, -8.3827F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.8381F, -4.2048F, -0.2143F, 0.1304F, 0.0114F, -0.2611F));
		PartDefinition RightTop = RightEar2.addOrReplaceChild("RightTop",
				CubeListBuilder.create().texOffs(50, 60).addBox(-1.8239F, -5.1817F, -0.4982F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(28, 0).addBox(-0.8239F, -3.6817F, 0.0018F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1F, -8.7F, 0.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition LeftEar2 = endo_head.addOrReplaceChild("LeftEar2",
				CubeListBuilder.create().texOffs(40, 60).addBox(-2.0431F, -7.9981F, -0.5431F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(20, 62).addBox(-1.0F, -8.0F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.6381F, -4.2048F, -0.2143F, 0.1745F, 0.0F, 0.3491F));
		PartDefinition LeftTop = LeftEar2.addOrReplaceChild("LeftTop",
				CubeListBuilder.create().texOffs(60, 60).addBox(-2.0431F, -4.7981F, -0.5431F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(28, 0).addBox(-1.0431F, -3.2981F, -0.0431F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.7F, 0.0F, 0.7418F, 0.0F, 0.0F));
		PartDefinition bone10 = endo_head.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(14.2381F, -4.6359F, -4.5256F));
		PartDefinition Head_r1 = bone10.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(26, 15).addBox(-5.0F, -0.4F, 0.6F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));
		PartDefinition beak = endo_head.addOrReplaceChild("beak",
				CubeListBuilder.create().texOffs(49, 40).addBox(11.0F, -18.5F, -8.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 12)
						.addBox(12.0F, -19.5F, -8.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 12)
						.addBox(13.5F, -22.5F, -8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 52)
						.addBox(11.0F, -21.5F, -8.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.7619F, 20.5952F, 2.2857F));
		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(), PartPose.offset(13.2381F, 1.8452F, 0.7857F));
		PartDefinition cube_r1 = endoi_jaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(62, 0).addBox(-1.5F, -0.75F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 20)
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(44, 30).addBox(-1.0019F, 6.0F, -1.0436F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-2.6F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.6F, 9.0F, 1.0F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(15, 37).addBox(-1.5F, 6.901F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-2.6F, 5.901F, -6.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 44)
						.addBox(-2.6F, 4.901F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.001F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-2.1F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition bone7 = bone4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-0.5F, 7.0F, -1.5F));
		PartDefinition bone9 = bone4.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1F, 7.0F, 0.7F, 0.0F, -0.1309F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(44, 30).addBox(-1.0019F, 6.0F, -0.9564F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 32)
						.addBox(-2.5F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 9.0F, 1.0F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(49, 30).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 44)
						.addBox(-2.5F, 4.901F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-2.5F, 5.901F, -6.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 37)
						.addBox(-1.5F, 6.901F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition bone8 = right_lower_leg.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-4.7F, 7.0F, 0.7F));
		PartDefinition Body = partdefinition.addOrReplaceChild(
				"Body", CubeListBuilder.create().texOffs(53, 54).addBox(-6.5F, -13.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(53, 54).addBox(3.5F, -13.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 1.0F));
		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(36, 64).addBox(-0.35F, 0.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 4)
						.addBox(-1.5F, 1.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 30).addBox(-1.0F, 6.5F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -12.0F, 0.0F, -0.4687F, -0.4171F, -0.5264F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 25).addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 4)
						.addBox(-1.5F, 0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.3F, 0.0F, -1.4316F, 0.938F, 0.6129F));
		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2",
				CubeListBuilder.create().texOffs(10, 62).addBox(-0.89F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 53)
						.addBox(1.11F, 0.7F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, -2.2495F, 0.4895F, -2.1125F));
		PartDefinition LeftArm_r1 = right_hand2.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(53, 44).addBox(-0.5F, -0.5F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.39F, 2.2F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition RightArm = Body.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(29, 53).addBox(-1.5F, 1.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 64)
						.addBox(-0.5F, 0.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 30).addBox(-1.0F, 6.5F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -12.0F, 0.0F, -0.9448F, -0.8529F, 1.6358F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 53)
						.addBox(-1.5F, 0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.3F, 0.0F, -1.4984F, -0.0485F, 1.0336F));
		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(62, 46).addBox(-0.91F, 0.7F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 54)
						.addBox(1.09F, 1.7F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 4.5F, 0.0F, -0.575F, 1.2573F, -0.598F));
		PartDefinition LeftArm_r2 = right_hand.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(57, 25).addBox(-0.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-0.41F, 3.7F, 0.0F, 0.0F, 0.0F, 1.3526F));
		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.6176F, 1.1319F, -1.0F, 0.0F, 0.0F, 2.9671F));
		PartDefinition bone6 = right_hand.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(14.7176F, 4.6319F, -2.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, -3.5F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(61, 30).addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 17)
						.addBox(2.0F, -18.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(-1.0F, -17.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-1.5F, -17.5F, -4.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(41, 54)
						.addBox(1.5F, -17.5F, 2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(63, 52)
						.addBox(2.0F, -28.5F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 65)
						.addBox(2.5F, -29.5F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 65)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(24, 65)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(35, 44)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 18)
						.addBox(-1.0F, -27.0F, -4.9F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(41, 15)
						.addBox(2.0F, -27.0F, -5.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 61)
						.addBox(0.0F, -28.0F, -5.4F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-2.0F, -22.0F, -4.9F, 10.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));
		PartDefinition group = partdefinition.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(83, 101).addBox(-1.0F, -0.5F, -0.7823F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
						.texOffs(102, 101).addBox(-3.0F, -0.5F, -7.7823F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)).texOffs(102, 109)
						.addBox(-2.0F, -0.5F, 14.2177F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.5F, -4.2177F, 1.5708F, 0.0F, 0.8727F));
		PartDefinition cube_r2 = group.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(100, 118).addBox(0.2967F, -0.5F, -17.3732F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.4456F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r3 = group.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(83, 117).addBox(-4.2967F, -0.5F, -17.3732F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.4456F, 0.0F, -0.3927F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
