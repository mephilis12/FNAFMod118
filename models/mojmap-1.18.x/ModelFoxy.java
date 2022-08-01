// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFoxy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "foxy"), "main");
	private final ModelPart Head;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Body;

	public ModelFoxy(ModelPart root) {
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
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.5F, -8.0F, -3.0F, 7.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(0.0F, -10.0F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.5F, -10.0F, -1.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 18)
						.addBox(-4.0F, -6.0F, -3.5F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(-5.5F, -3.0F, -3.0F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 7)
						.addBox(-2.5F, -3.0F, -6.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-1.5F, -3.0F, -8.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 46)
						.addBox(-1.5F, -1.0F, -7.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 50)
						.addBox(-1.0F, -4.0F, -8.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.8F, 0.0F));

		PartDefinition bone5 = Head.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(0.0F, -5.4312F, -4.6113F));

		PartDefinition Head_r1 = bone5
				.addOrReplaceChild("Head_r1",
						CubeListBuilder.create().texOffs(20, 16).addBox(-3.5F, -2.1F, 0.1F, 7.0F, 1.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(48, 32)
						.addBox(-2.0F, 0.502F, -7.6374F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 41)
						.addBox(-2.5F, 1.002F, -8.1374F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.7F, 0.1F));

		PartDefinition cube_r1 = Jaw.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(38, 36)
						.addBox(-2.0F, -1.25F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 28)
						.addBox(-2.5F, -0.75F, -3.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.25F, -2.4F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Jaw.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(14, 46).addBox(-2.5F, -2.75F, 2.0F, 5.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.7255F, -2.4457F, -0.3927F, 0.0F, 0.0F));

		PartDefinition RightEar = Head.addOrReplaceChild("RightEar",
				CubeListBuilder.create().texOffs(34, 36)
						.addBox(-1.6144F, -4.8199F, -4.8F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 4)
						.addBox(-1.1144F, -5.8199F, -4.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-0.6144F, -1.8199F, -4.3F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -6.0F, 4.5F, 0.0F, 0.0F, -0.6109F));

		PartDefinition RightEar2 = Head.addOrReplaceChild("RightEar2",
				CubeListBuilder.create().texOffs(34, 36)
						.addBox(-1.3856F, -4.8199F, -4.3F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 4)
						.addBox(-0.8856F, -5.8199F, -4.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-0.3856F, -1.8199F, -3.8F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -6.0F, 4.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition endo_head = Head.addOrReplaceChild("endo_head", CubeListBuilder.create().texOffs(52, 22)
				.addBox(10.2381F, -1.4048F, 0.7857F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(50, 46)
				.addBox(9.7381F, -5.4048F, 0.7857F, 7.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(50, 17)
				.addBox(11.7381F, -0.9048F, -3.2143F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
				.addBox(12.2381F, -0.4048F, 0.7857F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 54)
				.addBox(12.2381F, -0.4048F, -3.0143F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 57)
				.addBox(10.6381F, -3.7048F, -1.3143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 51)
				.addBox(10.2381F, -4.2048F, -1.8143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(37, 51)
				.addBox(13.2381F, -4.2048F, -1.8143F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 57)
				.addBox(13.8381F, -3.7048F, -1.3143F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
				.addBox(14.3381F, -3.0048F, -1.4143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
				.addBox(11.1381F, -3.2048F, -1.4143F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.2381F, -1.2952F, -1.0857F));

		PartDefinition endoi_jaw = endo_head.addOrReplaceChild("endoi_jaw", CubeListBuilder.create(),
				PartPose.offset(13.2381F, 1.8452F, 0.7857F));

		PartDefinition cube_r3 = endoi_jaw.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(28, 54)
						.addBox(-1.0F, -0.75F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 12)
						.addBox(-1.5F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(28, 46)
						.addBox(-1.5F, 2.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 56)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 26)
						.addBox(-0.9F, 6.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -2.0F, 1.0F));

		PartDefinition bone3 = LeftArm.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(28, 63)
						.addBox(-1.49F, 0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 57)
						.addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.3F, 0.0F));

		PartDefinition right_hand2 = bone3.addOrReplaceChild("right_hand2",
				CubeListBuilder.create().texOffs(0, 56)
						.addBox(-0.21F, 0.7F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 17)
						.addBox(0.11F, 0.7F, 0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 37)
						.addBox(-0.31F, 2.2F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.31F, 5.5F, 0.0F, 3.1416F, 0.0F, -3.1416F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(28, 46)
						.addBox(-1.5F, 2.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 56)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 26)
						.addBox(-1.0F, 6.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, -2.0F, 1.0F));

		PartDefinition bone2 = RightArm.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(44, 57)
						.addBox(-0.5F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 63)
						.addBox(-1.5F, 0.2F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.3F, 0.0F));

		PartDefinition right_hand = bone2.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(34, 16)
						.addBox(-3.91F, 2.1F, 1.0F, 8.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(51, 40)
						.addBox(-1.41F, 1.1F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.09F, 5.1F, -1.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 37)
						.addBox(-0.5564F, -0.5F, -2.5019F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 26)
						.addBox(0.4F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 52)
						.addBox(0.4F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.6F, 9.0F, 1.0F));

		PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 47)
						.addBox(-0.1F, 6.901F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 4)
						.addBox(-0.6F, 6.901F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 52)
						.addBox(0.4F, 1.001F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition RightLeg_r1 = bone4.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(0, 13).addBox(-1.5F, 1.0F, -4.5F, 2.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8948F, 6.902F, -1.499F, 0.0F, 0.3927F, 0.0F));

		PartDefinition RightLeg_r2 = bone4.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(0, 15).addBox(-0.3F, 1.0F, -4.5F, 2.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7205F, 6.902F, -1.5755F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone9 = bone4.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1F, 7.0F, 0.7F, 0.0F, -0.1309F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(56, 26)
						.addBox(-1.0F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 52)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 36)
						.addBox(-2.0436F, -0.5F, -2.5019F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 9.0F, 1.0F));

		PartDefinition right_lower_leg = RightLeg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(12, 52)
						.addBox(-1.0F, 1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(-1.5F, 6.901F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 4)
						.addBox(-2.0F, 6.901F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition RightLeg_r3 = right_lower_leg.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(0, 15).addBox(-0.3F, 1.0F, -4.5F, 2.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6795F, 6.902F, -1.5755F, 0.0F, -0.3927F, 0.0F));

		PartDefinition RightLeg_r4 = right_lower_leg.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(0, 13).addBox(-1.5F, 1.0F, -4.5F, 2.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4948F, 6.902F, -1.499F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone8 = right_lower_leg.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.7F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(20, 7)
						.addBox(-4.0F, -13.6F, -3.5F, 8.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-3.5F, -10.6F, -3.5F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-3.5F, -4.5F, -3.5F, 7.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 26)
						.addBox(-6.99F, -13.51F, -0.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 26)
						.addBox(4.99F, -13.51F, -0.99F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 1.0F));

		PartDefinition LeftArm_r1 = Body.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(42, 0)
						.addBox(-0.5F, -1.5F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 25)
						.addBox(11.5F, -1.5F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.99F, -13.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(36, 4).addBox(0.0F, -1.5F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -13.6F, -0.5F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(0, 37).addBox(-2.0F, -1.5F, 0.0F, 2.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -13.6F, -0.5F, 0.0F, 0.0F, 0.3927F));

		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, -12.0F, -3.5F));

		PartDefinition endo_torso = Body.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(52, 0)
						.addBox(1.5F, -19.0F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(49, 51)
						.addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 36)
						.addBox(0.5F, -16.5F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 5)
						.addBox(1.5F, -31.5F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.8F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.2F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(6.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(7.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(0, 33)
						.addBox(-3.5F, -26.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(0, 28)
						.addBox(-1.5F, -26.5F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-0.5F, -26.0F, -2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));

		PartDefinition bone11 = Body.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(4, 0).addBox(0.9952F, 10.1022F, -1.5F, 1.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -27.5F, 1.5F, 0.0F, 0.0F, 0.3927F));

		PartDefinition bone10 = Body.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(4, 0).addBox(-4.7668F, 8.9542F, -1.5F, 1.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -27.5F, 1.5F, 0.0F, 0.0F, -0.3927F));

		PartDefinition bone7 = Body.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(20, 28).addBox(1.2125F, -0.2017F, -1.5F, 6.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -17.2F, 1.5F, 0.0F, 0.0F, 0.7854F));

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