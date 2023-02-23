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
public class ModelSpringBonnieCutOut<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_spring_bonnie_cut_out"), "main");
	public final ModelPart bone;

	public ModelSpringBonnieCutOut(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition
				.addOrReplaceChild(
						"bone", CubeListBuilder.create().texOffs(0, 0).addBox(-15.4F, -48.0F, -0.99F, 38.0F, 48.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-15.4F, -48.0F, -1.0F, 38.0F, 48.0F, 0.0F, new CubeDeformation(0.0F))
								.texOffs(25, 159).addBox(-4.0F, -15.5F, -1.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(25, 159).addBox(2.0F, -15.5F, -1.5F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(21, 101).addBox(-13.6F, -9.0F, -9.51F, 14.0F, 25.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 101).addBox(-13.6F, -9.0F, -3.51F, 14.0F, 25.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.1F, -16.0F, -0.99F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 75, 192);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
