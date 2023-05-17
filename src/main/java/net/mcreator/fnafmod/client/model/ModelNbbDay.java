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
public class ModelNbbDay<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fnaf_mod", "model_nbb_day"), "main");
	public final ModelPart bone;

	public ModelNbbDay(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 107).addBox(-6.0F, -3.75F, -5.5F, 12.0F, 10.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(62, 34).addBox(-6.0F, -2.25F, -1.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.0F, 15.95F, 5.5F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone33 = bone.addOrReplaceChild("bone33",
				CubeListBuilder.create().texOffs(76, 38).addBox(-2.5F, -1.0F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 92).addBox(-1.5F, 2.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 6.25F, -4.0F, -1.4385F, 0.5476F, -0.0241F));
		PartDefinition bone32 = bone33.addOrReplaceChild("bone32", CubeListBuilder.create().texOffs(0, 83).addBox(-2.5F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 3.0F, -0.5F, 1.2217F, 0.0F, 0.0F));
		PartDefinition bone34 = bone32.addOrReplaceChild("bone34",
				CubeListBuilder.create().texOffs(0, 69).addBox(-2.5F, -1.0F, -3.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 68).addBox(-3.0F, -2.0F, -8.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 0.5F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bone35 = bone.addOrReplaceChild("bone35",
				CubeListBuilder.create().texOffs(74, 13).addBox(-1.5F, -1.0F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 92).addBox(-0.5F, 2.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 6.25F, -4.0F, -1.5722F, -0.5476F, -0.0241F));
		PartDefinition bone36 = bone35.addOrReplaceChild("bone36", CubeListBuilder.create().texOffs(14, 92).addBox(-1.5F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 3.0F, -0.5F, 1.309F, 0.0F, 0.0F));
		PartDefinition bone37 = bone36.addOrReplaceChild("bone37",
				CubeListBuilder.create().texOffs(55, 68).addBox(-1.5F, -1.0F, -3.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 5).addBox(-2.0F, -2.0F, -8.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 0.5F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone38 = bone.addOrReplaceChild("bone38",
				CubeListBuilder.create().texOffs(31, 0).addBox(-6.0F, -7.0F, -2.0F, 12.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(62, 0).addBox(-6.0F, -7.0F, -4.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-5.0F, -8.0F, -7.0F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -4.5F, -9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 64)
						.addBox(4.0F, -4.0F, -7.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(71, 56).addBox(-6.0F, -4.0F, -7.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 0)
						.addBox(-3.5F, -6.0F, -6.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 77).addBox(-4.0F, -6.5F, -6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(31, 0)
						.addBox(1.5F, -6.0F, -6.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 77).addBox(1.0F, -6.5F, -6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 72)
						.addBox(-4.5F, -7.6F, -6.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 72).addBox(0.5F, -7.6F, -6.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 43)
						.addBox(-6.0F, -11.0F, -4.0F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(39, 56).addBox(-6.0F, -11.0F, -7.0F, 12.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(17, 85)
						.addBox(-0.5F, -14.0F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-9, 97).addBox(-5.0F, -14.0F, -7.0F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(21, 85)
						.addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(31, 30).addBox(-5.0F, -2.0F, -7.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(86, 0)
						.addBox(-5.0F, -1.0F, -7.0F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.75F, -3.5F, 0.1745F, 0.0F, 0.0F));
		PartDefinition bone39 = bone38.addOrReplaceChild("bone39",
				CubeListBuilder.create().texOffs(31, 11).addBox(-5.5F, 0.4092F, -8.2638F, 11.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(-5.5F, 2.4092F, -8.2638F, 11.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(62, 26)
						.addBox(-5.5F, 1.4092F, -4.2638F, 11.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(55, 121).addBox(-3.5F, 1.4092F, -6.2638F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(55, 113)
						.addBox(-3.5F, 0.4092F, -6.2638F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-4.5F, -0.5908F, -8.2638F, 9.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 1.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition bone40 = bone.addOrReplaceChild("bone40",
				CubeListBuilder.create().texOffs(27, 54).addBox(-5.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(65, 81).addBox(-6.0F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -1.25F, 0.0F, 0.2618F, 0.5585F, -0.4481F));
		PartDefinition bone45 = bone40.addOrReplaceChild("bone45", CubeListBuilder.create().texOffs(13, 77).addBox(-6.0F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, -0.5672F, 0.0F));
		PartDefinition bone44 = bone45.addOrReplaceChild("bone44", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.1368F, -0.056F, 0.0508F));
		PartDefinition bone3 = bone44.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(81, 116).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition bone2 = bone44.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(93, 120).addBox(-4.0F, -1.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(81, 122).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone41 = bone.addOrReplaceChild("bone41",
				CubeListBuilder.create().texOffs(80, 5).addBox(1.0F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 42).addBox(0.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -1.25F, 0.0F, 0.2877F, -0.5467F, 0.3988F));
		PartDefinition bone43 = bone41.addOrReplaceChild("bone43", CubeListBuilder.create().texOffs(28, 77).addBox(1.0F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.7418F, 0.0F));
		PartDefinition bone42 = bone43.addOrReplaceChild("bone42", CubeListBuilder.create().texOffs(0, 5).addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition bone4 = bone42.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(113, 120).addBox(2.0F, -1.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(116, 111).addBox(0.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition bone5 = bone42.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(105, 122).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 1.0F, -1.0F, 0.0F, 0.0F, -0.5672F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
