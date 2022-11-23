// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelNightmare_Chica<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nightmare_chica"), "main");
	private final ModelPart Head;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Body;

	public ModelNightmare_Chica(ModelPart root) {
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
				CubeListBuilder.create().texOffs(22, 21)
						.addBox(-4.0F, -2.2F, -4.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 52)
						.addBox(-2.5F, -2.2F, -8.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 54)
						.addBox(-3.5F, -2.2F, -7.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 48)
						.addBox(-3.5F, -4.2F, -7.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(75, 60)
						.addBox(-2.5F, -4.2F, -9.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-3.5F, -8.2F, -5.0F, 7.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(23, 25)
						.addBox(-4.5F, -5.2F, -5.0F, 9.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.8F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(42, 54)
						.addBox(-2.5F, -3.1687F, -3.2497F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(-4.0F, 0.15F, -7.1652F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(-3.0F, -1.35F, -5.1652F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 43)
						.addBox(-3.5F, -1.35F, -6.1652F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 21)
						.addBox(-2.5F, -1.35F, -7.1652F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 17)
						.addBox(-3.0F, 0.15F, -8.1652F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5068F, 1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Jaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(52, 67).addBox(-4.5F, -1.5F, -2.5F, 7.0F, 2.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(1.0F, -0.172F, -0.7519F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Jaw.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(30, 0).addBox(-5.0F, -0.3F, -3.0F, 8.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.073F, -0.4128F, 0.1309F, 0.0F, 0.0F));

		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.5F, -8.0F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.5F, -8.0F, -1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition RightTop = RightEar.addOrReplaceChild("RightTop", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition endo_head = Head.addOrReplaceChild("endo_head", CubeListBuilder.create().texOffs(13, 56)
				.addBox(11.2381F, -3.7048F, -0.4143F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
				.addBox(10.5381F, -4.9048F, -3.2143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 21)
				.addBox(10.2381F, -6.4048F, -2.7143F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 43)
				.addBox(10.2381F, -3.4048F, -2.7143F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(72, 27)
				.addBox(10.7381F, -1.4048F, -2.7143F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 73)
				.addBox(13.9381F, -4.9048F, -3.2143F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
				.addBox(14.4381F, -4.3548F, -3.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
				.addBox(11.0381F, -4.3548F, -3.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));

		PartDefinition bone = endo_head.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-0.7619F, 19.5952F, 9.2857F));

		PartDefinition bone9 = Head.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -9.2F, -2.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone9
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 56).addBox(0.1353F, -2.6734F, -0.3536F, 2.0F, 4.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r4 = bone9.addOrReplaceChild(
				"cube_r4", CubeListBuilder.create().texOffs(18, 60).addBox(-2.1633F, -2.6864F, -0.3536F, 2.0F, 4.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition bone10 = Head.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -9.2F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone10
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(52, 0).addBox(0.1353F, -2.6734F, 0.3536F, 2.0F, 4.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r6 = bone10.addOrReplaceChild(
				"cube_r6", CubeListBuilder.create().texOffs(42, 54).addBox(-2.1633F, -2.6864F, 0.3536F, 2.0F, 4.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(7.0F, -6.4F, 2.0F));

		PartDefinition LeftArm2 = LeftArm.addOrReplaceChild("LeftArm2",
				CubeListBuilder.create().texOffs(22, 49)
						.addBox(-2.51F, 1.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(67, 83)
						.addBox(-0.35F, 1.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 64)
						.addBox(-1.35F, 2.6F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(31, 60)
						.addBox(-0.8F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, -0.5236F));

		PartDefinition bone3 = LeftArm2.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(4, 85)
						.addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 82)
						.addBox(-0.8F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 63)
						.addBox(-2.01F, -0.3F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.9168F, -0.0266F, 0.0346F));

		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(-0.5F, 0.6F, -1.625F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(37, 74)
						.addBox(-1.0F, 0.5F, -2.125F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 5.6F, -0.125F, -1.1076F, 0.5393F, -1.0866F));

		PartDefinition LeftArm_r1 = bone6.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(36, 64)
						.addBox(0.05F, -0.4F, 0.25F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(70, 74)
						.addBox(0.05F, -0.4F, -0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.45F, 1.5F, 0.125F, 0.2291F, -0.3747F, -1.0472F));

		PartDefinition LeftArm_r2 = bone6.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(73, 54)
						.addBox(0.0774F, -1.5F, -1.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(63, 17)
						.addBox(0.0774F, -2.5F, -1.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(37, 49)
						.addBox(0.0774F, -2.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(69, 8)
						.addBox(0.0774F, -2.5F, 1.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(83, 52)
						.addBox(0.0774F, -2.5F, 2.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 2.4226F, -0.625F, 0.0F, 0.0F, 2.8798F));

		PartDefinition cooper = bone6.addOrReplaceChild("cooper",
				CubeListBuilder.create().texOffs(0, 97)
						.addBox(2.0F, 3.5F, -3.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(23, 120)
						.addBox(3.0F, 4.5F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition bone11 = cooper.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(31, 106)
						.addBox(-0.3F, -1.0F, -4.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(15, 96)
						.addBox(3.7F, 1.5F, -3.5F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 111)
						.addBox(0.0F, -0.5F, -4.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 122)
						.addBox(-1.0F, 1.5F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offset(5.0F, 5.0F, 2.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-7.0F, -6.3F, 1.0F));

		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2",
				CubeListBuilder.create().texOffs(50, 32)
						.addBox(-2.51F, 1.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(73, 74)
						.addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(63, 83)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 63)
						.addBox(-1.0F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0475F, -0.346F, 0.4446F));

		PartDefinition bone2 = RightArm2.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 85)
						.addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 20)
						.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 17)
						.addBox(-2.01F, -0.3F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.5785F, -0.1782F, 0.1265F));

		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(0, 79)
						.addBox(-0.9F, 0.5F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-0.4F, 0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(83, 31)
						.addBox(0.6F, 1.2F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 8)
						.addBox(0.6F, 1.2F, -1.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 5.5F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition LeftArm_r3 = right_hand.addOrReplaceChild("LeftArm_r3",
				CubeListBuilder.create().texOffs(70, 37)
						.addBox(-0.5F, -1.5F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 38)
						.addBox(-0.5F, -2.5F, 0.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(44, 35)
						.addBox(-0.5F, -2.5F, 1.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 24)
						.addBox(-0.5F, -2.5F, -0.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(55, 78)
						.addBox(-0.5F, -2.5F, -1.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, 3.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1176F, 1.1319F, 0.0F, 0.0F, 0.0F, 2.9671F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(3.0913F, 5.0F, 3.1004F));

		PartDefinition LeftLeg2 = LeftLeg.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(0, 42)
						.addBox(-2.4913F, 0.0F, -4.1004F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(83, 6)
						.addBox(-0.9913F, 9.0F, -0.6004F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(31, 78)
						.addBox(-0.9913F, 1.0F, -1.1004F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 74)
						.addBox(-1.4913F, 1.5F, -1.6004F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 48)
						.addBox(-0.5349F, -1.0F, -0.5985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3024F, -0.05F, -0.121F));

		PartDefinition bone4 = LeftLeg2.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 56)
						.addBox(-2.0F, -1.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(39, 80)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 82)
						.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0087F, 10.0F, -0.1004F, 0.6066F, -0.084F, 0.1005F));

		PartDefinition bone8 = bone4.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(57, 58)
						.addBox(4.0F, 0.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(5.5447F, 3.5F, -7.5293F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.01F)).texOffs(13, 69)
						.addBox(5.0467F, 2.0F, -7.5267F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.01F)).texOffs(79, 43)
						.addBox(4.0F, 3.001F, -3.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 42)
						.addBox(4.5F, 1.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0894F, 6.0F, 0.5424F, -0.3054F, 0.0F, 0.0F));

		PartDefinition RightLeg_r1 = bone8.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(65, 67)
						.addBox(-1.7F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.2009F, 0.5F, -6.0032F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0467F, 3.0F, -1.5267F, 0.0F, 0.3927F, 0.0F));

		PartDefinition RightLeg_r2 = bone8.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(27, 69)
						.addBox(-0.3F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(17, 18)
						.addBox(0.1971F, 0.5F, -6.0017F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0467F, 3.0F, -1.5267F, 0.0F, -0.3927F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-2.9807F, 5.0F, 3.1428F));

		PartDefinition RightLeg2 = RightLeg.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(82, 72)
						.addBox(-1.0087F, 9.0F, -0.6004F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 76)
						.addBox(-1.0087F, 1.0F, -1.1004F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 35)
						.addBox(-2.5087F, 0.0F, -4.1004F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(74, 8)
						.addBox(-1.5087F, 1.5F, -1.6004F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-0.4651F, -1.0F, -0.5985F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3024F, 0.05F, 0.121F));

		PartDefinition right_lower_leg = RightLeg2.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(56, 6)
						.addBox(-2.0F, -1.0F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(55, 81)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 82)
						.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0087F, 10.0F, -0.1004F, 0.6066F, 0.084F, -0.1005F));

		PartDefinition bone7 = right_lower_leg.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(18, 60)
						.addBox(-2.0F, 0.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(-0.4512F, 3.5F, -7.5293F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.01F)).texOffs(47, 71)
						.addBox(-0.9533F, 2.0F, -7.5267F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.01F)).texOffs(80, 37)
						.addBox(-2.0F, 3.001F, -3.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 76)
						.addBox(-1.5F, 1.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition RightLeg_r3 = bone7.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(0, 72)
						.addBox(-1.7F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(29, 0)
						.addBox(-1.1971F, 0.5F, -6.0017F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0467F, 3.0F, -1.5267F, 0.0F, 0.3927F, 0.0F));

		PartDefinition RightLeg_r4 = bone7.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(71, 1)
						.addBox(-0.3F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(0.2009F, 0.5F, -6.0032F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0467F, 3.0F, -1.5267F, 0.0F, -0.3927F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(56, 71)
						.addBox(-8.05F, -10.8571F, 0.9857F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 69)
						.addBox(6.05F, -10.8571F, 0.9857F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(31, 11)
						.addBox(-4.5F, -1.7571F, -2.0143F, 9.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.5F, -11.7571F, -3.0143F, 11.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.2571F, 1.0143F, 0.1745F, 0.0F, 0.0F));

		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(80, 0)
						.addBox(1.5F, -21.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(47, 78)
						.addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-1.5F, -27.0F, -3.5F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(65, 32)
						.addBox(-1.0F, -18.0F, -2.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(79, 82)
						.addBox(2.0F, -30.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(0, 1)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(0, 0)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(28, 35)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).texOffs(38, 8)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 15.7429F, 2.9857F));

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