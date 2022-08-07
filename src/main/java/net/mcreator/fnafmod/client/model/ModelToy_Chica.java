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
public class ModelToy_Chica<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_toy_chica"), "main");
	public final ModelPart Head;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Body;

	public ModelToy_Chica(ModelPart root) {
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
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -7.2F, -4.8F, 9.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.8F, 1.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(68, 17).addBox(-6.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.2F, -0.8F, 0.0F, 1.2654F, 0.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(68, 13).addBox(-6.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.2F, -0.8F, 0.0F, -2.618F, 0.0F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(68, 9).addBox(-6.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.2F, -0.8F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone10 = Head.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(1.0F, -5.9312F, -5.6113F));
		PartDefinition Head_r1 = bone10.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(64, 25).addBox(-5.0F, -0.4F, 0.6F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(28, 48).addBox(10.2381F, -1.4048F, 1.2857F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(48, 8).addBox(9.7381F, -5.4048F, 0.7857F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 32)
						.addBox(13.2381F, -4.9048F, -1.7143F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 18)
						.addBox(13.2381F, -3.9048F, -2.7143F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 57)
						.addBox(12.2381F, -1.4048F, 0.7857F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 0)
						.addBox(10.2381F, -0.0048F, -3.2143F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 0)
						.addBox(11.2381F, -0.9048F, -3.2143F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 17)
						.addBox(10.7381F, -1.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 49)
						.addBox(10.7381F, -3.2048F, -0.7143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 49)
						.addBox(14.4381F, -3.2048F, -0.7143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 17)
						.addBox(14.7381F, -1.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(14.7381F, -4.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(10.7381F, -4.4048F, -1.2143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 17)
						.addBox(10.7381F, -4.4048F, -1.2143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 17)
						.addBox(14.7381F, -4.4048F, -1.2143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 4)
						.addBox(12.2381F, -0.4048F, 0.7857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 27)
						.addBox(11.7381F, -0.4048F, -2.7143F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 49)
						.addBox(10.2381F, -2.9048F, -2.7143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 21)
						.addBox(9.7381F, -3.4048F, -3.2143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 21)
						.addBox(13.7381F, -3.4048F, -3.2143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 49)
						.addBox(14.2381F, -2.9048F, -2.7143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 22)
						.addBox(14.7381F, -2.4048F, -2.8143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 22).addBox(10.7381F, -2.4048F,
								-2.8143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));
		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(), PartPose.offset(13.2381F, 1.8452F, 0.7857F));
		PartDefinition cube_r4 = endoi_jaw.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(50, 27).addBox(-1.5F, -0.75F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 48)
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition beak = Head.addOrReplaceChild("beak",
				CubeListBuilder.create().texOffs(39, 21).addBox(12.0F, -18.5F, -8.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 8)
						.addBox(12.0F, -19.5F, -8.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(12.5F, -21.5F, -9.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(25, 21)
						.addBox(11.5F, -20.5F, -8.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.0F, 19.3F, 1.2F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(20, 57).addBox(-0.35F, 0.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 103)
						.addBox(-1.35F, 1.6F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 43).addBox(-0.8F, 6.5F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -1.0F, 1.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition bone3 = LeftArm
				.addOrReplaceChild("bone3",
						CubeListBuilder.create().texOffs(0, 17).addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
								.texOffs(0, 103).addBox(-1.3F, 0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 7.3F, 0.0F));
		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2",
				CubeListBuilder.create().texOffs(42, 67).addBox(-0.89F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 61)
						.addBox(1.11F, 0.7F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 68).addBox(-0.89F, 1.7F, -1.5F, 3.0F,
								2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 89).addBox(-1.5F, 1.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 57)
						.addBox(-0.5F, 0.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 43).addBox(-1.0F, 6.5F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 89)
						.addBox(-1.5F, 0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 54).addBox(-1.0F, 1.2F, -1.0F, 2.0F,
								4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.3F, 0.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(24, 59).addBox(-0.91F, 0.7F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 68)
						.addBox(-0.91F, 2.7F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 49).addBox(1.09F, 1.7F, -0.5F, 2.0F,
								2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 4.5F, 0.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.6176F, 1.1319F, -1.0F, 0.0F, 0.0F, 2.9671F));
		PartDefinition bone6 = right_hand.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(14.7176F, 4.6319F, -2.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(12, 43).addBox(-1.0019F, 6.0F, -1.0436F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 36)
						.addBox(-2.6F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 53)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.6F, 9.0F, 1.0F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(44, 49).addBox(-1.5F, 6.901F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 83)
						.addBox(-2.6F, 5.901F, -6.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-2.6F, 4.901F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.001F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(-2.1F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition bone7 = bone4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-0.5F, 7.0F, -1.5F));
		PartDefinition bone9 = bone4.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1F, 7.0F, 0.7F, 0.0F, -0.1309F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(12, 43).addBox(-1.0019F, 6.0F, -0.9564F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-2.5F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 53)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 9.0F, 1.0F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(0, 43).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-2.5F, 4.901F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 83)
						.addBox(-2.5F, 5.901F, -6.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-1.5F, 6.901F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition bone8 = right_lower_leg.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-4.7F, 7.0F, 0.7F));
		PartDefinition Body = partdefinition
				.addOrReplaceChild("Body",
						CubeListBuilder.create().texOffs(0, 97).addBox(-6.5F, -13.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
								.texOffs(0, 97).addBox(3.5F, -13.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 11.0F, 1.0F));
		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, -3.5F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(48, 13).addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 5)
						.addBox(2.0F, -18.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 45)
						.addBox(-1.0F, -17.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 79)
						.addBox(-1.5F, -17.5F, -4.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(54, 17)
						.addBox(2.0F, -28.5F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 35)
						.addBox(2.5F, -29.5F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 34)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(56, 34)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(40, 36)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 24)
						.addBox(-1.5F, -27.0F, -5.0F, 9.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.5F, -27.5F, -5.5F, 9.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(28, 11)
						.addBox(-0.5F, -22.0F, -4.5F, 7.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));
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
