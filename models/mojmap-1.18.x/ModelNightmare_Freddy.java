// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelNightmare_Freddy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nightmare_freddy"), "main");
	private final ModelPart Head;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Body;

	public ModelNightmare_Freddy(ModelPart root) {
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(34, 0)
						.addBox(-4.0F, -2.2F, -4.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 37)
						.addBox(-3.5F, -3.7F, -6.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(74, 32)
						.addBox(-3.5F, -4.2F, -7.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 43)
						.addBox(-1.0F, -4.7F, -7.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-3.5F, -8.2F, -5.0F, 7.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(52, 70)
						.addBox(-2.5F, -9.2F, -3.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(38, 46)
						.addBox(-1.5F, -12.2F, -2.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 26)
						.addBox(-4.5F, -5.2F, -5.0F, 9.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -9.8F, -2.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(56, 61)
						.addBox(-2.5F, -3.1687F, -3.2497F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(62, 43)
						.addBox(-3.5F, 0.15F, -7.1652F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 22)
						.addBox(-3.0F, -1.25F, -6.6652F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5068F, 1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Jaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(53, 36)
						.addBox(-5.0F, -1.7F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)).texOffs(38, 15)
						.addBox(-5.0F, -0.3F, -3.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -0.159F, -0.6043F, 0.2182F, 0.0F, 0.0F));

		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(84, 12)
						.addBox(-1.5F, -3.2F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 26)
						.addBox(-1.0F, -3.2F, 0.0F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(54, 61)
						.addBox(-1.0F, 0.8F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -8.0F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition RightEar = Head.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(48, 36)
						.addBox(-1.5F, -3.2F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 26)
						.addBox(-1.0F, -3.2F, 0.0F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 18)
						.addBox(-1.0F, 0.8F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -8.0F, -1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition RightTop = RightEar.addOrReplaceChild("RightTop", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition endo_head = Head.addOrReplaceChild("endo_head", CubeListBuilder.create().texOffs(34, 4)
				.addBox(11.2381F, -3.7048F, -0.4143F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 18)
				.addBox(10.5381F, -4.9048F, -3.2143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
				.addBox(10.2381F, -6.4048F, -2.7143F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 46)
				.addBox(10.2381F, -3.4048F, -2.7143F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(79, 8)
				.addBox(10.7381F, -1.4048F, -2.7143F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 15)
				.addBox(13.9381F, -4.9048F, -3.2143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
				.addBox(14.4381F, -4.3548F, -3.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(11.0381F, -4.3548F, -3.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));

		PartDefinition bone = endo_head.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-0.7619F, 19.5952F, 9.2857F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(7.0F, -6.4F, 0.0F));

		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2",
				CubeListBuilder.create().texOffs(60, 0)
						.addBox(-2.51F, 1.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(55, 85)
						.addBox(-0.35F, 1.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 79)
						.addBox(-1.35F, 2.6F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 57)
						.addBox(-0.8F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bone3 = LeftArm2.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(77, 86)
						.addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-0.8F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 72)
						.addBox(-2.01F, -0.3F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.6713F, 0.2068F, -0.1617F));

		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(84, 17)
						.addBox(-0.5F, 0.6F, -1.625F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(81, 54)
						.addBox(-1.0F, 0.5F, -2.125F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 49)
						.addBox(0.5F, 1.1F, -0.125F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 12)
						.addBox(0.5F, 1.1F, 0.375F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 5.6F, -0.125F, 0.0F, -2.7053F, 0.0F));

		PartDefinition LeftArm_r1 = bone6.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(69, 76)
						.addBox(-0.9226F, -1.5F, -1.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 95)
						.addBox(-0.9226F, -2.5F, -1.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(-0.9226F, -2.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 95)
						.addBox(-0.9226F, -2.5F, 1.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(-0.9226F, -2.5F, 2.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 3.4226F, -0.625F, 0.0F, 0.0F, 1.5708F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-7.0F, -6.3F, 0.0F));

		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2",
				CubeListBuilder.create().texOffs(19, 61)
						.addBox(-2.51F, 1.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(27, 81)
						.addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 72)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 60)
						.addBox(-1.0F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.3491F));

		PartDefinition bone2 = RightArm2.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(56, 23)
						.addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 66)
						.addBox(-2.01F, -0.3F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(65, 82)
						.addBox(-0.9F, 0.5F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 85)
						.addBox(-0.4F, 0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(13, 65)
						.addBox(0.6F, 1.2F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 12)
						.addBox(0.6F, 1.2F, -1.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 5.5F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition LeftArm_r2 = right_hand.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(22, 26)
						.addBox(-0.5F, -1.5F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(-0.5F, -2.5F, 0.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-0.5F, -2.5F, 1.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-0.5F, -2.5F, -0.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(-0.5F, -2.5F, -1.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, 3.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1176F, 1.1319F, 0.0F, 0.0F, 0.0F, 2.9671F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(3.0913F, 5.0F, 2.1004F));

		PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(22, 46)
						.addBox(-2.4913F, 0.0F, -4.1004F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(59, 86)
						.addBox(-0.9913F, 9.0F, -0.6004F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 82)
						.addBox(-0.9913F, 1.0F, -1.1004F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(57, 76)
						.addBox(-1.4913F, 1.5F, -1.6004F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 65)
						.addBox(-0.5349F, -1.0F, -0.5985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.346F, -0.05F, -0.121F));

		PartDefinition bone4 = LeftLeg2.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 65)
						.addBox(-2.0F, -1.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 82)
						.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0087F, 10.0F, -0.1004F, 0.6503F, -0.084F, 0.1005F));

		PartDefinition bone8 = bone4.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(63, 52)
						.addBox(-1.9F, 0.001F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(37, 57)
						.addBox(-2.4F, 2.001F, -7.5F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(75, 0)
						.addBox(-1.9F, 3.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 41)
						.addBox(-1.4F, 1.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 6.0F, 0.5F, -0.3065F, 0.0832F, -0.0263F));

		PartDefinition LeftArm_r3 = bone8.addOrReplaceChild("LeftArm_r3",
				CubeListBuilder.create().texOffs(41, 76).addBox(-3.5F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1F, 2.1352F, -1.5948F, 0.2182F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-2.9807F, 5.0F, 2.1428F));

		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(84, 66)
						.addBox(-1.0087F, 9.0F, -0.6004F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 82)
						.addBox(-1.0087F, 1.0F, -1.1004F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-2.5087F, 0.0F, -4.1004F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(-1.5087F, 1.5F, -1.6004F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 54)
						.addBox(-0.4651F, -1.0F, -0.5985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.346F, 0.05F, 0.121F));

		PartDefinition right_lower_leg = RightLeg2.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(66, 11)
						.addBox(-2.0F, -1.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 85)
						.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0087F, 10.0F, -0.1004F, 0.6503F, 0.084F, -0.1005F));

		PartDefinition bone7 = right_lower_leg.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(39, 66)
						.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(55, 23)
						.addBox(-2.5F, 2.0F, -7.5F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(76, 49)
						.addBox(-2.0F, 3.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(9, 82)
						.addBox(-1.5F, 1.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.5F, -0.3065F, -0.0832F, 0.0263F));

		PartDefinition LeftArm_r4 = bone7.addOrReplaceChild("LeftArm_r4",
				CubeListBuilder.create().texOffs(30, 75).addBox(-2.0F, 0.0F, -4.0F, 3.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 2.1352F, -1.5948F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(79, 28)
						.addBox(-8.05F, -10.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 32)
						.addBox(6.05F, -10.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(35, 5)
						.addBox(-4.5F, -1.5F, -4.0F, 9.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(30, 15)
						.addBox(-3.5F, -12.0F, -5.7F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-0.5F, -11.0F, -6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-5.5F, -7.5F, -5.0F, 11.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.5F, -11.5F, -5.0F, 13.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(53, 1)
						.addBox(1.5F, -21.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(47, 82)
						.addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 36)
						.addBox(-1.5F, -27.0F, -3.5F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(71, 61)
						.addBox(-1.0F, -18.0F, -2.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 40)
						.addBox(2.0F, -30.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 46)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(4, 7)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(0, 7)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(0, 40)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(38, 23)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 16.0F, 1.0F));

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