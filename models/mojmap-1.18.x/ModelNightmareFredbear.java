// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelNightmareFredbear<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nightmarefredbear"), "main");
	private final ModelPart Head;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Body;

	public ModelNightmareFredbear(ModelPart root) {
		this.Head = root.getChild("Head");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -11.8F, 1.0F));

		PartDefinition Head2 = Head.addOrReplaceChild("Head2",
				CubeListBuilder.create().texOffs(37, 0)
						.addBox(-4.5F, -2.2F, -5.0F, 9.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(84, 11)
						.addBox(-3.5F, -2.2F, -6.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(81, 65)
						.addBox(-3.5F, -4.2F, -7.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 8)
						.addBox(-1.0F, -4.7F, -7.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 26)
						.addBox(-8.0F, -9.2F, -5.0F, 16.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-4.0F, -9.2F, -5.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(53, 77)
						.addBox(-2.5F, -10.2F, -3.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 54)
						.addBox(-1.5F, -13.2F, -2.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(33, 32)
						.addBox(-5.0F, -5.2F, -5.0F, 10.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Jaw = Head2.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(32, 16)
						.addBox(-5.5F, -0.85F, -4.1652F, 11.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(72, 46)
						.addBox(-3.5F, 0.15F, -7.1652F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 83)
						.addBox(-3.0F, -1.25F, -6.6652F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(61, 13)
						.addBox(-4.5F, -1.25F, -3.6652F, 9.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(71, 37)
						.addBox(-2.5F, -3.1687F, -3.2497F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(74, 60)
						.addBox(-3.5F, -0.2068F, -0.5F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.5068F, 1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition LeftEar = Head2.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(15, 68)
						.addBox(-1.5F, -3.2F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 79)
						.addBox(-1.0F, -3.2F, 0.0F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(62, 34)
						.addBox(-1.0F, 0.8F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -9.0F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition RightEar = Head2.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(60, 65)
						.addBox(-1.5F, -3.2F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 14)
						.addBox(-1.0F, -3.2F, 0.0F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(62, 31)
						.addBox(-1.0F, 0.8F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -9.0F, -1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition RightTop = RightEar.addOrReplaceChild("RightTop", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition endo_head = Head2.addOrReplaceChild("endo_head", CubeListBuilder.create().texOffs(12, 89)
				.addBox(-4.2619F, -5.3048F, -3.7143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 54)
				.addBox(-8.2619F, -5.3048F, -3.7143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-3.2619F, -4.0548F, -3.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 65)
				.addBox(-7.7619F, -5.9048F, -2.7143F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
				.addBox(-7.3619F, -4.0548F, -3.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(61, 3)
				.addBox(-7.8619F, -4.6048F, -3.2143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 0)
				.addBox(-3.7619F, -4.6048F, -3.2143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 2)
				.addBox(-7.7619F, -1.4048F, -2.7143F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.7619F, -1.2952F, -1.0857F));

		PartDefinition bone = endo_head.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-0.7619F, 19.5952F, 9.2857F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(7.0F, -6.4F, 3.0F));

		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2",
				CubeListBuilder.create().texOffs(20, 68)
						.addBox(-2.51F, 0.5F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(81, 93)
						.addBox(-0.35F, 1.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 41)
						.addBox(-1.35F, 2.6F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 77)
						.addBox(-0.8F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2182F, -0.48F));

		PartDefinition bone3 = LeftArm2.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(85, 93)
						.addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 89)
						.addBox(-0.8F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(73, 77)
						.addBox(-2.01F, -0.3F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.6394F, 0.2926F, -0.1931F));

		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(67, 57)
						.addBox(-0.5F, 0.6F, -1.625F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(77, 87)
						.addBox(-1.0F, 0.5F, -2.125F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(71, 37)
						.addBox(0.5F, 1.1F, 0.375F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 68)
						.addBox(1.0F, 1.1F, -0.125F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 5.6F, -0.125F, 0.0F, 2.8362F, 0.0F));

		PartDefinition LeftArm_r1 = bone6.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(48, 60)
						.addBox(-0.9226F, -2.5F, 2.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(45, 8)
						.addBox(-0.9226F, -2.5F, 1.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 60)
						.addBox(-0.9226F, -2.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(45, 8)
						.addBox(-0.9226F, -2.5F, -1.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 3.4226F, -0.625F, 0.0F, 0.0F, 1.5708F));

		PartDefinition LeftArm_r2 = bone6.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(85, 83).addBox(0.5774F, -1.5F, -1.5F, 3.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.9226F, -0.625F, 0.0F, 0.0F, 1.5708F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-7.0F, -6.3F, 3.0F));

		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2",
				CubeListBuilder.create().texOffs(69, 26)
						.addBox(-2.51F, 0.5F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(65, 87)
						.addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(77, 93)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 79)
						.addBox(-1.0F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0154F, -0.1739F, 0.435F));

		PartDefinition bone2 = RightArm2.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(32, 16)
						.addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 79)
						.addBox(-2.01F, -0.3F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.6661F, -0.1726F, 0.1341F));

		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(88, 47)
						.addBox(-0.9F, 0.5F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(71, 37)
						.addBox(0.6F, 1.2F, -1.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 76)
						.addBox(-0.4F, 0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 68)
						.addBox(1.1F, 1.2F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 5.5F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition LeftArm_r3 = right_hand
				.addOrReplaceChild("LeftArm_r3",
						CubeListBuilder.create().texOffs(85, 73).addBox(-0.5F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.1F, 3.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition LeftArm_r4 = right_hand.addOrReplaceChild("LeftArm_r4",
				CubeListBuilder.create().texOffs(48, 60)
						.addBox(-0.5F, -2.5F, -1.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(45, 8)
						.addBox(-0.5F, -2.5F, -0.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 60)
						.addBox(-0.5F, -2.5F, 0.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(45, 8)
						.addBox(-0.5F, -2.5F, 1.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, 3.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1176F, 1.1319F, 0.0F, 0.0F, 0.0F, 2.9671F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(3.0913F, 5.0F, 5.1004F));

		PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(24, 54)
						.addBox(-2.9913F, 1.0F, -4.1004F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 94)
						.addBox(-0.9913F, 9.0F, -0.6004F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-0.9913F, 1.0F, -1.1004F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 86)
						.addBox(-1.4913F, 1.5F, -1.6004F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(-0.5349F, -1.0F, -0.5985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2936F, -0.1396F, -0.1682F));

		PartDefinition bone4 = LeftLeg2.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(66, 65)
						.addBox(-2.5F, -1.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(89, 89)
						.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0087F, 10.0F, -0.1004F, 0.4279F, -0.0847F, 0.2013F));

		PartDefinition bone8 = bone4.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(74, 51)
						.addBox(-1.9F, 0.001F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 47)
						.addBox(-2.9F, 2.001F, -7.5F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(84, 24)
						.addBox(-1.9F, 3.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 88)
						.addBox(-1.4F, 1.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 6.0F, 0.5F, -0.128F, 0.1047F, -0.0698F));

		PartDefinition LeftArm_r5 = bone8.addOrReplaceChild("LeftArm_r5",
				CubeListBuilder.create().texOffs(0, 80).addBox(-3.5F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1F, 2.1352F, -1.5948F, 0.2182F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-2.9807F, 5.0F, 5.1428F));

		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(93, 93)
						.addBox(-1.0087F, 9.0F, -0.6004F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0087F, 1.0F, -1.1004F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-3.0087F, 1.0F, -4.1004F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 85)
						.addBox(-1.5087F, 1.5F, -1.6004F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-0.4651F, -1.0F, -0.5985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.2182F));

		PartDefinition right_lower_leg = RightLeg2.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(0, 68)
						.addBox(-2.5F, -1.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(92, 53)
						.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 30)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0087F, 10.0F, -0.1004F, 0.4449F, 0.2808F, -0.1084F));

		PartDefinition bone7 = right_lower_leg.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(35, 76)
						.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 56)
						.addBox(-3.0F, 2.0F, -7.5F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(85, 5)
						.addBox(-2.0F, 3.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(89, 29)
						.addBox(-1.5F, 1.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.5F, -0.0965F, -0.2443F, 0.0F));

		PartDefinition LeftArm_r6 = bone7.addOrReplaceChild("LeftArm_r6",
				CubeListBuilder.create().texOffs(48, 8).addBox(-2.0F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 2.1352F, -1.5948F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(93, 89)
						.addBox(-8.05F, -13.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(91, 41)
						.addBox(6.05F, -13.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-6.5F, -4.5F, -6.0F, 13.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(61, 20)
						.addBox(-1.0F, -13.0F, -7.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 16)
						.addBox(-1.0F, -10.5F, -7.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-1.0F, -8.0F, -7.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.5F, -10.5F, -7.0F, 13.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(68, 20)
						.addBox(-5.5F, -8.5F, -6.5F, 11.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-5.5F, -14.5F, -6.0F, 11.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 5.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(86, 37).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, -6.7F, -0.3054F, 0.0F, 0.0F));

		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(62, 37)
						.addBox(1.5F, -21.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 88)
						.addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 44)
						.addBox(-1.5F, -27.0F, -3.5F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(79, 0)
						.addBox(-1.0F, -18.0F, -2.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 15)
						.addBox(2.0F, -30.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(4, 10)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(0, 10)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(37, 0)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(55, 44)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
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
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}