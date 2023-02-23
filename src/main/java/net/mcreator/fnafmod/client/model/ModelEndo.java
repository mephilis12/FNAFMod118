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
public class ModelEndo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_endo"), "main");
	public final ModelPart Head;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart Body;

	public ModelEndo(ModelPart root) {
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -4.8F, 1.0F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7F, 0.1F, 0.2618F, 0.0F, 0.0F));
		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, -6.0F, 0.0F, 0.0F, 0.0F, 1.1781F));
		PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -10.0F, 1.0F, 0.0F, 0.0F, -1.1781F));
		PartDefinition endo_head = Head.addOrReplaceChild("endo_head",
				CubeListBuilder.create().texOffs(24, 16).addBox(10.2381F, -1.4048F, 0.2857F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 3).addBox(9.7381F, -5.4048F, -0.2143F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(11.7381F, -0.9048F, -3.2143F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(7, 10).addBox(12.2381F, -0.4048F, 0.7857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 9)
						.addBox(12.2381F, -0.4048F, -3.0143F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 32).addBox(10.2381F, -3.7048F, -2.2143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 6)
						.addBox(9.8381F, -4.2048F, -2.7143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 6).addBox(13.6381F, -4.2048F, -2.7143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 32)
						.addBox(14.2381F, -3.7048F, -2.2143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 8).addBox(14.7381F, -3.2048F, -2.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(10.7381F, -3.2048F, -2.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));
		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(), PartPose.offset(13.2381F, 1.8452F, 0.7857F));
		PartDefinition cube_r1 = endoi_jaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(29, 9).addBox(-1.0F, -0.75F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 13).addBox(-1.5F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(8, 30).addBox(-0.35F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-0.8F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -2.0F, 1.0F));
		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 34).addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.3F, 0.0F));
		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2", CubeListBuilder.create().texOffs(28, 29).addBox(-0.39F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 20)
				.addBox(0.11F, 0.0F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 3).addBox(-0.59F, 1.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.31F, 6.2F, 0.0F, 3.1416F, 0.0F, -3.1416F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(8, 30).addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-1.0F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, -2.0F, 1.0F));
		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.3F, 0.0F));
		PartDefinition right_hand = bone2
				.addOrReplaceChild("right_hand",
						CubeListBuilder.create().texOffs(28, 29).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 28).addBox(-0.7F, 1.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(27, 7)
								.addBox(0.0F, 0.0F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 6.2F, 0.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0276F, 0.4319F, -1.0F, 0.0F, 0.0F, 2.9671F));
		PartDefinition bone6 = right_hand.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(14.1276F, 3.9319F, -2.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.6F, 9.0F, 1.0F));
		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(8, 22).addBox(-1.0F, 1.001F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition bone9 = bone4.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(24, 20).addBox(-1.9F, -0.099F, -4.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 8).addBox(-1.4F, -0.099F, -2.7F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.1F, 7.0F, 0.7F));
		PartDefinition RightLeg_r1 = bone9.addOrReplaceChild("RightLeg_r1", CubeListBuilder.create().texOffs(6, 8).addBox(-1.5F, 1.0F, -4.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5948F, -0.098F, -2.199F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg_r2 = bone9.addOrReplaceChild("RightLeg_r2", CubeListBuilder.create().texOffs(0, 8).addBox(-0.3F, 1.0F, -4.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5795F, -0.098F, -2.2755F, 0.0F, -0.3927F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 9.0F, 1.0F));
		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg", CubeListBuilder.create().texOffs(8, 22).addBox(-1.0F, 1.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition bone8 = right_lower_leg.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(24, 20).addBox(-1.9F, -0.099F, -4.7F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 8).addBox(-1.5F, -0.099F, -2.7F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.7F));
		PartDefinition RightLeg_r3 = bone8.addOrReplaceChild("RightLeg_r3", CubeListBuilder.create().texOffs(6, 8).addBox(-1.5F, 1.0F, -4.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5948F, -0.098F, -2.199F, 0.0F, 0.3927F, 0.0F));
		PartDefinition RightLeg_r4 = bone8.addOrReplaceChild("RightLeg_r4", CubeListBuilder.create().texOffs(0, 8).addBox(-0.3F, 1.0F, -4.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5795F, -0.098F, -2.2755F, 0.0F, -0.3927F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 30).addBox(-6.99F, -13.51F, -0.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(4.99F, -13.51F, -0.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 1.0F));
		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, -3.5F));
		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(20, 12).addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 18)
						.addBox(0.5F, -17.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 23).addBox(1.5F, -31.5F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(1.8F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 0).addBox(3.2F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 11).addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(8, 11)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(0, 10).addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));
		PartDefinition bone10 = Body.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(26, 32).addBox(-4.7668F, 8.9542F, -1.5F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -27.5F, 1.5F, 0.0F, 0.0F, -0.3927F));
		PartDefinition bone7 = Body.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(18, 0).addBox(1.2125F, -0.2017F, -1.5F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(18, 0).addBox(1.2125F, -0.2017F, -1.5F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -17.2F, 1.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone11 = Body.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(26, 32).addBox(0.9952F, 10.1022F, -1.5F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -27.5F, 1.5F, 0.0F, 0.0F, 0.3927F));
		return LayerDefinition.create(meshdefinition, 64, 64);
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
