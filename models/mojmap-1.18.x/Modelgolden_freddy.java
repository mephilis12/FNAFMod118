// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgolden_freddy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "golden_freddy"), "main");
	private final ModelPart Body;

	public Modelgolden_freddy(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(60, 18)
						.addBox(-2.4858F, -13.5F, -5.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)).texOffs(84, 0)
						.addBox(-4.0F, -14.0F, -4.5F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(83, 37)
						.addBox(-4.5F, -10.0F, -4.5F, 9.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-4.5F, -3.0F, -3.5F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-6.99F, -13.51F, -0.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(4.99F, -13.51F, -0.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 3.0F));

		PartDefinition LeftArm_r1 = Body.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(58, 4)
						.addBox(-0.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 56)
						.addBox(11.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.99F, -13.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(83, 52)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(87, 18)
						.addBox(-4.5F, -3.0F, -4.0F, 9.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 34)
						.addBox(-3.0F, -9.0F, -3.5F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 49)
						.addBox(-2.0F, -12.0F, -2.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 94)
						.addBox(-3.0F, -3.0F, -6.1F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.15F)).texOffs(52, 41)
						.addBox(-1.0F, -3.5F, -6.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.8F, -3.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(46, 4).addBox(-4.0F, -1.4F, 0.8F, 8.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.4312F, -5.6113F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(86, 27)
						.addBox(-3.5F, -0.5F, -5.6F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 2)
						.addBox(-2.5F, -1.5F, -4.6F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.7F, 0.1F, 0.6981F, 0.0F, 0.0F));

		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(64, 52)
						.addBox(-1.1464F, -4.2678F, -3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.1464F, -1.2678F, -2.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -6.0F, 0.0F, 0.0F, 0.0F, 1.1781F));

		PartDefinition RightEar = Head.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(64, 52)
						.addBox(-4.682F, -1.4393F, -4.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.682F, 1.5607F, -3.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -10.0F, 1.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition endo_head = Head.addOrReplaceChild("endo_head", CubeListBuilder.create().texOffs(65, 65)
				.addBox(10.2381F, -3.7048F, -2.2143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 46)
				.addBox(9.8381F, -4.2048F, -2.7143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 46)
				.addBox(13.6381F, -4.2048F, -2.7143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(65, 65)
				.addBox(14.2381F, -3.7048F, -2.2143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 18)
				.addBox(14.5381F, -3.2048F, -2.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 18)
				.addBox(10.9381F, -3.2048F, -2.3143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));

		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 49)
						.addBox(-1.85F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 66)
						.addBox(-0.35F, 1.6F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-0.8F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -13.0F, 0.0F));

		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(44, 56)
						.addBox(-1.49F, 0.2F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 66)
						.addBox(-0.3F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.2618F, 0.0F, -0.5672F));

		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2",
				CubeListBuilder.create().texOffs(61, 32)
						.addBox(-0.9F, 0.2F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 21)
						.addBox(1.3F, 0.4F, 0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(23, 21)
						.addBox(-0.39F, 0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 19)
						.addBox(0.11F, 0.7F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 34)
						.addBox(-0.59F, 2.2F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, -1.1143F, 0.3142F, -0.7661F));

		PartDefinition LeftArm_r2 = right_hand2.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(42, 38)
						.addBox(-0.7F, -0.8F, 0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(52, 5)
						.addBox(-0.7F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(42, 38)
						.addBox(-0.7F, -0.8F, -1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 3.2F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition RightArm = Body.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(32, 49)
						.addBox(-2.01F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 66)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-1.0F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -13.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(29, 66)
						.addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 56)
						.addBox(-1.49F, 0.2F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -0.9255F, 0.451F, 0.1288F));

		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(42, 38)
						.addBox(-0.71F, 2.4F, -0.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(28, 21)
						.addBox(1.29F, 0.4F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(61, 32)
						.addBox(-0.91F, 0.2F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 21)
						.addBox(-0.41F, 0.7F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 63)
						.addBox(-0.61F, 2.2F, -0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(31, 41)
						.addBox(0.09F, 0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-0.41F, 0.7F, -0.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 55)
						.addBox(0.69F, 1.8F, -2.6F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.1F)).texOffs(54, 56)
						.addBox(0.09F, 1.2F, -4.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 52)
						.addBox(-0.41F, 0.7F, -3.6F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 5)
						.addBox(-0.71F, 2.4F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(42, 38)
						.addBox(-0.71F, 2.4F, 1.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.09F, 5.5F, 1.0F, -1.2654F, 1.3526F, -1.5708F));

		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1176F, 1.1319F, 0.0F, 0.0F, 0.0F, 2.9671F));

		PartDefinition bone6 = right_hand.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(14.2176F, 4.6319F, -1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(18, 41)
						.addBox(-1.9564F, 1.0F, -2.5019F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-1.0F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 78)
						.addBox(-1.5F, 5.5F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, -2.0F, -5.0F, -2.5744F, 0.0F, 0.0F));

		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 48)
						.addBox(-2.0F, 0.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 13)
						.addBox(-1.5F, 6.901F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.001F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 2.3562F, 0.0F, 0.0F));

		PartDefinition bone9 = bone4.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(72, 48)
						.addBox(-0.9F, -1.0F, -7.2F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 34)
						.addBox(-1.9F, -1.0F, -3.2F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 7.0F, 0.7F, 0.1797F, -0.2129F, -0.0479F));

		PartDefinition RightLeg_r1 = bone9.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(74, 5).addBox(-0.3F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.0F, -2.2F, 0.0F, -0.3927F, 0.0F));

		PartDefinition RightLeg_r2 = bone9
				.addOrReplaceChild("RightLeg_r2",
						CubeListBuilder.create().texOffs(26, 74).addBox(-1.5F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.1F, 0.0F, -2.2F, 0.0F, 0.3927F, 0.0F));

		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(44, 49)
						.addBox(-1.0F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-2.0436F, 1.0F, -2.5019F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 78)
						.addBox(-1.5F, 5.5F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -2.0F, -5.0F, -2.5744F, 0.0F, 0.0F));

		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(48, 17)
						.addBox(-2.0F, 0.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 13)
						.addBox(-1.5F, 6.901F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 2.3126F, 0.0F, 0.0F));

		PartDefinition bone8 = right_lower_leg.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(48, 34)
						.addBox(-2.0F, -1.0F, -3.2F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(72, 48)
						.addBox(-1.0F, -1.0F, -7.2F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.7F, 0.22F, 0.1278F, 0.0285F));

		PartDefinition RightLeg_r3 = bone8
				.addOrReplaceChild("RightLeg_r3",
						CubeListBuilder.create().texOffs(26, 74).addBox(-1.7F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.0F, 0.3927F, 0.0F));

		PartDefinition RightLeg_r4 = bone8.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(74, 5).addBox(-0.3F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F,
				-1.0F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, -12.0F, -3.5F));

		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(0, 63)
						.addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(78, 64)
						.addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(49, 90)
						.addBox(0.5F, -17.0F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 2)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 7)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(26, 7)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(26, 2)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));

		PartDefinition bone7 = Body.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.0F, -17.2F, 1.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone10 = Body.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, -27.5F, 1.5F, 0.0F, 0.0F, -0.3927F));

		PartDefinition bone11 = Body.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, -27.5F, 1.5F, 0.0F, 0.0F, 0.3927F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}