// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelnightmarionne<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nightmarionne"), "main");
	private final ModelPart Head;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart Body;

	public Modelnightmarionne(ModelPart root) {
		this.Head = root.getChild("Head");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.5F, -19.1667F, -13.0F));

		PartDefinition Head2 = Head.addOrReplaceChild("Head2",
				CubeListBuilder.create().texOffs(0, 9)
						.addBox(-3.0F, -8.8333F, -2.5F, 6.0F, 9.0F, 4.0F, new CubeDeformation(-0.01F)).texOffs(3, 0)
						.addBox(-2.0F, -5.8333F, -2.7F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 23)
						.addBox(-4.0F, -4.3333F, -3.5F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 29)
						.addBox(-3.5F, -9.3333F, -3.5F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 0)
						.addBox(1.0F, -5.8333F, -2.7F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 36)
						.addBox(-3.0F, -0.3333F, -3.5F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3043F, 0.0262F, -0.0832F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(),
				PartPose.offset(4.5745F, -15.6674F, -8.7F));

		PartDefinition left_arm2 = left_arm
				.addOrReplaceChild("left_arm2",
						CubeListBuilder.create().texOffs(16, 36).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 9.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition left_lower_arm = left_arm2.addOrReplaceChild("left_lower_arm",
				CubeListBuilder.create().texOffs(16, 22).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -1.3299F, 0.4573F, -0.5046F));

		PartDefinition right_hand2 = left_lower_arm.addOrReplaceChild("right_hand2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.5887F, 16.6954F, 2.6716F, 0.0F, 2.3562F, 0.0F));

		PartDefinition bone5 = right_hand2.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(46, 0).addBox(-1.4414F, -12.147F, -2.8406F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4142F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone5.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(26, 46).addBox(-1.5F, -7.8829F, -9.3298F, 1.0F, 7.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0586F, 7.0242F, -1.3175F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone6 = right_hand2.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(12, 41).addBox(-1.4414F, -11.9216F, 2.4066F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4142F, 3.15F, -1.2F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone6.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(16, 47).addBox(-0.5F, -8.0F, 0.5F, 1.0F, 7.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9414F, 2.6762F, 0.3521F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone7 = right_hand2.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(44, 45).addBox(-1.4414F, -12.147F, -2.8406F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5858F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone7.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(24, 46).addBox(0.5F, -8.6441F, -5.041F, 1.0F, 7.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9414F, 4.6129F, -0.1323F, -0.3054F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(),
				PartPose.offset(-3.612F, -15.6914F, -8.7427F));

		PartDefinition right_arm2 = right_arm.addOrReplaceChild("right_arm2",
				CubeListBuilder.create().texOffs(36, 39).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, 0.5672F));

		PartDefinition right_lower_arm = right_arm2.addOrReplaceChild("right_lower_arm",
				CubeListBuilder.create().texOffs(24, 36).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -2.0768F, -0.3337F, 2.0298F));

		PartDefinition right_hand = right_lower_arm.addOrReplaceChild("right_hand", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.5311F, 16.9268F, -3.9643F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone2 = right_hand.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(46, 0).addBox(0.2205F, -12.43F, -2.8743F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4142F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(24, 46).addBox(-1.7812F, -11.6388F, -9.0441F, 1.0F, 7.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0018F, 8.3895F, 2.7503F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone3 = right_hand.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(12, 41).addBox(0.2205F, -12.1922F, 2.4956F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4142F, 3.15F, -1.2F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(26, 46).addBox(-0.7812F, -12.9967F, -3.5052F, 1.0F, 7.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0018F, 8.2686F, 3.0166F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone4 = right_hand.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(44, 45).addBox(0.2205F, -12.43F, -2.8743F, 1.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5858F, 3.25F, -1.2F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone4.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(16, 47).addBox(0.2188F, -7.8768F, -10.3301F, 1.0F, 7.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0018F, 7.4435F, -0.6403F, -0.7854F, 0.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(),
				PartPose.offset(3.5F, -7.5F, 1.5F));

		PartDefinition left_leg2 = left_leg.addOrReplaceChild("left_leg2",
				CubeListBuilder.create().texOffs(42, 9)
						.addBox(0.0663F, 14.6027F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
						.addBox(0.5663F, -0.3973F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -0.48F, 0.0F, -0.1309F));

		PartDefinition left_lower_leg = left_leg2.addOrReplaceChild("left_lower_leg",
				CubeListBuilder.create().texOffs(28, 23).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5663F, 16.1027F, 0.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(),
				PartPose.offset(-0.5F, -8.5F, 1.5F));

		PartDefinition right_leg2 = right_leg.addOrReplaceChild("right_leg2",
				CubeListBuilder.create().texOffs(0, 42)
						.addBox(-3.0663F, 14.6027F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-2.5663F, -0.3973F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.1309F));

		PartDefinition right_lower_leg = right_leg2.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(8, 22).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 17.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5663F, 16.1027F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(28, 42)
						.addBox(-1.0F, -18.7032F, -1.2113F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 16)
						.addBox(-3.0F, -1.7032F, -2.4113F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 39)
						.addBox(-1.0F, -5.7032F, -0.9113F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-2.5F, -10.7032F, -2.4113F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 9)
						.addBox(-4.5F, -10.2032F, -1.4113F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, -14.7032F, -3.4113F, 9.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -9.2968F, 1.7113F, 0.9599F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}