// Made with Blockbench 4.3.0
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFredbearFNAF4<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fredbearfnaf4"), "main");
	private final ModelPart Body;

	public ModelFredbearFNAF4(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(86, 37)
						.addBox(-8.05F, -13.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(85, 71)
						.addBox(6.05F, -13.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(31, 7)
						.addBox(-5.5F, -4.5F, -4.0F, 11.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(49, 78)
						.addBox(-4.0F, -15.0F, -5.7F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 37)
						.addBox(-1.0F, -14.0F, -6.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-1.0F, -11.0F, -5.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(-1.0F, -8.0F, -5.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-0.5F, -11.0F, -4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -9.0F, -4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.5F, -10.5F, -5.0F, 11.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-4.5F, -14.5F, -5.0F, 9.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 1.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition LeftArm_r1 = Body.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(0, 77).addBox(-2.5F, -2.5F, -2.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.55F, -13.1F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition LeftArm_r2 = Body.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(78, 10).addBox(-0.5F, -2.5F, -2.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.55F, -13.1F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(48, 0)
						.addBox(-4.5F, -2.2F, -5.0F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 72)
						.addBox(-3.5F, -3.2F, -6.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(-3.5F, -4.2F, -7.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 18)
						.addBox(-4.0F, -9.2F, -5.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(4, 22)
						.addBox(-3.0F, -7.7F, -5.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(1.0F, -7.7F, -5.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(53, 66)
						.addBox(-2.5F, -10.2F, -3.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 38)
						.addBox(-1.5F, -13.2F, -2.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-5.0F, -5.2F, -5.0F, 10.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.8F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(28, 32)
						.addBox(-4.5F, 0.15F, -3.1652F, 9.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-3.5F, 0.15F, -7.1652F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(47, 43)
						.addBox(-3.0F, -0.75F, -6.6652F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.4932F, 1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(12, 63)
						.addBox(-1.5F, -3.2F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 48)
						.addBox(-1.0F, -3.2F, 0.0F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 7)
						.addBox(-1.0F, 0.8F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -9.0F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition RightEar = Head.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(53, 57)
						.addBox(-1.5F, -3.2F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-1.0F, -3.2F, 0.0F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 4)
						.addBox(-1.0F, 0.8F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -9.0F, -1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition RightTop = RightEar.addOrReplaceChild("RightTop", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition endo_head = Head.addOrReplaceChild("endo_head", CubeListBuilder.create().texOffs(40, 54)
				.addBox(10.2381F, -1.7048F, -1.4143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 31)
				.addBox(15.2381F, -1.7048F, -1.4143F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 85)
				.addBox(11.2381F, -3.7048F, -0.4143F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(50, 4)
				.addBox(11.7381F, -0.7048F, -3.4143F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 5)
				.addBox(10.2381F, -4.7048F, -2.7143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(83, 31)
				.addBox(13.7381F, -5.2048F, -3.2143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 40)
				.addBox(9.7381F, -5.2048F, -3.2143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(31, 65)
				.addBox(14.2381F, -4.7048F, -2.7143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 1)
				.addBox(14.7381F, -4.1548F, -2.8143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
				.addBox(10.7381F, -4.1548F, -2.8143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(70, 23)
				.addBox(9.7381F, -0.4048F, -0.4143F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));

		PartDefinition bone = endo_head.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-0.7619F, 19.5952F, 9.2857F));

		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 52)
						.addBox(-2.51F, 2.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(76, 86)
						.addBox(-0.35F, 1.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 78)
						.addBox(-1.35F, 2.6F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 84)
						.addBox(-0.8F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -13.4F, 0.0F, -1.385F, -1.2727F, 0.0109F));

		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(80, 87)
						.addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 17)
						.addBox(-0.8F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 68)
						.addBox(-2.01F, -0.3F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.8988F, -0.0572F, -0.2102F));

		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(15, 52)
						.addBox(-0.5F, 0.6F, -1.625F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(83, 65)
						.addBox(-1.0F, 0.5F, -2.125F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 5.6F, -0.125F, 3.1416F, 0.5672F, 2.8798F));

		PartDefinition LeftArm_r3 = bone6.addOrReplaceChild("LeftArm_r3",
				CubeListBuilder.create().texOffs(62, 40).addBox(1.0F, -1.0F, 0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.1F, 0.375F, 0.0F, -0.7418F, 0.0F));

		PartDefinition LeftArm_r4 = bone6.addOrReplaceChild("LeftArm_r4",
				CubeListBuilder.create().texOffs(61, 78).addBox(-1.4226F, -2.5F, -1.5F, 3.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5774F, 3.6F, -0.625F, 0.0F, 0.0F, 1.7453F));

		PartDefinition RightArm = Body.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(20, 54)
						.addBox(-2.51F, 2.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 79)
						.addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 26)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 76)
						.addBox(-1.0F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -13.3F, 0.0F, 0.0F, -1.0472F, 0.7854F));

		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(52, 31)
						.addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(69, 68)
						.addBox(-2.01F, -0.3F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -1.5708F, -0.3054F, 0.0F));

		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(83, 82)
						.addBox(-0.9F, 0.5F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 54)
						.addBox(-0.4F, 0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 48)
						.addBox(1.1F, 1.2F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 78)
						.addBox(-0.9F, 2.2F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.09F, 5.5F, 0.0F));

		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1176F, 1.1319F, 0.0F, 0.0F, 0.0F, 2.9671F));

		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(22, 40)
						.addBox(-2.4913F, 0.0F, -4.1004F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 87)
						.addBox(-0.9913F, 9.0F, -0.6004F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-0.9913F, 3.0F, -1.1004F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 76)
						.addBox(-1.4913F, 1.5F, -1.6004F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5349F, -1.0F, -0.5985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0913F, -2.0F, 0.1004F, 0.0361F, -0.3911F, -0.0944F));

		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(57, 26)
						.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 82)
						.addBox(-2.0F, -2.0F, -3.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 84)
						.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0087F, 10.0F, -0.1004F));

		PartDefinition bone8 = bone4.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(58, 57)
						.addBox(-1.5F, 1.0F, -7.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 65)
						.addBox(-1.9F, 0.001F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(72, 5)
						.addBox(-1.9F, 3.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(82, 59)
						.addBox(-1.4F, 1.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 6.0F, 0.5F, 0.0436F, -0.2618F, 0.0873F));

		PartDefinition LeftArm_r5 = bone8.addOrReplaceChild("LeftArm_r5",
				CubeListBuilder.create().texOffs(52, 72).addBox(-3.5F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1F, 2.1352F, -1.5948F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone8.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(60, 4).addBox(0.1741F, 0.8579F, -6.4002F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4954F, 0.6421F, -0.4479F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r2 = bone8.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(54, 17).addBox(-4.1221F, 0.8579F, -6.4998F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4954F, 0.6421F, -0.4479F, 0.0F, 0.1745F, 0.0F));

		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(12, 87)
						.addBox(-1.0087F, 9.0F, -0.6004F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0087F, 3.0F, -1.1004F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-2.5087F, 0.0F, -4.1004F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(74, 34)
						.addBox(-1.5087F, 1.5F, -1.6004F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-0.4651F, -1.0F, -0.5985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9807F, -2.0F, 0.1428F, 0.0094F, 0.9256F, 0.0999F));

		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(40, 57)
						.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(79, 43)
						.addBox(-2.0F, -2.0F, -3.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 84)
						.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0087F, 10.0F, -0.1004F, 0.0436F, 0.0F, 0.0F));

		PartDefinition bone7 = right_lower_leg.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(66, 13)
						.addBox(-1.5F, 1.0F, -7.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(66, 46)
						.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 74)
						.addBox(-2.0F, 3.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 84)
						.addBox(-1.5F, 1.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.5F));

		PartDefinition LeftArm_r6 = bone7.addOrReplaceChild("LeftArm_r6",
				CubeListBuilder.create().texOffs(71, 61).addBox(-2.0F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 2.1352F, -1.5948F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone7.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(62, 37).addBox(-1.5F, -1.5F, -5.0F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, -1.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r4 = bone7.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 63).addBox(-1.5F, -1.5F, -5.0F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 3.0F, -1.5F, 0.0F, -0.2182F, 0.0F));

		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(81, 19)
						.addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(37, 84)
						.addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 48)
						.addBox(-0.5F, -25.0F, -4.5F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 55)
						.addBox(-1.0F, -17.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 49)
						.addBox(2.0F, -30.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 17)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(4, 33)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(4, 32)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(0, 38)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(70, 28)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}