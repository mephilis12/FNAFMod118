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
public class ModelFreddy_Mask<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_freddy_mask"), "main");
	public final ModelPart Head;

	public ModelFreddy_Mask(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.51F)).texOffs(4, 25).addBox(-4.5F, -4.0F, -4.3F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.5F)).texOffs(6, 20)
						.addBox(-4.0F, -1.0F, 1.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.51F)).texOffs(16, 31).addBox(-3.0F, -3.5F, -5.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(24, 35)
						.addBox(-1.0F, -4.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(22, 50).addBox(3.5F, -10.5F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(22, 55)
						.addBox(-6.5F, -10.5F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
