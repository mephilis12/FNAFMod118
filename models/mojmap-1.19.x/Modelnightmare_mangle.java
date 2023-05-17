// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelnightmare_mangle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nightmare_mangle"), "main");
	private final ModelPart leftarmrotate;
	private final ModelPart rightarmrotate;
	private final ModelPart Head;
	private final ModelPart leftlegrotate;
	private final ModelPart rightlegrotate;
	private final ModelPart backlegrotate;
	private final ModelPart Pelvis;
	private final ModelPart Body;

	public Modelnightmare_mangle(ModelPart root) {
		this.leftarmrotate = root.getChild("leftarmrotate");
		this.rightarmrotate = root.getChild("rightarmrotate");
		this.Head = root.getChild("Head");
		this.leftlegrotate = root.getChild("leftlegrotate");
		this.rightlegrotate = root.getChild("rightlegrotate");
		this.backlegrotate = root.getChild("backlegrotate");
		this.Pelvis = root.getChild("Pelvis");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leftarmrotate = partdefinition.addOrReplaceChild("leftarmrotate", CubeListBuilder.create(),
				PartPose.offset(10.5F, 5.5F, 5.0F));

		PartDefinition LeftArm = leftarmrotate.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(38, 74)
						.addBox(0.05F, -0.1F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-0.95F, 0.9F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 21)
						.addBox(-0.4F, 5.8F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 66)
						.addBox(-0.95F, -0.1F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2798F, -1.4502F, -1.0635F));

		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(74, 21)
						.addBox(-0.9F, 5.8F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-0.4F, -0.2F, -1.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.4F, 0.8F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6F, 6.8F, 1.0F, 0.3054F, 0.0F, 0.9163F));

		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.29F, 6.1F, -0.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition LeftArm2 = bone3.addOrReplaceChild("LeftArm2",
				CubeListBuilder.create().texOffs(38, 74)
						.addBox(-0.5F, 1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-1.5F, 2.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 21)
						.addBox(-0.95F, 6.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 66)
						.addBox(-1.5F, 1.0F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7F, -1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition bone6 = LeftArm2.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(74, 21)
						.addBox(-0.55F, 6.1F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-0.05F, 0.1F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.05F, 1.1F, -1.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.35F, 7.7F, 0.5F, 0.0F, 0.0F, 0.8727F));

		PartDefinition right_hand4 = bone6.addOrReplaceChild("right_hand4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.44F, -4.5891F, -11.2459F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightarmrotate = partdefinition.addOrReplaceChild("rightarmrotate", CubeListBuilder.create(),
				PartPose.offset(-5.0F, -0.3F, 6.0F));

		PartDefinition RightArm = rightarmrotate.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(43, 74)
						.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 70)
						.addBox(-1.5F, 0.5F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 27)
						.addBox(-1.0F, 5.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 66)
						.addBox(-1.5F, -0.5F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(30, 58)
						.addBox(-0.5F, 1.1F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, 2.1F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 27)
						.addBox(-1.0F, 7.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.4F, 0.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 8.1F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition bone5 = right_hand.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(1.0276F, -0.5681F, 0.0F));

		PartDefinition RightArm2 = right_hand.addOrReplaceChild("RightArm2",
				CubeListBuilder.create().texOffs(43, 74)
						.addBox(-0.5F, 1.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 70)
						.addBox(-1.5F, 2.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 27)
						.addBox(-1.0F, 7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 66)
						.addBox(-1.5F, 1.0F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition bone9 = RightArm2.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.5F, 2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 58)
						.addBox(-0.5F, 1.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 27)
						.addBox(-1.0F, 7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition right_hand3 = bone9.addOrReplaceChild("right_hand3", CubeListBuilder.create(),
				PartPose.offset(-0.59F, -8.7F, 0.5F));

		PartDefinition bone10 = right_hand3.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offset(1.1176F, 1.1319F, 0.0F));

		PartDefinition bone11 = RightArm.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(26, 21)
						.addBox(-1.0F, 1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(65, 36)
						.addBox(-0.5F, 1.1F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.5F, 0.0F, -1.5653F, 1.08F, 0.5449F));

		PartDefinition LeftArm_r1 = bone11.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(61, 59)
						.addBox(-0.5F, -2.5F, 1.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(74, 36)
						.addBox(-0.5F, -2.5F, 0.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(61, 59)
						.addBox(-0.5F, -2.5F, -0.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(74, 36)
						.addBox(-0.5F, -2.5F, -1.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 3.5F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition LeftArm_r2 = bone11.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(50, 59).addBox(-0.9226F, -1.5F, -1.5F, 3.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 3.9226F, -0.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition bone12 = bone11.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(15, 50)
						.addBox(0.5F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(0.5F, -0.5F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.1F, 0.5F, 0.0F, -1.1345F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(24, 29)
						.addBox(-2.0F, -4.2F, -13.0F, 4.0F, 3.0F, 9.0F, new CubeDeformation(-0.01F)).texOffs(0, 50)
						.addBox(-2.5F, -4.2F, -9.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 15)
						.addBox(-1.0F, -5.2F, -13.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-3.5F, -9.2F, -5.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.5F, -4.2F, -5.0F, 13.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(19, 54)
						.addBox(-4.5F, -5.2F, -5.0F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.8F, 1.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(28, 16)
						.addBox(-2.5F, 0.15F, -13.1652F, 5.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-2.0F, -1.25F, -12.6652F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5068F, 1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Jaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(49, 15)
						.addBox(-5.0F, -1.7F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(-0.01F)).texOffs(41, 0)
						.addBox(-5.0F, -0.3F, -3.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -0.5686F, -1.0441F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Jaw.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(47, 49).addBox(-2.5F, -4.1687F, -4.2497F, 5.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5037F, 0.7975F, 0.3927F, 0.0F, 0.0F));

		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar",
				CubeListBuilder.create().texOffs(75, 63)
						.addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).texOffs(68, 48)
						.addBox(-2.0F, -8.75F, -0.5F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(50, 66)
						.addBox(-2.0F, -8.75F, -1.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -6.7F, 0.2F, 0.3927F, 0.0F, 0.5672F));

		PartDefinition RightEar = Head.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(39, 66)
						.addBox(-2.0F, -8.75F, 0.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 75)
						.addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).texOffs(18, 68)
						.addBox(-2.0F, -8.75F, 0.5F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -6.7F, -0.8F, 0.3927F, 0.0F, -0.5672F));

		PartDefinition RightTop = RightEar.addOrReplaceChild("RightTop", CubeListBuilder.create(),
				PartPose.offset(0.0F, -4.8F, 0.5F));

		PartDefinition endo_head = Head.addOrReplaceChild("endo_head", CubeListBuilder.create().texOffs(5, 10)
				.addBox(14.4381F, -4.3548F, 12.6857F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 75)
				.addBox(13.9381F, -4.9048F, 12.7857F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 9)
				.addBox(10.7381F, -1.4048F, 13.2857F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 36)
				.addBox(10.2381F, -3.4048F, 13.2857F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(27, 42)
				.addBox(10.2381F, -6.4048F, 13.2857F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -17.0857F));

		PartDefinition endo_head3 = endo_head.addOrReplaceChild("endo_head3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 10.0F, 0.0F));

		PartDefinition leftlegrotate = partdefinition.addOrReplaceChild("leftlegrotate", CubeListBuilder.create(),
				PartPose.offset(3.0F, 10.0F, 1.0F));

		PartDefinition LeftLeg = leftlegrotate.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(71, 42)
						.addBox(-0.9F, 10.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-0.4436F, 0.0F, -0.4981F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-0.9F, 2.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 58)
						.addBox(-1.4F, 2.5F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9705F, -0.484F, -0.3084F));

		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(61, 70)
						.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 11.0F, 0.0F, 1.1739F, -0.084F, 0.1005F));

		PartDefinition bone8 = bone4.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(59, 23)
						.addBox(-1.9F, 2.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 63)
						.addBox(-1.4F, 0.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 7.0F, 0.5F, -0.041F, 0.0149F, 0.2169F));

		PartDefinition rightlegrotate = partdefinition.addOrReplaceChild("rightlegrotate", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 10.0F, 1.0F));

		PartDefinition RightLeg = rightlegrotate.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(37, 56)
						.addBox(-1.4894F, 2.5F, -1.4576F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(71, 14)
						.addBox(-0.9894F, 10.0F, -0.4576F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-0.9894F, 2.0F, -0.9576F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(63, 48)
						.addBox(-0.4458F, 0.0F, -0.4557F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6906F, 0.4454F, 0.7116F));

		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(31, 15)
						.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0106F, 11.0F, 0.0424F, 0.4653F, 0.3013F, -0.3795F));

		PartDefinition bone7 = right_lower_leg.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(0, 58)
						.addBox(-2.0F, 2.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(63, 29)
						.addBox(-1.5F, 0.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.5F, 0.5187F, 0.0594F, -0.1642F));

		PartDefinition backlegrotate = partdefinition.addOrReplaceChild("backlegrotate", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 10.0F, 1.0F));

		PartDefinition RightLeg2 = backlegrotate.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(0, 64)
						.addBox(-0.9894F, 2.0F, -0.9576F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(71, 14)
						.addBox(-0.9894F, 10.0F, -0.4576F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(63, 48)
						.addBox(-0.4458F, 0.0F, -0.4557F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 56)
						.addBox(-1.4894F, 2.5F, -1.4576F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9268F, 0.147F, -3.0471F));

		PartDefinition right_lower_leg2 = RightLeg2.addOrReplaceChild("right_lower_leg2",
				CubeListBuilder.create().texOffs(31, 15)
						.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-1.0F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0106F, 11.0F, 0.0424F, 1.3048F, 0.084F, -0.1005F));

		PartDefinition bone14 = right_lower_leg2.addOrReplaceChild("bone14",
				CubeListBuilder.create().texOffs(0, 58)
						.addBox(-2.0F, 2.001F, -5.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(63, 29)
						.addBox(-1.5F, 0.001F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.5F, -0.076F, 0.2346F, 0.205F));

		PartDefinition Pelvis = partdefinition.addOrReplaceChild("Pelvis", CubeListBuilder.create().texOffs(42, 29)
				.addBox(-4.0F, -1.5F, -1.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.5F, 1.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(23, 10)
						.addBox(-8.55F, -9.6F, -1.0F, 17.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-5.5F, -10.0F, -2.5F, 11.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(9, 66)
						.addBox(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 21)
						.addBox(-1.0F, -11.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.5594F, 0.0447F, 0.3463F));

		PartDefinition cube_r3 = endo_torso.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(18, 42).addBox(-4.5F, -2.5F, 0.0F, 7.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.5F, -3.5F, 0.0F, 0.0F, -0.4363F));

		PartDefinition LeftArm4 = endo_torso.addOrReplaceChild("LeftArm4",
				CubeListBuilder.create().texOffs(38, 74)
						.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-1.5F, 1.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 21)
						.addBox(-0.95F, 5.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 66)
						.addBox(-1.5F, 0.0F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, 0.0F, -2.2253F));

		PartDefinition bone13 = LeftArm4.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(53, 74)
						.addBox(-0.5F, 1.0714F, -0.6532F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 0)
						.addBox(-1.0F, 2.0714F, -1.1532F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.05F, 6.9F, 0.0F, -0.7418F, 0.0F, -0.3927F));

		PartDefinition endo_head2 = bone13.addOrReplaceChild("endo_head2", CubeListBuilder.create().texOffs(27, 42)
				.addBox(-3.5667F, -3.875F, -1.5333F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 36)
				.addBox(-3.5667F, -0.875F, -1.5333F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(62, 9)
				.addBox(-3.0667F, 1.125F, -1.5333F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 75)
				.addBox(-3.2667F, -2.375F, -2.0333F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 10)
				.addBox(-2.7667F, -1.825F, -2.1333F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5167F, 7.475F, -2.2667F, 0.0F, 0.0F, 2.3126F));

		PartDefinition Jaw2 = endo_head2.addOrReplaceChild("Jaw2",
				CubeListBuilder.create().texOffs(47, 49).addBox(-2.5F, -2.6319F, -3.8914F, 5.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5667F, 2.625F, 2.9667F, 0.4363F, 0.0F, 0.0F));

		PartDefinition right_hand5 = bone13.addOrReplaceChild("right_hand5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(6.26F, 8.5109F, -11.7459F, 0.0F, 3.1416F, 0.0F));

		PartDefinition neck = endo_torso.addOrReplaceChild("neck",
				CubeListBuilder.create().texOffs(48, 74)
						.addBox(-0.5F, -7.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 56)
						.addBox(-1.0F, -6.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 21)
						.addBox(-1.0F, -9.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.6146F, 0.1937F, -0.5474F));

		PartDefinition LeftArm3 = neck.addOrReplaceChild("LeftArm3",
				CubeListBuilder.create().texOffs(38, 74)
						.addBox(-0.55F, -6.9F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-1.55F, -5.9F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 66)
						.addBox(-1.55F, -6.9F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leftarmrotate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarmrotate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftlegrotate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightlegrotate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backlegrotate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Pelvis.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rightlegrotate.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.leftlegrotate.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarmrotate.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rightarmrotate.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.backlegrotate.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}