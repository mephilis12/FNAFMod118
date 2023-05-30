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

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelStandFreddly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_stand_freddly"), "main");
	public final ModelPart MainCharacter;

	public ModelStandFreddly(ModelPart root) {
		this.MainCharacter = root.getChild("MainCharacter");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition MainCharacter = partdefinition.addOrReplaceChild("MainCharacter", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 1.0F));
		PartDefinition Torso = MainCharacter.addOrReplaceChild("Torso",
				CubeListBuilder.create().texOffs(22, 21).addBox(-4.0F, -11.0F, -3.5F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 45).addBox(-2.4858F, -10.5F, -4.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)).texOffs(0, 0)
						.addBox(-4.5F, -7.0F, -3.5F, 9.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(4, 5).addBox(-0.5F, -10.0F, -4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offset(0.0F, -3.0F, -1.0F));
		PartDefinition Head = Torso.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 15).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(26, 0).addBox(-4.5F, -5.0F, -4.0F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-3.0F, -4.0F, -6.1F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.15F)).texOffs(0, 3).addBox(-1.0F, -4.5F, -6.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.8F, 1.0F, -0.0731F, 0.0288F, -0.091F));
		PartDefinition bone2 = Head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-2.0F, -11.3968F, -4.4077F));
		PartDefinition Head_r1 = bone2.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(24, 20).addBox(-4.0F, -1.4F, 0.8F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 4.9657F, -1.2037F, -0.8727F, 0.0F, 0.0F));
		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(2.0F, -11.3968F, -4.4077F));
		PartDefinition Head_r2 = bone.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(24, 20).addBox(0.0F, -1.4F, 0.8F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 4.9657F, -1.2037F, -0.8727F, 0.0F, 0.0F));
		PartDefinition Jaw2 = Head.addOrReplaceChild("Jaw2",
				CubeListBuilder.create().texOffs(0, 50).addBox(-3.5F, -1.4659F, -5.3412F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 38).addBox(-2.5F, -2.2159F, -4.3412F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.7F, 0.1F, 0.4363F, 0.0F, 0.0F));
		PartDefinition endo_torso2 = Torso.addOrReplaceChild("endo_torso2",
				CubeListBuilder.create().texOffs(0, 15).addBox(2.0F, -29.0F, -1.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 42).addBox(2.5305F, -25.4621F, -1.0F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-3.2195F, -9.2121F, -1.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 33).addBox(0.0F, -34.5F, -1.5F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 41).mirror()
						.addBox(3.2805F, -9.2121F, -1.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 42).mirror().addBox(-2.7195F, -25.4621F, -1.0F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 33)
						.addBox(-3.0F, -26.0F, -2.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 38).addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 38)
						.addBox(2.0F, -17.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 16.0F, 2.0F));
		PartDefinition endo_torso_r1 = endo_torso2.addOrReplaceChild("endo_torso_r1", CubeListBuilder.create().texOffs(34, 7).addBox(-6.5F, -3.0F, 0.0F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5305F, -14.2121F, -1.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition endo_torso_r2 = endo_torso2.addOrReplaceChild("endo_torso_r2", CubeListBuilder.create().texOffs(0, 41).addBox(-6.25F, -1.5F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0305F, -7.7121F, -1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition endo_torso_r3 = endo_torso2.addOrReplaceChild("endo_torso_r3", CubeListBuilder.create().texOffs(0, 41).addBox(-6.25F, -1.5F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0305F, -7.7121F, -1.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube = MainCharacter.addOrReplaceChild("cube", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, -3.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		MainCharacter.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
