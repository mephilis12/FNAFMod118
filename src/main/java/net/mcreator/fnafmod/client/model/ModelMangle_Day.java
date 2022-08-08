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
public class ModelMangle_Day<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_mangle_day"), "main");
	public final ModelPart Body;

	public ModelMangle_Day(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(50, 36).addBox(-7.49F, -13.51F, -0.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 36)
						.addBox(-2.49F, -13.51F, -1.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 36)
						.addBox(5.49F, -13.51F, -0.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 26.0F, 1.0F));
		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(23, 52).addBox(-0.35F, 1.1F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 37)
						.addBox(-1.35F, 1.1F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-0.8F, 7.0F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, -12.5F, 0.0F, 0.2725F, -1.0619F, -0.6133F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 13).addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 30)
						.addBox(-0.8F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-0.8F, 6.2F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.8F, 0.0F, -1.4835F, 0.0F, 0.0F));
		PartDefinition LeftArm2 = bone3.addOrReplaceChild("LeftArm2",
				CubeListBuilder.create().texOffs(23, 52).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 37)
						.addBox(-1.5F, 1.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-0.95F, 6.9F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2F, 7.2F, 0.0F, 0.7854F, 0.0F, -0.6981F));
		PartDefinition bone5 = LeftArm2.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(0, 13).addBox(-0.45F, 1.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 37)
						.addBox(-1.5F, 1.1F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-0.95F, 6.0F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.9F, 0.0F, -0.3054F, 0.0F, 0.829F));
		PartDefinition RightArm = Body.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(29, 37).addBox(-1.5F, 2.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 52)
						.addBox(-0.5F, 1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-1.0F, 7.0F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, -12.5F, 0.0F, 2.514F, 0.6532F, 2.9662F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 24)
						.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.8F, 0.0F, -1.0409F, -0.7119F, 0.769F));
		PartDefinition endo_head2 = bone2.addOrReplaceChild("endo_head2",
				CubeListBuilder.create().texOffs(28, 12).addBox(-3.0F, -3.5F, 0.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 35)
						.addBox(-3.5F, -7.5F, 0.0F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(0.0F, -7.0F, -4.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 53)
						.addBox(-1.0F, -3.5F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 0)
						.addBox(-2.0F, -3.0F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 51)
						.addBox(-5.5F, -7.5F, -1.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -6.5F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.5F, -6.5F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 45)
						.addBox(1.2F, -5.3F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-1.0F, -2.5F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 14)
						.addBox(-1.5F, -2.5F, -3.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 37)
						.addBox(0.5F, -6.3F, -3.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 4)
						.addBox(1.0F, -5.8F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 18).addBox(1.5F, -5.3F, -3.1F, 1.0F, 1.0F,
								0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.7F, 0.0F, -0.0532F, 0.0692F, -2.6635F));
		PartDefinition endoi_jaw2 = endo_head2.addOrReplaceChild("endoi_jaw2", CubeListBuilder.create(), PartPose.offset(0.5F, 0.75F, -0.3F));
		PartDefinition cube_r1 = endoi_jaw2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(46, 14).addBox(-1.5F, -0.75F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -1.0F, -1.7F, 0.1745F, 0.0F, 0.0F));
		PartDefinition RightArm2 = Body.addOrReplaceChild("RightArm2",
				CubeListBuilder.create().texOffs(50, 24).addBox(-1.0F, 2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 52)
						.addBox(-0.5F, 1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 36)
						.addBox(-1.0F, 7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -12.5F, -1.0F, -2.6104F, -0.1334F, 3.0287F));
		PartDefinition LeftArm3 = RightArm2.addOrReplaceChild("LeftArm3",
				CubeListBuilder.create().texOffs(23, 52).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 36)
						.addBox(-1.0F, 6.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 24)
						.addBox(-1.0F, 2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 37)
						.addBox(-1.0F, 3.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 10).addBox(-3.0F, 2.0F, -1.5F, 6.0F,
								4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 2.0635F, -0.9149F, -2.1662F));
		PartDefinition bone8 = LeftArm3.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 24)
						.addBox(-1.0F, 2.1F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(-1.0F, 7.0F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.9F, 0.0F, -0.9435F, -0.8645F, -0.0206F));
		PartDefinition Head = bone8.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 22).addBox(-7.0F, -8.2F, -1.0F, 14.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -9.2F, -4.5F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(21, 13)
						.addBox(-6.0F, -4.2F, -4.5F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 32)
						.addBox(-3.0F, -4.2F, -7.5F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 29)
						.addBox(-1.0F, -5.2F, -9.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 0)
						.addBox(-2.0F, -4.2F, -9.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 0).addBox(-2.0F, -2.2F, -9.0F, 4.0F,
								1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.2731F, -1.1446F, 2.2787F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(28, 12).addBox(11.7381F, 4.0952F, 0.5857F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(16, 35).addBox(11.2381F, 0.0952F, 0.0857F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(14.7381F, 0.5952F, -3.9143F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 53)
						.addBox(13.7381F, 4.0952F, 0.0857F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 0)
						.addBox(12.7381F, 4.5952F, -3.9143F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 13)
						.addBox(12.2381F, 4.0952F, -1.9143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 45)
						.addBox(12.2381F, 2.2952F, -1.4143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 45)
						.addBox(15.9381F, 2.2952F, -1.4143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 13)
						.addBox(16.2381F, 4.0952F, -1.9143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 0)
						.addBox(16.2381F, 1.0952F, -1.9143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 0)
						.addBox(12.2381F, 1.0952F, -1.9143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 15)
						.addBox(12.2381F, 1.0952F, -1.9143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 15)
						.addBox(16.2381F, 1.0952F, -1.9143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(13.7381F, 5.0952F, 0.0857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 14)
						.addBox(13.2381F, 5.0952F, -3.4143F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 4)
						.addBox(11.7381F, 1.7952F, -2.9143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 37)
						.addBox(11.2381F, 1.2952F, -3.4143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 37)
						.addBox(15.2381F, 1.2952F, -3.4143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 22)
						.addBox(15.7381F, 1.7952F, -2.9143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 9)
						.addBox(16.2381F, 2.2952F, -3.0143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 18).addBox(12.2381F, 2.2952F,
								-3.0143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.7381F, -8.0952F, -0.5857F));
		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(), PartPose.offset(13.2381F, 1.8452F, 0.7857F));
		PartDefinition cube_r2 = endoi_jaw.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(46, 14).addBox(-1.5F, -0.75F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-3.5F, -0.25F, -2.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(7, 46)
						.addBox(-1.5F, -0.75F, -5.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 6)
						.addBox(-2.5F, -0.25F, -6.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(-2.0F, -0.25F, -2.0F, 4.0F,
								1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 5.5F, -2.7F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r3 = endoi_jaw.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 40).addBox(-2.5F, -2.25F, -3.5F, 5.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 5.5F, -2.7F, -1.7123F, -0.1666F, 2.2808F));
		PartDefinition LeftEar = endo_head.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 43)
						.addBox(-2.0F, -8.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.7381F, 0.6952F, -0.4143F, 0.0F, 0.0F, 0.7854F));
		PartDefinition RightEar = endo_head.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 45)
						.addBox(-2.5F, -8.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.7381F, 0.6952F, -0.4143F, 0.0F, 0.0F, -0.7854F));
		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(50, 36).addBox(-0.5019F, 6.0F, -1.0436F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 50)
						.addBox(-0.5F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, -2.6323F, -0.4149F, -0.1393F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(49, 48).addBox(-0.5F, 1.001F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 1.8744F, -0.1278F, 0.0285F));
		PartDefinition bone7 = bone4.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(18, 0).addBox(-1.0462F, 0.0753F, -6.21F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(-1.5462F, -0.9258F, -2.21F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5462F, 7.5097F, 1.238F, 0.7811F, -0.0964F, 0.0887F));
		PartDefinition RightLeg_r1 = bone7.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, 1.0F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0462F, -0.8247F, -1.71F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg_r2 = bone7.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(18, 0).addBox(-0.3F, 1.0F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0462F, -0.8247F, -1.71F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone9 = bone4.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1F, 7.0F, 0.7F, 0.0F, -0.1309F, 0.0F));
		PartDefinition LeftLeg2 = Body.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(50, 36).addBox(-1.4019F, 6.0F, -1.0436F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 50)
						.addBox(-1.4F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1F, -3.0F, 1.0F, 0.5043F, -0.473F, 3.0935F));
		PartDefinition bone11 = LeftLeg2.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(49, 48).addBox(-1.4F, 1.001F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 2.1357F, 0.0025F, 0.1526F));
		PartDefinition bone12 = bone11.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(18, 0).addBox(0.1F, 0.902F, -6.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(-0.4F, -0.099F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 7.0F, 0.5F, 0.4349F, -0.0368F, 0.0791F));
		PartDefinition RightLeg_r3 = bone12.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(18, 0).addBox(-1.5F, 1.0F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1F, 0.002F, -2.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg_r4 = bone12.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(18, 0).addBox(-0.3F, 1.0F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1F, 0.002F, -2.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone13 = bone11.addOrReplaceChild("bone13", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1F, 7.0F, 0.7F, 0.0F, -0.1309F, 0.0F));
		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(50, 36).addBox(-1.0F, 7.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 50)
						.addBox(-1.0F, 1.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -2.0F, 0.0F, 1.931F, 1.1499F, -2.703F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(49, 48).addBox(-1.0F, 1.0F, -1.1F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -0.9F, 0.394F, 1.0471F, -1.1232F));
		PartDefinition right_hand3 = right_lower_leg.addOrReplaceChild("right_hand3",
				CubeListBuilder.create().texOffs(31, 45).addBox(-1.1F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 17)
						.addBox(0.9F, 1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -0.1F, -0.1793F, 0.5872F, -0.3161F));
		PartDefinition LeftArm_r1 = right_hand3.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(42, 5).addBox(-0.5333F, -0.5F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5667F, 2.5F, 0.0F, 0.0F, 0.0F, 0.829F));
		PartDefinition RightLeg2 = Body.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(50, 36).addBox(-1.5019F, 6.0F, -0.9564F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 50)
						.addBox(-1.5F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.0F, 0.0F, -2.5457F, 0.6283F, 0.3207F));
		PartDefinition right_lower_leg2 = RightLeg2.addOrReplaceChild("right_lower_leg2",
				CubeListBuilder.create().texOffs(49, 48).addBox(-1.5F, 1.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 2.1372F, 0.0852F, -0.0189F));
		PartDefinition bone14 = right_lower_leg2.addOrReplaceChild("bone14",
				CubeListBuilder.create().texOffs(18, 29).addBox(-2.8F, -1.099F, -7.2F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 21)
						.addBox(-1.8F, -0.099F, -2.7F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 21)
						.addBox(-2.8F, -2.099F, -3.2F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, 7.0F, 0.7F, 0.652F, 0.5172F, 0.1263F));
		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, -3.5F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(48, 18).addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 40)
						.addBox(2.0F, -18.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 17)
						.addBox(-1.0F, -17.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 50)
						.addBox(1.0F, -15.0F, -2.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(51, 41)
						.addBox(2.0F, -28.5F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 26)
						.addBox(2.5F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(22, 4)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(22, 4)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(0, 54)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(0, 26)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));
		PartDefinition bone6 = endo_torso.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(16, 49).addBox(-4.0F, 0.4644F, -0.3247F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 40)
						.addBox(-5.0F, -0.5356F, 2.6753F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, -17.0F, 0.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition right_hand4 = endo_torso.addOrReplaceChild("right_hand4",
				CubeListBuilder.create().texOffs(31, 45).addBox(-1.0F, -0.2F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 17)
						.addBox(1.0F, 0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 5).addBox(-1.0F, 1.8F, -1.5F, 3.0F, 2.0F,
								3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -28.8F, -1.0F, 0.3695F, 0.659F, -2.5776F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
