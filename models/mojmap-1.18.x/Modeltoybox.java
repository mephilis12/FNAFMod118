// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltoybox<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "toybox"), "main");
	private final ModelPart bone2;

	public Modeltoybox(ModelPart root) {
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(4.0F, 23.0F, -3.0F));

		PartDefinition Box = bone2.addOrReplaceChild("Box", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F,
				-12.0F, -1.0F, 20.0F, 13.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition HookArm = bone2.addOrReplaceChild("HookArm",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.01F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(85, 38)
						.addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 67)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 91)
						.addBox(-1.0F, 7.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -7.0F, -3.0F, -2.7085F, 0.0552F, -0.1188F));

		PartDefinition bone11 = HookArm.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(61, 91)
						.addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 31)
						.addBox(-1.0F, 1.2F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(75, 77)
						.addBox(-1.49F, 0.2F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, 2.3145F, 0.0643F, 0.059F));

		PartDefinition right_hand3 = bone11.addOrReplaceChild("right_hand3",
				CubeListBuilder.create().texOffs(24, 76)
						.addBox(-3.91F, 1.7F, 0.0F, 8.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(89, 81)
						.addBox(-1.41F, 0.7F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 5.5F, 0.0F, 2.9234F, -0.1309F, 3.1416F));

		PartDefinition bone10 = right_hand3.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.1176F, 1.1319F, -1.0F, 0.0F, 0.0F, 2.9671F));

		PartDefinition bone6 = right_hand3.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(14.2176F, 4.6319F, -2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition MangleHead = bone2.addOrReplaceChild("MangleHead",
				CubeListBuilder.create().texOffs(70, 25)
						.addBox(-4.0F, -5.5833F, 1.3167F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 13)
						.addBox(-6.0F, -0.5833F, 1.3167F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 76)
						.addBox(-3.0F, -0.5833F, -1.6833F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 91)
						.addBox(-1.0F, -1.5833F, -4.0833F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(89, 17)
						.addBox(-2.0F, -0.5833F, -3.6833F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 17)
						.addBox(-2.0F, 1.4167F, -3.1833F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -21.2167F, -1.8167F, -0.253F, -0.9975F, -0.4816F));

		PartDefinition endo_head = MangleHead.addOrReplaceChild("endo_head", CubeListBuilder.create(),
				PartPose.offset(-14.7381F, -4.4786F, 5.231F));

		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(),
				PartPose.offset(13.2381F, 1.8452F, 0.7857F));

		PartDefinition LeftEar = endo_head.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(51, 86).addBox(-2.0F, -8.0F, -0.5F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.7381F, 0.6952F, -0.4143F, 0.0F, 0.0F, 0.7854F));

		PartDefinition RightEar = endo_head.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(0, 86).addBox(-2.5F, -8.0F, -0.5F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.7381F, 0.6952F, -0.4143F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bone = bone2.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(17, 48)
						.addBox(-1.0F, -0.5F, -0.7823F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(42, 74)
						.addBox(-3.0F, -0.5F, -7.7823F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)).texOffs(36, 82)
						.addBox(-2.0F, -0.5F, 14.2177F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -17.5F, 7.7823F, 1.7272F, 0.2635F, -2.5972F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(23, 66).addBox(-13.0F, -1.0F, 0.0F, 4.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6361F, 0.5F, -17.6936F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(67, 66).addBox(-7.0F, -1.0F, 0.0F, 4.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.1459F, 0.5F, -11.5706F, 0.0F, -0.3927F, 0.0F));

		PartDefinition group = bone2.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(0, 31).addBox(-16.0F, -16.0F, 15.5F, 16.0F, 32.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -14.0F, -25.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition group5 = group.addOrReplaceChild("group5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.0F, -4.3806F, 14.6173F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r3 = group5.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8478F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = group5
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(12, 12).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r5 = group5.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(32, 37).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.1522F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r6 = group5.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(36, 37).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3045F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = group5.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(58, 37).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.6955F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition group4 = group.addOrReplaceChild("group4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-12.0F, -4.3806F, 14.6173F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r8 = group4.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 2).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.1522F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r9 = group4.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3045F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition BBHead = bone2.addOrReplaceChild("BBHead",
				CubeListBuilder.create().texOffs(40, 64)
						.addBox(-2.5F, 0.9F, -1.52F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(66, 38)
						.addBox(-4.0F, 0.4F, -2.12F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 82)
						.addBox(-3.5F, -4.6F, -2.62F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 60)
						.addBox(-4.5F, -4.6F, -0.62F, 9.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(64, 41)
						.addBox(-3.5F, -2.6F, -1.62F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -15.6F, -6.38F, 0.3843F, -0.4638F, -1.0472F));

		PartDefinition LeftArm2 = bone2.addOrReplaceChild("LeftArm2",
				CubeListBuilder.create().texOffs(62, 0)
						.addBox(-0.5F, 1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 66)
						.addBox(-1.5F, 1.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 52)
						.addBox(-0.95F, 6.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3F, -15.5F, 2.0F, 0.6461F, 0.473F, -2.9738F));

		PartDefinition bone5 = LeftArm2.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(39, 91)
						.addBox(-0.45F, 1.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 85)
						.addBox(-1.5F, 1.1F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 76)
						.addBox(-0.95F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.9F, 0.0F, -0.3054F, 0.0F, 0.829F));

		PartDefinition ToyFreddyHead = bone2.addOrReplaceChild("ToyFreddyHead",
				CubeListBuilder.create().texOffs(0, 64)
						.addBox(-5.0F, 2.7F, -3.52F, 10.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 36)
						.addBox(-3.0F, 2.2F, 1.48F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(69, 55)
						.addBox(-4.5F, -2.3F, -3.52F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 75)
						.addBox(-3.0F, -3.3F, -3.22F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-2.0F, -7.3F, -2.22F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -19.2F, 6.22F, -0.2182F, -0.3054F, 0.0F));

		PartDefinition Jaw2 = ToyFreddyHead.addOrReplaceChild("Jaw2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 5.2F, 1.38F, 0.2182F, 0.0F, 0.0F));

		PartDefinition LeftEar5 = ToyFreddyHead.addOrReplaceChild("LeftEar5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.5F, -1.1F, 3.28F, 0.0F, 0.0F, 0.7854F));

		PartDefinition RightEar5 = ToyFreddyHead.addOrReplaceChild("RightEar5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.5F, -5.1F, 4.28F, 0.0F, 0.0F, -0.7854F));

		PartDefinition snout = ToyFreddyHead.addOrReplaceChild("snout",
				CubeListBuilder.create().texOffs(84, 4)
						.addBox(11.5F, -18.0F, -8.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 91)
						.addBox(12.0F, -18.5F, -7.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(81, 90)
						.addBox(12.0F, -20.0F, -7.9F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 10)
						.addBox(13.0F, -22.0F, -8.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 0)
						.addBox(11.0F, -21.5F, -8.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.0F, 24.2F, 2.48F));

		PartDefinition ToyChicaHead = bone2.addOrReplaceChild("ToyChicaHead",
				CubeListBuilder.create().texOffs(32, 31).addBox(-4.2311F, 0.375F, -4.0533F, 9.0F, 9.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7311F, -20.375F, 3.2533F, 0.6776F, -1.4567F, -0.7246F));

		PartDefinition cube_r10 = ToyChicaHead.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(86, 13).addBox(-6.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2689F, 0.375F, -0.0533F, 0.0F, 1.2654F, 0.0F));

		PartDefinition cube_r11 = ToyChicaHead.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(83, 86).addBox(-6.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2689F, 0.375F, -0.0533F, 0.0F, -2.618F, 0.0F));

		PartDefinition cube_r12 = ToyChicaHead.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(39, 87).addBox(-6.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2689F, 0.375F, -0.0533F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone35 = ToyChicaHead.addOrReplaceChild("bone35", CubeListBuilder.create(),
				PartPose.offset(1.2689F, 1.6438F, -4.8646F));

		PartDefinition Head_r1 = bone35
				.addOrReplaceChild("Head_r1",
						CubeListBuilder.create().texOffs(0, 63).addBox(-5.0F, -0.4F, 0.6F, 8.0F, 1.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition beak2 = ToyChicaHead.addOrReplaceChild("beak2",
				CubeListBuilder.create().texOffs(85, 76)
						.addBox(12.5F, -21.5F, -9.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 60)
						.addBox(11.5F, -20.5F, -8.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.7311F, 26.875F, 1.9467F));

		PartDefinition ToyBonnieArm = bone2.addOrReplaceChild("ToyBonnieArm",
				CubeListBuilder.create().texOffs(15, 83)
						.addBox(-1.5F, 1.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-0.5F, 0.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 48)
						.addBox(-1.0F, 6.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -11.0F, 1.0F, 0.1805F, 0.4201F, 2.7762F));

		PartDefinition bone24 = ToyBonnieArm.addOrReplaceChild("bone24",
				CubeListBuilder.create().texOffs(66, 41)
						.addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 83)
						.addBox(-1.5F, 0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.3F, 0.0F));

		PartDefinition right_hand = bone24.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(73, 86)
				.addBox(-0.91F, 0.7F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.09F, 4.5F, 0.0F));

		PartDefinition LeftArm_r1 = right_hand
				.addOrReplaceChild("LeftArm_r1",
						CubeListBuilder.create().texOffs(12, 0).addBox(3.0F, -1.0F, -1.5F, 2.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.09F, 2.7F, 0.0F, 0.0F, 2.3126F, 0.0F));

		PartDefinition LeftArm_r2 = right_hand.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(58, 31).addBox(-0.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-0.41F, 3.7F, 0.0F, 0.0F, 0.0F, 1.4835F));

		PartDefinition bone23 = right_hand.addOrReplaceChild("bone23", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.6176F, 1.1319F, -1.0F, 0.0F, 0.0F, 2.9671F));

		PartDefinition bone22 = right_hand.addOrReplaceChild("bone22", CubeListBuilder.create(),
				PartPose.offsetAndRotation(14.7176F, 4.6319F, -2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition ToyBonnieHead = bone2.addOrReplaceChild("ToyBonnieHead",
				CubeListBuilder.create().texOffs(36, 48).addBox(-5.0F, -2.2F, -4.8F, 10.0F, 4.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -10.8F, -2.0F, -0.3482F, -0.4147F, 0.3449F));

		PartDefinition Jaw = ToyBonnieHead.addOrReplaceChild("Jaw", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.3F, 0.1F, 0.2182F, 0.0F, 0.0F));

		PartDefinition LeftEar3 = ToyBonnieHead.addOrReplaceChild("LeftEar3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.5F, -6.0F, 2.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition RightEar3 = ToyBonnieHead.addOrReplaceChild("RightEar3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.5F, -10.0F, 3.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition endo_head3 = ToyBonnieHead.addOrReplaceChild("endo_head3", CubeListBuilder.create()
				.texOffs(58, 0).addBox(8.7381F, -5.9048F, -3.7143F, 9.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));

		PartDefinition bone25 = endo_head3.addOrReplaceChild("bone25", CubeListBuilder.create(),
				PartPose.offset(14.2381F, -4.6359F, -4.5256F));

		PartDefinition Head_r2 = bone25
				.addOrReplaceChild("Head_r2",
						CubeListBuilder.create().texOffs(58, 17).addBox(-5.0F, -0.4F, 0.6F, 8.0F, 1.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition beak = endo_head3.addOrReplaceChild("beak",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(13.5F, -22.5F, -8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 82)
						.addBox(11.0F, -21.5F, -8.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.7619F, 20.5952F, 2.2857F));

		PartDefinition endoi_jaw3 = endo_head3.addOrReplaceChild("endoi_jaw3", CubeListBuilder.create(),
				PartPose.offset(13.2381F, 1.8452F, 0.7857F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}