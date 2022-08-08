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
public class ModelBalloonBoy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_balloon_boy"), "main");
	public final ModelPart head;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart body;

	public ModelBalloonBoy(ModelPart root) {
		this.head = root.getChild("head");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -6.0556F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-2.0F, -5.5556F, -3.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 6)
						.addBox(-2.5F, -3.5556F, -3.9F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(1.0F, -5.5556F, -3.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-1.0F, -4.0556F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(0.0F, -5.0556F, -6.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.5F, -6.0556F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 29)
						.addBox(-3.0F, -6.5556F, -4.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 29)
						.addBox(0.0F, -6.5556F, -4.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-2.5F, -4.0556F, -4.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 40)
						.addBox(-4.0F, -4.0556F, -4.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(-4.0F, -7.0556F, -2.5F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 32)
						.addBox(-3.5F, -7.0556F, -4.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-4.5F, -9.0556F, -5.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-1.0F, -10.0556F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -12.0556F, -0.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 24)
						.addBox(-0.5F, -13.0556F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 18)
						.addBox(-4.0F, -12.5556F, -4.5F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 7.8556F, 3.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(0, 42).addBox(-1.5F, 0.3F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 42)
						.addBox(-2.0F, 5.3F, -6.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 6)
						.addBox(-1.5F, 5.3F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 17.0F, 3.5F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(0, 42).addBox(-1.5F, 0.3F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 6)
						.addBox(-1.5F, 5.3F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 42)
						.addBox(-2.0F, 5.3F, -6.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 17.0F, 3.5F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 79).addBox(-16.5F, -31.2F, -1.0F, 9.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -15.7F, -1.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(-6.0F, -14.7F, 2.0F, 15.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-11.0F, -13.7F, 3.0F, 25.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(0.5F, -15.7F, -1.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(0.5F, -13.2F, -1.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 47)
						.addBox(9.0F, -14.2F, 2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 47)
						.addBox(14.0F, -14.2F, 2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 46)
						.addBox(0.5F, -17.2F, 2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 47)
						.addBox(-8.0F, -14.2F, 2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 47)
						.addBox(-13.0F, -14.2F, 2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-12.5F, -20.2F, 3.5F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 54)
						.addBox(14.5F, -21.2F, 3.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 55)
						.addBox(9.5F, -20.2F, 3.0F, 11.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 57)
						.addBox(10.0F, -19.7F, 2.8F, 10.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
