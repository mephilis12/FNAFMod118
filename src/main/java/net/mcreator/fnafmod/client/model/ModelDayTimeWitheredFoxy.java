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
public class ModelDayTimeWitheredFoxy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_day_time_withered_foxy"),
			"main");
	public final ModelPart Body;

	public ModelDayTimeWitheredFoxy(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(24, 81).addBox(-4.5F, -14.0F, -2.5F, 9.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 77)
						.addBox(-4.0F, -10.0F, -2.5F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 29)
						.addBox(-4.5F, -4.0F, -2.5F, 9.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-7.49F, -13.51F, -0.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 49).addBox(5.49F, -13.51F, -0.99F,
								2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 1.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(25, 21).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(49, 101)
						.addBox(-3.0F, -10.0F, -1.0F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(98, 29)
						.addBox(-4.5F, -6.0F, -4.5F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(14, 112)
						.addBox(-6.0F, -3.0F, -4.0F, 12.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 96)
						.addBox(-7.0F, -3.0F, -4.0F, 14.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 96)
						.addBox(-7.0F, -3.0F, -2.0F, 14.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(88, 115)
						.addBox(-2.0F, -1.0F, -7.1F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(78, 96)
						.addBox(-1.0F, -0.8F, -9.6F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(90, 64)
						.addBox(-2.5F, -3.0F, -7.1F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(93, 73)
						.addBox(-1.5F, -2.5F, -10.1F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(88, 47)
						.addBox(-1.0F, -3.5F, -8.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 41)
						.addBox(-1.0F, -3.0F, -10.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0).addBox(-3.5F, -1.3F, -3.5F, 7.0F,
								1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.5657F, 0.0403F, -0.4265F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(3, 20).addBox(-3.5F, -0.5176F, -2.9319F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(92, 18)
						.addBox(-2.5F, -0.5176F, -6.9319F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(75, 15)
						.addBox(-1.5F, -0.5176F, -9.9319F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(67, 120)
						.addBox(-2.0F, -1.0176F, -6.7319F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(31, 14)
						.addBox(-3.0F, -1.0176F, -2.7319F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(78, 96)
						.addBox(-1.0F, -1.5176F, -9.9319F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 0.2182F, 0.0F, 0.0F));
		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.1464F, -1.7678F, -2.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 123)
						.addBox(-1.1464F, -6.7678F, -2.5F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -6.0F, 2.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition RightEar = Head.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(64, 52).addBox(-4.682F, -3.9393F, -4.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.682F, 1.0607F, -3.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -10.0F, 3.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(39, 18).addBox(10.2381F, -1.4048F, 1.2857F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(0, 58).addBox(9.7381F, -5.4048F, 0.7857F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(13.2381F, -4.9048F, -1.7143F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 20)
						.addBox(13.2381F, -3.9048F, -2.7143F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 48)
						.addBox(12.2381F, -1.4048F, 0.7857F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 27)
						.addBox(11.2381F, -0.9048F, -3.2143F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 17)
						.addBox(10.7381F, -1.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 59)
						.addBox(10.7381F, -3.2048F, -0.7143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 59)
						.addBox(14.4381F, -3.2048F, -0.7143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 17)
						.addBox(14.7381F, -1.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(14.7381F, -4.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(10.7381F, -4.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 28)
						.addBox(10.7381F, -4.4048F, -1.2143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 28)
						.addBox(14.7381F, -4.4048F, -1.2143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 17)
						.addBox(12.2381F, -0.4048F, 0.7857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 63)
						.addBox(11.7381F, -0.4048F, -2.7143F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(65, 65)
						.addBox(10.2381F, -3.7048F, -2.2143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 46)
						.addBox(9.7381F, -4.2048F, -2.7143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 46)
						.addBox(13.7381F, -4.2048F, -2.7143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(13, 40)
						.addBox(9.7381F, -1.9048F, -2.5143F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 65)
						.addBox(14.2381F, -3.7048F, -2.2143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 40)
						.addBox(13.7381F, -1.9048F, -2.5143F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 18)
						.addBox(14.7381F, -3.2048F, -2.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 18).addBox(10.7381F, -3.2048F,
								-2.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));
		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(), PartPose.offset(13.2381F, 1.8452F, 0.7857F));
		PartDefinition cube_r1 = endoi_jaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(55, 63).addBox(-1.5F, -0.75F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r2 = endoi_jaw.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(54, 41).addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(46, 7).addBox(-1.85F, 1.6F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 66)
						.addBox(-0.35F, 1.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 61)
						.addBox(-1.35F, 1.6F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 49).addBox(-0.8F, 7.5F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -13.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(16, 52).addBox(-1.49F, 0.2F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 66)
						.addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 65).addBox(-0.8F, 1.2F, -1.0F, 2.0F,
								4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2",
				CubeListBuilder.create().texOffs(23, 21).addBox(-0.39F, 0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 19)
						.addBox(0.11F, 0.7F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 34).addBox(-0.59F, 2.2F, -1.5F, 2.0F,
								1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 3.075F, -0.2079F, 3.0613F));
		PartDefinition RightArm = Body.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(32, 49).addBox(-2.01F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(13, 61)
						.addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(25, 66)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-1.0F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, -13.0F, 0.0F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(29, 66).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 21)
						.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 56).addBox(-1.49F, 0.2F, -2.0F, 3.0F,
								5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.3083F, -0.5978F, 0.643F));
		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(0, 83).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(76, 33)
						.addBox(-1.5F, -3.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.2F, 0.0F, -3.1416F, -0.2618F, -3.1416F));
		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0276F, -2.5681F, -1.0F, 0.0F, 0.0F, 2.9671F));
		PartDefinition bone6 = right_hand.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(14.1276F, 0.9319F, -2.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(18, 42).addBox(-1.9564F, 0.5F, -2.0019F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-1.0019F, 6.0F, -1.0436F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-1.0F, 0.0F, -1.0F, 2.0F,
								6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, -2.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 1.001F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition bone9 = bone4.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(-4, 97).addBox(-0.9F, 0.8F, -6.7F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 13)
						.addBox(-1.4F, -0.099F, -2.7F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 7.0F, 0.7F, 0.0F, -0.3054F, 0.0F));
		PartDefinition RightLeg_r1 = bone9.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(-4, 92).addBox(-1.5F, 0.9F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.0F, -2.2F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg_r2 = bone9.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(-4, 102).addBox(-0.3F, 0.9F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.0F, -2.2F, 0.0F, -0.3927F, 0.0F));
		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(44, 49).addBox(-1.0019F, 6.2F, -0.9564F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.0F, 0.2F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 38).addBox(-2.0436F, 0.7F, -2.0019F, 4.0F,
								6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -2.0F, 0.0F, -0.0057F, 0.1308F, -0.044F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 1.2F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition bone8 = right_lower_leg.addOrReplaceChild(
				"bone8", CubeListBuilder.create().texOffs(-4, 97).addBox(-1.0F, 0.802F, -6.7F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(60, 13).addBox(-1.5F, 0.211F, -2.7F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.7F));
		PartDefinition RightLeg_r3 = bone8.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(-4, 92).addBox(-1.5F, 0.9F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.002F, -2.2F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg_r4 = bone8.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(-4, 102).addBox(-0.3F, 0.9F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.002F, -2.2F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, -3.5F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(0, 63).addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(66, 0)
						.addBox(2.0F, -18.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-1.0F, -17.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 76)
						.addBox(2.0F, -28.5F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(2.5F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 2)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(26, 7)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(26, 7)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(26, 2)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(0, 73)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
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
