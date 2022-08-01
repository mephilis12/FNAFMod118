// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelToy_Foxy_Daytime<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "toy_foxy_daytime"), "main");
	private final ModelPart Head;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Tail;
	private final ModelPart Body;

	public ModelToy_Foxy_Daytime(ModelPart root) {
		this.Head = root.getChild("Head");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Tail = root.getChild("Tail");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 24)
						.addBox(-4.0F, -9.2F, -3.5F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(23, 14)
						.addBox(-6.0F, -4.2F, -3.5F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 33)
						.addBox(-3.0F, -4.2F, -6.5F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 27)
						.addBox(-1.0F, -5.2F, -8.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(-2.0F, -4.2F, -8.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 14)
						.addBox(-2.0F, -2.2F, -8.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.6F, 1.0F));

		PartDefinition endo_head = Head.addOrReplaceChild("endo_head", CubeListBuilder.create().texOffs(27, 4)
				.addBox(11.7381F, 4.0952F, 0.5857F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
				.addBox(11.2381F, 0.0952F, 0.0857F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 33)
				.addBox(14.7381F, 0.5952F, -3.9143F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
				.addBox(13.7381F, 4.0952F, 0.0857F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 50)
				.addBox(12.7381F, 4.5952F, -3.9143F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
				.addBox(12.2381F, 4.0952F, -1.9143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 54)
				.addBox(12.2381F, 2.2952F, -1.4143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 54)
				.addBox(15.9381F, 2.2952F, -1.4143F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
				.addBox(16.2381F, 4.0952F, -1.9143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 0)
				.addBox(16.2381F, 1.0952F, -1.9143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 0)
				.addBox(12.2381F, 1.0952F, -1.9143F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 4)
				.addBox(12.2381F, 1.0952F, -1.9143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 4)
				.addBox(16.2381F, 1.0952F, -1.9143F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 12)
				.addBox(13.7381F, 5.0952F, 0.0857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 14)
				.addBox(13.2381F, 5.0952F, -3.4143F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 27)
				.addBox(11.7381F, 1.7952F, -2.9143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 55)
				.addBox(11.2381F, 1.2952F, -3.4143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 55)
				.addBox(15.2381F, 1.2952F, -3.4143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 27)
				.addBox(15.7381F, 1.7952F, -2.9143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(5, 12)
				.addBox(16.2381F, 2.2952F, -3.0143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 12)
				.addBox(12.2381F, 2.2952F, -3.0143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.7381F, -8.0952F, 0.4143F));

		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(),
				PartPose.offset(13.2381F, 1.8452F, 0.7857F));

		PartDefinition cube_r1 = endoi_jaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(61, 14)
						.addBox(-1.5F, -0.75F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(27, 5)
						.addBox(-3.5F, -0.25F, -2.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(50, 61)
						.addBox(-1.5F, -0.75F, -5.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 27)
						.addBox(-2.5F, -0.25F, -6.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 5.5F, -2.7F, 0.1745F, 0.0F, 0.0F));

		PartDefinition LeftEar = endo_head.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(23, 13)
						.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 45)
						.addBox(-2.0F, -8.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.7381F, 0.6952F, -0.4143F, 0.0F, 0.0F, 0.7854F));

		PartDefinition RightEar = endo_head.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(23, 13)
						.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 38)
						.addBox(-2.5F, -8.0F, -0.5F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.7381F, 0.6952F, -0.4143F, 0.0F, 0.0F, -0.7854F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(11, 63)
						.addBox(-0.35F, 0.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 55)
						.addBox(-1.35F, 1.6F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 47)
						.addBox(-0.8F, 6.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -1.0F, 1.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 55)
						.addBox(-1.3F, 0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.3F, 0.0F));

		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2",
				CubeListBuilder.create().texOffs(62, 25)
						.addBox(-0.89F, -0.3F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 55)
						.addBox(1.11F, 0.7F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-0.89F, 1.7F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(29, 54)
						.addBox(-1.5F, 1.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 63)
						.addBox(-0.5F, 0.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 47)
						.addBox(-1.0F, 6.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -1.0F, 1.0F, -0.6675F, 0.5536F, 0.5659F));

		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 54)
						.addBox(-1.5F, 0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 61)
						.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.3F, 0.0F, -1.9635F, 0.0F, 0.0F));

		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(0, 71)
						.addBox(-1.41F, -0.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)).texOffs(0, 77)
						.addBox(-2.41F, 2.7F, 0.0F, 5.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 5.5F, 0.0F, 0.0F, 0.9163F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(28, 47)
						.addBox(-1.0019F, 6.0F, -1.0436F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-2.6F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(31, 62)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.6F, 9.0F, 1.0F));

		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(54, 20)
						.addBox(-1.5F, 6.901F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-2.6F, 5.901F, -6.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 39)
						.addBox(-2.6F, 4.901F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(23, 61)
						.addBox(-1.0F, 1.001F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 47)
						.addBox(-2.1F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition bone7 = bone4.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(-0.5F, 7.0F, -1.5F));

		PartDefinition bone9 = bone4.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1F, 7.0F, 0.7F, 0.0F, -0.1309F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(28, 47)
						.addBox(-1.0019F, 6.0F, -0.9564F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 27)
						.addBox(-2.5F, -0.5F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(31, 62)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 9.0F, 1.0F));

		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(48, 0)
						.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 61)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 39)
						.addBox(-2.5F, 4.901F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-2.5F, 5.901F, -6.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 20)
						.addBox(-1.5F, 6.901F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition bone8 = right_lower_leg.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offset(-4.7F, 7.0F, 0.7F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail",
				CubeListBuilder.create().texOffs(0, 83)
						.addBox(-3.0F, -2.5F, -1.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 120)
						.addBox(-2.0F, -3.5F, 5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 5.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 12)
						.addBox(-4.0F, -14.0F, -3.9F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(55, 10)
						.addBox(-3.0F, -14.0F, -4.4F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-1.0F, -13.0F, -4.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -9.0F, -3.9F, 10.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 57)
						.addBox(-6.5F, -13.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(13, 57)
						.addBox(3.5F, -13.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 1.0F));

		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, -12.0F, -3.5F));

		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(62, 52)
						.addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(15, 63)
						.addBox(2.0F, -18.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(-1.0F, -17.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
						.addBox(-1.5F, -17.5F, -4.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 20)
						.addBox(2.0F, -28.5F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 63)
						.addBox(2.5F, -29.5F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(0, 24)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(40, 39)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Tail.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}