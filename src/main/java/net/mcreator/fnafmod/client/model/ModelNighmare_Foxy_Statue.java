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

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelNighmare_Foxy_Statue<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_nighmare_foxy_statue"), "main");
	public final ModelPart Body;

	public ModelNighmare_Foxy_Statue(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(65, 53).addBox(-8.05F, -2.8571F, 0.9857F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 65).addBox(6.05F, -2.8571F, 0.9857F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 25)
						.addBox(-4.5F, 6.2429F, -1.0143F, 9.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 22).addBox(-4.5F, 0.2429F, -2.0143F, 9.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-5.5F, -3.7571F, -2.0143F, 11.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.7429F, -0.9857F));
		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(39, 45).addBox(-2.0F, -4.2F, -13.0F, 4.0F, 3.0F, 9.0F, new CubeDeformation(-0.01F)).texOffs(61, 13).addBox(-2.5F, -4.2F, -9.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-1.0F, -5.2F, -13.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 27).addBox(-3.5F, -9.2F, -5.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-6.5F, -4.2F, -5.0F, 13.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0571F, 1.9857F, 0.0873F, 0.0F, 0.0F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.5F, 0.15F, -13.1652F, 5.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(21, 43).addBox(-2.0F, -1.25F, -12.6652F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5068F, 1.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Jaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(51, 37).addBox(-5.0F, -1.7F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)).texOffs(34, 17).addBox(-5.0F, -0.3F, -3.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -0.5686F, -1.0441F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Jaw.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 44).addBox(-2.5F, 3.1813F, 8.9155F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.35F, -13.6652F, 0.3927F, 0.0F, 0.0F));
		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(0, 82).addBox(-2.0F, -8.75F, -0.5F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(76, 25).addBox(-2.0F, -8.75F, -1.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 78)
						.addBox(-1.0F, -7.0F, -0.5F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 71).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(2.0F, -6.7F, 0.2F, 0.3927F, 0.0F, 0.5672F));
		PartDefinition RightEar = Head.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(14, 84).addBox(-2.0F, -8.75F, 0.5F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 75).addBox(-2.0F, -8.75F, 0.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 78)
						.addBox(-1.0F, -7.0F, 0.5F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 70).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-2.0F, -6.7F, -0.8F, 0.3927F, 0.0F, -0.5672F));
		PartDefinition RightTop = RightEar.addOrReplaceChild("RightTop", CubeListBuilder.create(), PartPose.offset(0.0F, -4.8F, 0.5F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(30, 4).addBox(11.2381F, -3.7048F, -0.4143F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 42).addBox(10.5381F, -4.9048F, -3.2143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(18, 54).addBox(10.2381F, -6.4048F, -2.7143F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(10.2381F, -3.4048F, -2.7143F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(70, 0)
						.addBox(10.7381F, -1.4048F, -2.7143F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(65, 10).addBox(13.9381F, -4.9048F, -3.2143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(14.4381F, -4.3548F, -3.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(11.0381F, -4.3548F, -3.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));
		PartDefinition bone = endo_head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-0.7619F, 19.5952F, 9.2857F));
		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(58, 0).addBox(-2.01F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(77, 65).addBox(-0.35F, 1.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 71)
						.addBox(-1.35F, 2.6F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 0).addBox(-0.8F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -2.6571F, 1.9857F, 0.2284F, 0.298F, -0.3682F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 47).addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 11)
				.addBox(-0.8F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 70).addBox(-1.3F, 0.7F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.8727F, 0.0F, 0.0F));
		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone6 = bone3.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(56, 17).addBox(-0.5F, 0.6F, -1.625F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 21).addBox(-1.0F, 0.5F, -2.125F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(79, 17)
						.addBox(0.5F, 1.1F, -0.125F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 21).addBox(0.5F, 1.1F, 0.375F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 5.6F, -0.125F, 0.0F, -3.0107F, 0.0F));
		PartDefinition LeftArm_r1 = bone6.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(70, 53).addBox(-0.9226F, -1.5F, -1.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(3, 97).addBox(-0.9226F, -2.5F, -1.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 100)
						.addBox(-0.9226F, -2.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 97).addBox(-0.9226F, -2.5F, 1.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 100)
						.addBox(-0.9226F, -2.5F, 2.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 3.4226F, -0.625F, 0.0F, 0.0F, 1.5708F));
		PartDefinition RightArm = Body.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 59).addBox(-2.01F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 33).addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 75)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 57).addBox(-1.0F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -2.5571F, 1.9857F, 0.1787F, -0.2148F, 0.3542F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
				.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 71).addBox(-1.5F, 0.7F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand", CubeListBuilder.create(), PartPose.offset(-0.09F, 5.5F, 0.0F));
		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(0, 111).addBox(-2.5276F, -0.4319F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 114).addBox(-4.0276F, 2.5681F, 0.5F, 6.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.1176F, 1.1319F, 0.0F));
		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(58, 57).addBox(-1.9913F, 0.0F, -2.1004F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(78, 77).addBox(-0.9913F, 9.0F, -0.6004F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-0.9913F, 1.0F, -1.1004F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 71).addBox(-1.4913F, 1.5F, -1.6004F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 44)
						.addBox(-0.5349F, -1.0F, -0.5985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0913F, 8.7429F, 2.0861F, -0.3897F, -0.05F, -0.121F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 35).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0087F, 10.0F, -0.1004F, 0.6939F, -0.084F, 0.1005F));
		PartDefinition bone8 = bone4.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(70, 6).addBox(-1.9F, 3.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 41).addBox(-1.4F, 1.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 6.0F, 0.5F, -0.3054F, 0.0F, 0.0F));
		PartDefinition LeftArm_r2 = bone8.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(27, 65).addBox(-3.5F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1F, 2.1352F, -1.5948F, 0.2182F, 0.0F, 0.0F));
		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 78).addBox(-1.0087F, 9.0F, -0.6004F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(-1.0087F, 1.0F, -1.1004F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 57)
						.addBox(-2.0087F, 0.0F, -2.1004F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 70).addBox(-1.5087F, 1.5F, -1.6004F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 25)
						.addBox(-0.4651F, -1.0F, -0.5985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9807F, 8.7429F, 2.1285F, -0.3897F, 0.05F, 0.121F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 71).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0087F, 10.0F, -0.1004F, 0.6939F, 0.084F, -0.1005F));
		PartDefinition bone7 = right_lower_leg.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(52, 70).addBox(-2.0F, 3.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 59).addBox(-1.5F, 1.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.5F, -0.3054F, 0.0F, 0.0F));
		PartDefinition LeftArm_r3 = bone7.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(11, 65).addBox(-2.0F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 2.1352F, -1.5948F, 0.2182F, 0.0F, 0.0F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(18, 47).addBox(1.5F, -21.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 42).addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 83)
						.addBox(-1.5F, -27.0F, -3.5F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(62, 20).addBox(-1.0F, -18.0F, -2.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 47)
						.addBox(2.0F, -30.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 79).addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(4, 7)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(0, 7).addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(12, 59)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(56, 33).addBox(-0.5F, -26.0F, -2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 23.7429F, 2.9857F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
