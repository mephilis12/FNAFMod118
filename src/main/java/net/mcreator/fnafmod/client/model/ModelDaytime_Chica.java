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
public class ModelDaytime_Chica<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_daytime_chica"), "main");
	public final ModelPart Body;

	public ModelDaytime_Chica(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(84, 0).addBox(-4.0F, -14.0F, -4.5F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(83, 37)
						.addBox(-4.5F, -10.0F, -4.5F, 9.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-4.5F, -3.0F, -3.5F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-6.99F, -13.51F, -0.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(4.99F, -13.51F, -0.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 1.0F));
		PartDefinition LeftArm_r1 = Body.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(58, 4).addBox(-0.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 56)
						.addBox(11.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.99F, -13.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(98, 118).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(81, 84)
						.addBox(-4.5F, -5.0F, -4.0F, 9.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(-2.0F, -2.0F, -7.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(1, 95).addBox(-1.0F, -3.0F, -6.0F, 2.0F,
								1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.8F, 0.0F, -0.0436F, 0.1745F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(46, 4).addBox(-4.0F, -1.9F, 0.3F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.4312F, -5.6113F, -0.8727F, 0.0F, 0.0F));
		PartDefinition bone14 = Head.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -12.5743F, -2.0001F, 0.0F, 2.0944F, 0.0F));
		PartDefinition RightEar_r1 = bone14.addOrReplaceChild("RightEar_r1",
				CubeListBuilder.create().texOffs(72, 105).addBox(-2.0392F, -3.2064F, -3.3327F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5743F, -0.9999F, 1.1781F, 0.0F, 0.0F));
		PartDefinition bone12 = Head.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, -12.5743F, -2.0001F, 0.0F, -2.0944F, 0.0F));
		PartDefinition RightEar_r2 = bone12.addOrReplaceChild("RightEar_r2",
				CubeListBuilder.create().texOffs(72, 105).addBox(0.0392F, -1.6062F, -2.6698F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5743F, -0.9999F, 1.1781F, 0.0F, 0.0F));
		PartDefinition bone13 = bone12.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(62, 124).addBox(-2.5F, 3.5743F, 0.0001F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));
		PartDefinition RightEar_r3 = bone13.addOrReplaceChild("RightEar_r3",
				CubeListBuilder.create().texOffs(72, 105).addBox(-2.5F, -0.9281F, -2.389F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5743F, -0.9999F, 1.1781F, 0.0F, 0.0F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(35, 119).addBox(-2.0F, -0.9F, -7.2F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.7F, 0.1F, 0.2618F, 0.0F, 0.0F));
		PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.0F, -10.0F, 1.0F, 0.0F, 0.0F, -1.1781F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(48, 77).addBox(10.2381F, -1.4048F, 0.2857F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(0, 58).addBox(9.7381F, -5.4048F, -0.2143F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 27)
						.addBox(11.7381F, -0.9048F, -2.2143F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 17)
						.addBox(12.2381F, -0.4048F, 0.7857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 63)
						.addBox(12.2381F, -0.4048F, -2.0143F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(65, 65)
						.addBox(10.2381F, -3.7048F, -2.2143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 46)
						.addBox(9.8381F, -4.2048F, -2.7143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 46)
						.addBox(13.6381F, -4.2048F, -2.7143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(65, 65)
						.addBox(14.2381F, -3.7048F, -2.2143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 18)
						.addBox(14.5381F, -3.2048F, -2.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 18).addBox(10.9381F, -3.2048F,
								-2.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));
		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(), PartPose.offset(13.2381F, 1.8452F, 0.7857F));
		PartDefinition cube_r1 = endoi_jaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(55, 63).addBox(-1.0F, -0.75F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 41)
						.addBox(-1.5F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 49).addBox(-1.85F, 1.6F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 66)
						.addBox(-0.35F, 1.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 49).addBox(-0.8F, 7.5F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -13.0F, 0.0F, 0.2564F, -0.0665F, -0.493F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(44, 56).addBox(-1.49F, 0.2F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 66)
						.addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.9148F, -0.0791F, 0.5739F));
		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2",
				CubeListBuilder.create().texOffs(61, 32).addBox(-0.9F, 0.2F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 21)
						.addBox(1.3F, 0.4F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(28, 21)
						.addBox(1.3F, 0.4F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(23, 21)
						.addBox(-0.39F, 0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 19)
						.addBox(0.11F, 0.7F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 34).addBox(-0.59F, 2.2F, -1.5F, 2.0F,
								1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 3.1416F, -0.8727F, -3.1416F));
		PartDefinition LeftArm_r2 = right_hand2.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(42, 38).addBox(-0.7F, -0.8F, 0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(52, 5)
						.addBox(-0.7F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(42, 38).addBox(-0.7F, -0.8F, -1.9F, 2.0F,
								1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 3.2F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition RightArm = Body.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(32, 49).addBox(-2.01F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 66)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 49).addBox(-1.0F, 7.5F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(29, 66).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 56)
						.addBox(-1.49F, 0.2F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.9599F, 0.0F, 0.0F));
		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(61, 32).addBox(-0.91F, 0.2F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 21)
						.addBox(-0.41F, 0.7F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-0.41F, 0.7F, -0.5F, 1.0F,
								2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.09F, 5.5F, 0.0F, -2.2245F, 0.8024F, -2.0742F));
		PartDefinition LeftArm_r3 = right_hand.addOrReplaceChild("LeftArm_r3",
				CubeListBuilder.create().texOffs(42, 38).addBox(-0.7F, -0.6F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(52, 5)
						.addBox(-0.7F, -0.6F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(42, 38).addBox(-0.7F, -0.6F, -1.8F, 2.0F,
								1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.01F, 3.2F, 0.9F, 0.0F, 0.0F, 0.9163F));
		PartDefinition LeftArm_r4 = right_hand.addOrReplaceChild("LeftArm_r4",
				CubeListBuilder.create().texOffs(36, 63).addBox(-0.6F, -0.1F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.39F, 2.7F, 1.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(28, 21).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.0203F, 1.2294F, -1.7F, 1.2217F, 0.0F, 2.2253F));
		PartDefinition bone6 = right_hand.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(13, 112).addBox(-6.0F, -5.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.1186F, 3.1286F, 1.0F));
		PartDefinition cupcake = bone6.addOrReplaceChild("cupcake",
				CubeListBuilder.create().texOffs(76, 112).mirror().addBox(-3.0286F, 2.0714F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(67, 119).mirror().addBox(-1.5286F, -4.4286F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(92, 122).addBox(-1.0286F, -5.4286F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(74, 119).addBox(-3.5286F, -1.4286F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(72, 120)
						.addBox(1.2714F, 2.0714F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(89, 119)
						.addBox(1.4714F, 0.0714F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 114)
						.addBox(1.3714F, -0.9286F, -2.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(18, 41).addBox(-1.9564F, 1.0F, -2.5019F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-1.0F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 78).addBox(-1.5F, 5.5F, -3.0F, 3.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, -2.0F, 0.0F, -0.0452F, -0.2615F, 0.0117F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 120).addBox(-1.5F, 0.5F, -1.2F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 13)
						.addBox(-1.5F, 6.901F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 1.001F, -0.5F, 2.0F,
								6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition bone9 = bone4.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(48, 34).addBox(-1.9F, -1.0F, -3.2F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 7.0F, 0.7F, 0.0F, -0.1309F, 0.0F));
		PartDefinition RightLeg_r1 = bone9.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(74, 5).addBox(-0.3F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.0F, -2.2F, 0.0F, -0.3927F, 0.0F));
		PartDefinition RightLeg_r2 = bone9.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(26, 74).addBox(-1.5F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.0F, -2.2F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(44, 49).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-2.0436F, 1.0F, -2.5019F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 78)
						.addBox(-1.5F, 5.5F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -2.0F, 0.0F, 0.0059F, 0.2617F, 0.0448F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(0, 120).addBox(-1.5F, 0.5F, -1.2F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 13).addBox(-1.5F, 6.901F, -2.0F, 3.0F,
								1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition bone8 = right_lower_leg.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(48, 34).addBox(-2.0F, -1.0F, -3.2F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.7F, -0.0494F, 0.1308F, -0.044F));
		PartDefinition RightLeg_r3 = bone8.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(26, 74).addBox(-1.7F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg_r4 = bone8.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(74, 5).addBox(-0.3F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone = Body.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(20, 101).addBox(-3.5F, -2.5F, -1.4F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, -3.5F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(0, 63).addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(78, 64)
						.addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(49, 90)
						.addBox(0.5F, -17.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 85)
						.addBox(1.5F, -31.5F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(1.8F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(3.2F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 2)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 7)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(26, 7)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(26, 2)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));
		PartDefinition bone7 = Body.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(0, 82).addBox(1.2125F, -0.2017F, -1.5F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -17.2F, 1.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone10 = Body.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(43, 102).addBox(-4.7668F, 8.9542F, -1.5F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -27.5F, 1.5F, 0.0F, 0.0F, -0.3927F));
		PartDefinition bone11 = Body.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(43, 102).addBox(0.9952F, 10.1022F, -1.5F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -27.5F, 1.5F, 0.0F, 0.0F, 0.3927F));
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
