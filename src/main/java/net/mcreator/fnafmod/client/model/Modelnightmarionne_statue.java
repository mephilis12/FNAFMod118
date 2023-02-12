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
public class Modelnightmarionne_statue<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "modelnightmarionne_statue"), "main");
	public final ModelPart Body;

	public Modelnightmarionne_statue(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(28, 42).addBox(-1.0F, -18.7032F, -1.2113F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 16).addBox(-3.0F, -1.7032F, -2.4113F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 39)
						.addBox(-1.0F, -5.7032F, -0.9113F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 0).addBox(-2.5F, -10.7032F, -2.4113F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 9)
						.addBox(-4.5F, -10.2032F, -1.4113F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, -14.7032F, -3.4113F, 9.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -5.2968F, 2.7113F, 0.9599F, 0.0F, 0.0F));
		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -17.8698F, 0.2887F));
		PartDefinition Head2 = Head.addOrReplaceChild("Head2",
				CubeListBuilder.create().texOffs(0, 9).addBox(-3.0F, -8.8333F, -2.5F, 6.0F, 9.0F, 4.0F, new CubeDeformation(-0.01F)).texOffs(3, 0).addBox(-2.0F, -5.8333F, -2.7F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 23)
						.addBox(-4.0F, -4.3333F, -3.5F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 29).addBox(-3.5F, -9.3333F, -3.5F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 0)
						.addBox(1.0F, -5.8333F, -2.7F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 36).addBox(-3.0F, -0.3333F, -3.5F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5633F, -0.2566F, -0.3699F));
		PartDefinition left_arm = Body.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0745F, -12.3706F, -0.4113F, -1.0472F, 0.0F, 0.0F));
		PartDefinition left_arm2 = left_arm.addOrReplaceChild("left_arm2", CubeListBuilder.create().texOffs(16, 36).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, -0.5672F));
		PartDefinition left_lower_arm = left_arm2.addOrReplaceChild("left_lower_arm", CubeListBuilder.create().texOffs(16, 22).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -1.7796F, 0.6012F, -0.8282F));
		PartDefinition right_hand2 = left_lower_arm.addOrReplaceChild("right_hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5887F, 16.6954F, 2.6716F, 0.0F, 2.3562F, 0.0F));
		PartDefinition bone5 = right_hand2.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(46, 0).addBox(-1.4414F, -12.147F, -2.8406F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4142F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone5.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(26, 46).addBox(-1.5F, -7.8829F, -9.3298F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0586F, 7.0242F, -1.3175F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone6 = right_hand2.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(12, 41).addBox(-1.4414F, -11.9216F, 2.4066F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4142F, 3.15F, -1.2F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone6.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 47).addBox(-0.5F, -8.0F, 0.5F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9414F, 2.6762F, 0.3521F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone7 = right_hand2.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(44, 45).addBox(-1.4414F, -12.147F, -2.8406F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5858F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone7.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 46).addBox(0.5F, -8.6441F, -5.041F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9414F, 4.6129F, -0.1323F, -0.3054F, 0.0F, 0.0F));
		PartDefinition right_arm = Body.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.112F, -12.3945F, -1.454F, -1.222F, -0.0149F, 0.041F));
		PartDefinition right_arm2 = right_arm.addOrReplaceChild("right_arm2", CubeListBuilder.create().texOffs(36, 39).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, 0.5672F));
		PartDefinition right_lower_arm = right_arm2.addOrReplaceChild("right_lower_arm", CubeListBuilder.create().texOffs(24, 36).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -2.0163F, -0.4474F, 2.1F));
		PartDefinition right_hand = right_lower_arm.addOrReplaceChild("right_hand", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5311F, 16.9268F, -3.9643F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone2 = right_hand.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(46, 0).addBox(0.2205F, -12.43F, -2.8743F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4142F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 46).addBox(-1.7812F, -11.6388F, -9.0441F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0018F, 8.3895F, 2.7503F, -0.3054F, 0.0F, 0.0F));
		PartDefinition bone3 = right_hand.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(12, 41).addBox(0.2205F, -12.1922F, 2.4956F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4142F, 3.15F, -1.2F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 46).addBox(-0.7812F, -12.9967F, -3.5052F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0018F, 8.2686F, 3.0166F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone4 = right_hand.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(44, 45).addBox(0.2205F, -12.43F, -2.8743F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5858F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bone4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 47).addBox(0.2188F, -7.8768F, -10.3301F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0018F, 7.4435F, -0.6403F, -0.7854F, 0.0F, 0.0F));
		PartDefinition left_leg = Body.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 1.7968F, -0.2113F, -1.3049F, -0.1504F, 0.5484F));
		PartDefinition left_leg2 = left_leg.addOrReplaceChild("left_leg2",
				CubeListBuilder.create().texOffs(42, 9).addBox(0.0663F, 14.6027F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 16).addBox(0.5663F, -0.3973F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -0.48F, 0.0F, -0.1309F));
		PartDefinition left_lower_leg = left_leg2.addOrReplaceChild("left_lower_leg", CubeListBuilder.create().texOffs(28, 23).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5663F, 16.1027F, 0.0F, 1.0908F, 0.0F, 0.0F));
		PartDefinition right_leg = Body.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.7968F, -0.2113F, -1.2828F, 0.103F, -0.3341F));
		PartDefinition right_leg2 = right_leg.addOrReplaceChild("right_leg2",
				CubeListBuilder.create().texOffs(0, 42).addBox(-3.0663F, 14.6027F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 22).addBox(-2.5663F, -0.3973F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.1309F));
		PartDefinition right_lower_leg = right_leg2.addOrReplaceChild("right_lower_leg", CubeListBuilder.create().texOffs(8, 22).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5663F, 16.1027F, 0.0F, 1.0908F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
