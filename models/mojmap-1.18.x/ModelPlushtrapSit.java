// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPlushtrapSit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "plushtrapsit"), "main");
	private final ModelPart bone;

	public ModelPlushtrapSit(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 31.0F, 3.0F));

		PartDefinition RightLeg = bone.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(24, 30)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, -1)
						.addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -8.5F, -1.5F, -2.2693F, 0.0403F, -0.0167F));

		PartDefinition bone4 = RightLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(0.0F, 0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 33)
						.addBox(-1.0F, -0.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 2.0508F, 0.0F, 0.0F));

		PartDefinition bone17 = bone4.addOrReplaceChild("bone17",
				CubeListBuilder.create().texOffs(0, 40)
						.addBox(-1.6F, 1.0F, -4.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 59)
						.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Body = bone.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(17, 7)
						.addBox(-2.0F, 1.8125F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 5)
						.addBox(-2.5F, -3.6875F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-0.5F, 1.3125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 16)
						.addBox(1.0F, 1.3125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 10)
						.addBox(-2.0F, 1.3125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-0.5F, -6.1875F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 8)
						.addBox(-1.5F, 0.8125F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 8)
						.addBox(-1.5F, -3.6875F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 9)
						.addBox(-0.5F, -3.9375F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 6)
						.addBox(-1.5F, -4.4375F, -2.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.3125F, 0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone12 = Body.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(33, 12).addBox(-2.5F,
				-13.5F, -1.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.3125F, -0.5F));

		PartDefinition cube_r1 = bone12.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 58).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.7F, 0.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition LeftLeg = bone.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(24, 38)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, -1)
						.addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -8.5F, -1.5F, -2.1717F, -0.1462F, -0.058F));

		PartDefinition bone5 = LeftLeg.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(17, 19)
						.addBox(0.0F, 0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 41)
						.addBox(-1.0F, -0.7F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 1.6581F, 0.0F, 0.0F));

		PartDefinition bone18 = bone5.addOrReplaceChild("bone18",
				CubeListBuilder.create().texOffs(0, 40)
						.addBox(-1.6F, 1.0F, -4.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 59)
						.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 0.5509F, -0.3007F, -0.18F));

		PartDefinition RightArm = bone.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-2.5F, -12.5F, 0.5F));

		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2",
				CubeListBuilder.create().texOffs(39, 27)
						.addBox(-3.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 26)
						.addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0927F, 0.154F, -0.9548F));

		PartDefinition bone10 = RightArm2.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(15, 55)
						.addBox(-3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 24)
						.addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 1.3094F, -0.8714F, -0.4792F));

		PartDefinition bone11 = bone10.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(1, 21).addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, -0.0206F, -0.1494F, 1.1054F));

		PartDefinition cube_r2 = bone11.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(21, 21).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r3 = bone11.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(8, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.0F, -1.5F, -0.8303F, 0.5545F, 0.4486F));

		PartDefinition LeftArm = bone.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.5F, -12.5F, 0.5F, -0.9163F, 0.0F, 0.0F));

		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2",
				CubeListBuilder.create().texOffs(53, 27)
						.addBox(0.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 26)
						.addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2232F, -0.5055F, 0.989F));

		PartDefinition bone7 = LeftArm2.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(24, 10)
						.addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 49)
						.addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(1, 17).addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 1.0868F, 0.4318F, -0.2166F));

		PartDefinition cube_r4 = bone8.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(13, 21).addBox(-0.75F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r5 = bone8.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(22, 11).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -0.5F, -2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Head = bone.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -15.0F, 0.5F));

		PartDefinition Head2 = Head.addOrReplaceChild("Head2",
				CubeListBuilder.create().texOffs(14, 25)
						.addBox(-0.5F, -3.1F, -3.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 27)
						.addBox(-1.8F, -3.6F, -2.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.2F)).texOffs(17, 27)
						.addBox(0.8F, -3.6F, -2.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.2F)).texOffs(34, 46)
						.addBox(-2.0F, -2.6F, -3.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 47)
						.addBox(-2.5F, -4.6F, -2.5F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 57)
						.addBox(-1.5F, -5.6F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(7, 16)
						.addBox(-2.3F, -2.05F, -2.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 15)
						.addBox(-1.5F, -2.05F, -3.3F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 16)
						.addBox(2.3F, -2.05F, -2.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 15)
						.addBox(-1.8F, -3.6F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(55, 15)
						.addBox(0.8F, -3.6F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)).texOffs(37, 37)
						.addBox(-2.0F, -4.1F, -2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3925F, 0.0038F, -0.0872F));

		PartDefinition bone20 = Head2.addOrReplaceChild("bone20",
				CubeListBuilder.create().texOffs(22, 8)
						.addBox(-1.5F, -0.5F, -3.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-2.5F, -0.5F, -2.5F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 28)
						.addBox(2.3F, -1.05F, -2.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 27)
						.addBox(-1.5F, -1.05F, -3.3F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 28)
						.addBox(-2.3F, -1.05F, -2.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition LeftEar = Head2.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(33, 0)
						.addBox(-1.1305F, -4.4914F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 0)
						.addBox(-0.6305F, -4.9914F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -4.0F, 0.0F, 0.3043F, -0.0262F, 0.0832F));

		PartDefinition bone16 = LeftEar.addOrReplaceChild("bone16",
				CubeListBuilder.create().texOffs(13, 0)
						.addBox(-0.6305F, -4.2011F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(39, 1)
						.addBox(-1.1305F, -2.2011F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, 0.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone16.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(39, 4).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1305F, -2.3794F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition RightEar = Head2.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(33, 0)
						.addBox(-0.8695F, -4.4914F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 0)
						.addBox(-0.3695F, -4.9914F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -4.0F, 0.0F, 0.258F, 0.045F, -0.1687F));

		PartDefinition bone15 = RightEar.addOrReplaceChild("bone15",
				CubeListBuilder.create().texOffs(13, 0)
						.addBox(-0.3695F, -4.2011F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(39, 1)
						.addBox(-0.8695F, -2.2011F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone15.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(39, 4).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1305F, -2.3794F, 0.0F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}