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

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSittingWitheredBonnie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_sitting_withered_bonnie"),
			"main");
	public final ModelPart Body;

	public ModelSittingWitheredBonnie(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 28).addBox(-4.5034F, 6.002F, -2.402F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-7.5034F, -2.998F, 0.098F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(5.4966F, -2.998F, 0.098F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 0)
						.addBox(4.9966F, -1.998F, 1.098F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(77, 28)
						.addBox(-4.0034F, -3.498F, -2.902F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(29, 40)
						.addBox(-0.5034F, -0.498F, -3.002F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(29, 40)
						.addBox(-0.5034F, 1.502F, -3.002F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(77, 15)
						.addBox(-4.5034F, 1.502F, -2.902F, 9.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0034F, 15.498F, 3.902F, -0.0436F, -0.0019F, -0.0436F));
		PartDefinition LeftArm_r1 = Body.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(8, 93).addBox(-0.5F, -3.0F, 1.5F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9934F, 7.002F, -4.902F, -0.4363F, 0.0F, 0.0F));
		PartDefinition LeftArm_r2 = Body.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(58, 4).addBox(-1.0F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 56)
						.addBox(11.99F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.9934F, -2.498F, 1.098F, -0.1745F, 0.0F, 0.0F));
		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(87, 3).addBox(-4.0F, -7.0F, -1.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 73)
						.addBox(-3.5F, -6.7F, -0.4F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0034F, -6.298F, 1.098F, 0.3914F, -0.0334F, 0.0807F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(0, 17).addBox(-3.5F, -0.5176F, -5.9319F, 7.0F, 2.0F, 9.0F, new CubeDeformation(-0.1F))
						.texOffs(28, 11).addBox(-3.0F, -1.0176F, -5.7319F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, -0.1309F, 0.0F, 0.0F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(39, 18).addBox(10.2381F, -1.4048F, 1.2857F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(0, 58).addBox(9.7381F, -5.4048F, 0.7857F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 48)
						.addBox(12.2381F, -1.4048F, 0.7857F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 84)
						.addBox(14.7381F, -3.4048F, 0.8857F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.3F)).texOffs(0, 84)
						.addBox(10.7381F, -3.4048F, 0.8857F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.3F)).texOffs(22, 17).addBox(12.2381F, -0.4048F,
								0.7857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));
		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(),
				PartPose.offsetAndRotation(13.2381F, 1.8452F, 0.7857F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r1 = endoi_jaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(55, 63).addBox(-1.5F, -0.75F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 41)
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition RightEar2 = Head.addOrReplaceChild("RightEar2",
				CubeListBuilder.create().texOffs(0, 86).addBox(-1.5F, -5.7F, 1.201F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 80)
						.addBox(-1.0F, -6.701F, 1.6992F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -7.0F, -1.5F, 0.0F, 0.0F, 0.0F));
		PartDefinition RightTop = RightEar2.addOrReplaceChild("RightTop", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0783F, -1.0076F));
		PartDefinition RightEar_r1 = RightTop.addOrReplaceChild("RightEar_r1",
				CubeListBuilder.create().texOffs(22, 80).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1628F, 1.7321F, 1.3526F, 0.0F, 0.0F));
		PartDefinition RightEar_r2 = RightTop.addOrReplaceChild("RightEar_r2",
				CubeListBuilder.create().texOffs(14, 82).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.4335F, 0.6478F, 1.3526F, 0.0F, 0.0F));
		PartDefinition LeftEar2 = Head.addOrReplaceChild("LeftEar2",
				CubeListBuilder.create().texOffs(8, 87).addBox(-1.5431F, -6.7716F, 1.1237F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(22, 80).addBox(-1.0F, -7.7735F, 1.6668F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 89)
						.addBox(-1.5431F, -11.2716F, 1.1237F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -6.0F, -1.5F, -0.0436F, 0.0F, 0.0F));
		PartDefinition LeftTop = LeftEar2.addOrReplaceChild("LeftTop", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition RightArm = Body.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(32, 49).addBox(-2.01F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(13, 61)
						.addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(25, 66)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 49).addBox(-1.0F, 7.5F, -1.0F, 2.0F,
								2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0034F, -2.498F, 1.098F, 0.0F, 0.0F, 0.0873F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(29, 66).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 21)
						.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 56).addBox(-1.49F, 0.2F, -2.0F, 3.0F,
								5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -1.1287F, 0.5354F, 0.0567F));
		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(23, 21).addBox(-0.41F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-0.41F, 0.0F, -1.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 6.2F, 0.0F, -1.4572F, 1.1758F, -1.4659F));
		PartDefinition LeftArm_r3 = right_hand.addOrReplaceChild("LeftArm_r3",
				CubeListBuilder.create().texOffs(31, 41).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.09F, 1.5F, -1.0F, 1.2216F, 0.4971F, -0.1719F));
		PartDefinition LeftArm_r4 = right_hand.addOrReplaceChild("LeftArm_r4",
				CubeListBuilder.create().texOffs(36, 63).addBox(0.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.41F, 2.0F, 0.0F, 0.0F, 0.0F, 1.1781F));
		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1176F, 0.4319F, -1.0F, 0.0F, 0.0F, 2.9671F));
		PartDefinition bone6 = right_hand.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(14.2176F, 3.9319F, -2.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(18, 41).addBox(-1.9564F, 0.0F, -2.5019F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-1.0019F, 6.0F, -1.0436F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 78)
						.addBox(-1.5F, 5.5F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5966F, 8.502F, 0.098F, -2.1048F, -0.1886F, 0.1104F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.001F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.9163F, 0.0F, 0.0F));
		PartDefinition bone9 = bone4.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(-4, 97).addBox(-0.9F, 0.65F, -6.7F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 13)
						.addBox(-1.4F, 0.0F, -2.7F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 7.0F, 0.7F, 1.2243F, 0.0344F, -0.0559F));
		PartDefinition RightLeg_r1 = bone9.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(-4, 102).addBox(-0.3F, 1.7F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, -1.0F, -2.2F, 0.0F, -0.3927F, 0.0F));
		PartDefinition RightLeg_r2 = bone9.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(-4, 92).addBox(-1.5F, 1.7F, -4.5F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, -1.0F, -2.2F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(44, 49).addBox(-1.0019F, 6.0F, -0.9564F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-2.0436F, 0.0F, -2.5019F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 78)
						.addBox(-1.5F, 5.5F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5034F, 8.502F, 0.098F, -1.9646F, 0.114F, 0.0472F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(48, 17).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition bone8 = right_lower_leg.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(60, 13).addBox(-1.5F, -0.099F, -2.7F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 34)
						.addBox(-2.0F, -1.0F, -3.2F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(72, 48).addBox(-1.0F, -1.0F, -7.2F, 2.0F,
								2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.7F, 1.3978F, 0.002F, 0.0227F));
		PartDefinition RightLeg_r3 = bone8.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(26, 74).addBox(-1.7F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg_r4 = bone8.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(74, 5).addBox(-0.3F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.0F, -0.3927F, 0.0F));
		PartDefinition LeftArm_r5 = bone8.addOrReplaceChild("LeftArm_r5",
				CubeListBuilder.create().texOffs(24, 0).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.401F, -2.7F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone = Body.addOrReplaceChild(
				"bone", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
						.texOffs(61, 19).addBox(-2.4858F, -1.5F, -1.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0034F, -1.498F, -2.402F));
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
				PartPose.offset(-3.0034F, 23.502F, 2.098F));
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
