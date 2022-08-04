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
public class ModelUnwitheredChica<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_unwithered_chica"),
			"main");
	public final ModelPart Head;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Body;
	public final ModelPart bb_main;

	public ModelUnwitheredChica(ModelPart root) {
		this.Head = root.getChild("Head");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Body = root.getChild("Body");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 31)
						.addBox(-3.6F, -5.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 31)
						.addBox(3.6F, -5.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 20)
						.addBox(-2.1F, -2.2F, -8.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 8)
						.addBox(-2.5F, -4.0F, -9.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 44)
						.addBox(-1.0F, -5.0F, -10.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.8F, 1.0F));
		PartDefinition RightEar_r1 = Head.addOrReplaceChild("RightEar_r1",
				CubeListBuilder.create().texOffs(54, 5).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -1.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone7 = Head.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -10.5743F, -1.0001F, 0.0F, 0.0F, 0.0F));
		PartDefinition RightEar_r2 = bone7.addOrReplaceChild("RightEar_r2",
				CubeListBuilder.create().texOffs(43, 20).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5743F, -0.9999F, 1.1781F, 0.0F, 0.0F));
		PartDefinition bone6 = Head.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -10.5743F, -1.0001F, 0.0F, 2.0944F, 0.0F));
		PartDefinition RightEar_r3 = bone6.addOrReplaceChild("RightEar_r3",
				CubeListBuilder.create().texOffs(43, 20).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5743F, -0.9999F, 1.1781F, 0.0F, 0.0F));
		PartDefinition bone5 = Head.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -10.5743F, -1.0001F, 0.0F, -2.0944F, 0.0F));
		PartDefinition RightEar_r4 = bone5.addOrReplaceChild("RightEar_r4",
				CubeListBuilder.create().texOffs(43, 20).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5743F, -0.9999F, 1.1781F, 0.0F, 0.0F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(48, 0).addBox(-3.5F, -0.5176F, -6.9319F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(59, 44)
						.addBox(-2.5F, -0.5176F, -8.9319F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-4.5F, -0.5176F, -3.9319F, 9.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 20)
						.addBox(-3.0F, -1.5176F, -5.2319F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 20)
						.addBox(-2.0F, -1.5176F, -8.4319F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.4F, 0.1F, 0.1745F, 0.0F, 0.0F));
		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.5F, -7.0F, -1.0F, 0.2182F, 0.0F, 0.3491F));
		PartDefinition LeftTop = LeftEar.addOrReplaceChild("LeftTop", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.5F, -7.0F, -1.0F, 0.2182F, 0.0F, -0.3491F));
		PartDefinition RightTop = RightEar.addOrReplaceChild("RightTop", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(0, 45).addBox(10.2381F, -1.4048F, 1.2857F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(55, 14).addBox(9.7381F, -5.4048F, 0.7857F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 23)
						.addBox(13.2381F, -4.9048F, -1.7143F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 16)
						.addBox(13.2381F, -3.9048F, -2.7143F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 27)
						.addBox(12.2381F, -1.4048F, 0.7857F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 54)
						.addBox(11.2381F, -0.9048F, -3.2143F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 15)
						.addBox(10.7381F, -1.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 33)
						.addBox(10.7381F, -1.2048F, -0.7143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 33)
						.addBox(14.4381F, -3.2048F, -0.7143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 15)
						.addBox(14.7381F, -1.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(14.7381F, -4.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(10.7381F, -4.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 26)
						.addBox(10.7381F, -4.4048F, -1.2143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 26)
						.addBox(14.7381F, -4.4048F, -1.2143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 20)
						.addBox(12.2381F, -0.4048F, 0.7857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 19)
						.addBox(11.7381F, -0.4048F, -2.7143F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(75, 23)
						.addBox(9.7381F, -5.7048F, -3.2143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(75, 23)
						.addBox(13.7381F, -5.7048F, -3.2143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(10.7381F, -4.6048F,
								-3.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));
		PartDefinition cube_r1 = endo_head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(62, 54).addBox(-1.5F, -0.75F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2381F, 1.8452F, -1.2143F, 0.1745F, 0.0F, 0.0F));
		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(), PartPose.offset(13.2381F, 1.8452F, 0.7857F));
		PartDefinition cube_r2 = endoi_jaw.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(54, 39).addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.01F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 63)
						.addBox(-0.35F, 1.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 25)
						.addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 63)
						.addBox(-0.85F, 7.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(6.0F, -2.0F, 1.0F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(40, 49).addBox(-1.49F, 0.2F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.8F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.3F, 0.0F));
		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2",
				CubeListBuilder.create().texOffs(4, 96).addBox(-0.7F, 2.4F, -1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(13, 92)
						.addBox(-0.9F, 0.2F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 96)
						.addBox(-0.7F, 2.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(4, 96)
						.addBox(-0.7F, 2.4F, 0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(6, 78)
						.addBox(0.3F, 0.4F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(1, 78)
						.addBox(-0.39F, 0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 100).addBox(-0.59F, 2.2F, -1.5F, 2.0F,
								1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(12, 41).addBox(-2.01F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 25)
						.addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 63)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 63)
						.addBox(-1.05F, 7.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(-6.0F, -2.0F, 1.0F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 59)
						.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 51)
						.addBox(-1.49F, 0.2F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.3F, 0.0F));
		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(4, 96).addBox(-0.71F, 2.4F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(6, 78)
						.addBox(0.29F, 0.4F, -1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(13, 92)
						.addBox(-0.91F, 0.2F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(1, 78)
						.addBox(-0.41F, 0.7F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 100)
						.addBox(-0.61F, 2.2F, -0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 89)
						.addBox(0.09F, 0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-0.41F, 0.7F, -0.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 96)
						.addBox(-0.71F, 2.4F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(4, 96).addBox(-0.71F, 2.4F, 1.9F, 2.0F, 1.0F,
								1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.09F, 5.5F, -1.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition bone10 = right_hand.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1176F, 1.1319F, 0.0F, 0.0F, 0.0F, 2.9671F));
		PartDefinition bone11 = right_hand.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(14.2176F, 4.6319F, -1.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(28, 43).addBox(-0.9F, 3.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 33)
						.addBox(-1.4F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 63)
						.addBox(-0.4019F, 3.0F, -1.0436F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(28, 62)
						.addBox(-0.4F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 1.0F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 47).addBox(0.6F, -8.0F, 0.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 58)
						.addBox(1.1F, -2.199F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 20)
						.addBox(1.6F, -4.499F, 2.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.6F, -8.199F, 1.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 13.0F, -2.0F));
		PartDefinition LeftArm_r1 = bone4.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(22, 0).addBox(-1.5F, 0.2898F, -2.0776F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, -1.999F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone9 = bone4.addOrReplaceChild(
				"bone9", CubeListBuilder.create().texOffs(60, 48).addBox(-0.9F, -1.0F, -7.2F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(43, 28).addBox(-1.9F, -1.0F, -3.2F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, -2.0F, 2.7F));
		PartDefinition RightLeg_r1 = bone9.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(62, 5).addBox(-0.3F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.0F, -2.2F, 0.0F, -0.3927F, 0.0F));
		PartDefinition RightLeg_r2 = bone9.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(10, 60).addBox(-1.5F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.0F, -2.2F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(36, 63).addBox(-1.5019F, 3.0F, -0.9564F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
						.texOffs(28, 62).addBox(-1.5F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 39)
						.addBox(-2.5F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 43)
						.addBox(-2.0F, 3.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 1.0F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(24, 47).addBox(-4.5F, -8.0F, 0.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.5F, -8.2F, 1.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 20)
						.addBox(-3.5F, -4.5F, 2.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 58)
						.addBox(-4.0F, -2.199F, 0.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 13.0F, -2.0F));
		PartDefinition LeftArm_r2 = right_lower_leg.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(22, 0).addBox(-1.5F, 0.2898F, -2.0776F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -1.999F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone8 = right_lower_leg.addOrReplaceChild(
				"bone8", CubeListBuilder.create().texOffs(43, 28).addBox(-2.0F, -1.0F, -3.2F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(60, 48).addBox(-1.0F, -1.0F, -7.2F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, -2.0F, 2.7F));
		PartDefinition RightLeg_r3 = bone8.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(10, 60).addBox(-1.7F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg_r4 = bone8.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(62, 5).addBox(-0.3F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.0F, -0.3927F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(50, 59).addBox(-3.0F, -13.5F, -4.5F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 8)
						.addBox(-4.0F, -14.0F, -4.0F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-4.5F, -9.0F, -4.0F, 9.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-4.5F, -4.5F, -3.5F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 63)
						.addBox(-7.05F, -13.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(36, 63)
						.addBox(5.05F, -13.2F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(0.0F, 11.0F, 1.0F));
		PartDefinition LeftArm_r3 = Body.addOrReplaceChild("LeftArm_r3",
				CubeListBuilder.create().texOffs(26, 55).addBox(-1.5F, -2.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(10.5F, -2.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.99F, -13.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, -3.5F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(60, 33).addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 25)
						.addBox(2.0F, -18.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 35)
						.addBox(-1.0F, -17.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(2.5F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 2)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(25, 21)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(25, 21)
						.addBox(9.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(25, 21)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(25, 21)
						.addBox(-4.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(24, 2)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(30, 24)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(50, 39).addBox(0.0F, -28.5F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
