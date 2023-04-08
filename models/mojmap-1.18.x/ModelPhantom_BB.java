// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPhantom_BB<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "phantom_bb"), "main");
	private final ModelPart head;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart body;

	public ModelPhantom_BB(ModelPart root) {
		this.head = root.getChild("head");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(51, 50)
						.addBox(-2.5F, -3.2F, -3.4F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 53)
						.addBox(-1.0F, -3.7F, -5.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(0.0F, -4.7F, -5.5F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 44)
						.addBox(-2.5F, -3.7F, -3.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(47, 28)
						.addBox(-4.0F, -3.7F, -4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-4.5F, -6.7F, -2.5F, 9.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-3.5F, -6.7F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(27, 31)
						.addBox(-4.5F, -8.7F, -4.5F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(51, 18)
						.addBox(-1.0F, -9.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -11.7F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 3)
						.addBox(-0.5F, -12.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 12)
						.addBox(-4.0F, -12.2F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 7.5F, 3.5F));

		PartDefinition bone = head.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 5)
						.addBox(-0.5F, -11.2F, -0.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-1.0F, -11.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(2.5F, -11.2F, -0.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(2.0F, -11.7F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 12)
						.addBox(1.5F, -12.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 12)
						.addBox(-1.5F, -12.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 6.0F, -2.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(49, 22)
						.addBox(-1.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 10.5F, 3.5F, 0.0F, 0.0F, 1.4399F));

		PartDefinition bone6 = LeftArm.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(20, 20)
						.addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(4.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(27, 22)
						.addBox(-3.0F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 10.5F, 3.5F, 0.0F, 0.0F, -1.3963F));

		PartDefinition bone4 = RightArm.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(1, 20)
						.addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-6.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition bone3 = bone4.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 0.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(28, 47)
						.addBox(-1.5F, -0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 50)
						.addBox(-2.0F, 4.8F, -6.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(-1.5F, 4.8F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 17.5F, 3.5F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(28, 47)
						.addBox(-1.5F, -0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(-1.5F, 4.8F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 50)
						.addBox(-2.0F, 4.8F, -6.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 17.5F, 3.5F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 22)
						.addBox(-3.0F, -15.7F, -1.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(0.5F, -13.2F, -1.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(0.5F, -15.7F, -1.1F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.5F, -17.2F, 2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightArm.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}