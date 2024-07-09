// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfredbearstand<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fredbearstand"), "main");
	private final ModelPart MainCharacter;
	private final ModelPart Torso;
	private final ModelPart Head;
	private final ModelPart endo_head;
	private final ModelPart Jaw;
	private final ModelPart endo_torso2;
	private final ModelPart Bulb;
	private final ModelPart cube;
	private final ModelPart Pelvis;
	private final ModelPart Body;
	private final ModelPart Head2;
	private final ModelPart Jaw2;

	public Modelfredbearstand(ModelPart root) {
		this.MainCharacter = root.getChild("MainCharacter");
		this.Torso = root.getChild("Torso");
		this.Head = root.getChild("Head");
		this.endo_head = root.getChild("endo_head");
		this.Jaw = root.getChild("Jaw");
		this.endo_torso2 = root.getChild("endo_torso2");
		this.Bulb = root.getChild("Bulb");
		this.cube = root.getChild("cube");
		this.Pelvis = root.getChild("Pelvis");
		this.Body = root.getChild("Body");
		this.Head2 = root.getChild("Head2");
		this.Jaw2 = root.getChild("Jaw2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition MainCharacter = partdefinition.addOrReplaceChild("MainCharacter", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 1.0F));

		PartDefinition Torso = MainCharacter.addOrReplaceChild("Torso", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, -1.0F));

		PartDefinition Head = Torso.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -12.8F, 1.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition endo_head = Head.addOrReplaceChild("endo_head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0909F, -2.0273F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -0.7F, 0.1F, 0.2569F, 0.0594F, -0.1642F));

		PartDefinition endo_torso2 = Torso.addOrReplaceChild("endo_torso2",
				CubeListBuilder.create().texOffs(24, 14)
						.addBox(2.0F, -29.0F, -1.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(50, 25)
						.addBox(2.5305F, -25.4621F, -1.0F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(50, 21)
						.addBox(-3.2195F, -9.2121F, -1.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(49, 37)
						.addBox(0.0F, -34.5F, -1.5F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(50, 21)
						.mirror().addBox(3.2805F, -9.2121F, -1.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(50, 25).mirror()
						.addBox(-2.7195F, -25.4621F, -1.0F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(30, 0).addBox(-3.0F, -26.0F, -2.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 48).addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 48).addBox(2.0F, -17.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 16.0F, 2.0F));

		PartDefinition endo_torso_r1 = endo_torso2.addOrReplaceChild("endo_torso_r1",
				CubeListBuilder.create().texOffs(16, 44).addBox(-6.5F, -3.0F, 0.0F, 7.0F, 7.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5305F, -14.2121F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition endo_torso_r2 = endo_torso2.addOrReplaceChild("endo_torso_r2",
				CubeListBuilder.create().texOffs(50, 21).addBox(-6.25F, -1.5F, 0.0F, 6.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0305F, -7.7121F, -1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition endo_torso_r3 = endo_torso2.addOrReplaceChild("endo_torso_r3",
				CubeListBuilder.create().texOffs(50, 21).addBox(-6.25F, -1.5F, 0.0F, 6.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0305F, -7.7121F, -1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Bulb = endo_torso2.addOrReplaceChild("Bulb",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -1.875F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 46)
						.addBox(-1.5F, -4.625F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -31.375F, -2.25F, 0.0877F, 0.1723F, -0.1131F));

		PartDefinition cube = MainCharacter.addOrReplaceChild("cube", CubeListBuilder.create(),
				PartPose.offset(0.0F, -12.0F, -3.5F));

		PartDefinition Pelvis = partdefinition.addOrReplaceChild("Pelvis", CubeListBuilder.create(),
				PartPose.offset(0.0F, 35.0F, 0.0F));

		PartDefinition Body = Pelvis.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-8.05F, -9.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(6.05F, -9.6F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 46)
						.addBox(-4.0F, -11.0F, -5.7F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-1.0F, -10.0F, -6.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 33)
						.addBox(-1.0F, -7.0F, -5.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-1.0F, -4.0F, -5.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.5F, -6.5F, -5.0F, 11.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 21)
						.addBox(-4.5F, -10.5F, -5.0F, 9.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -22.0F, 1.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(37, 39).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.05F, -9.1F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(0, 41).addBox(-2.5F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.55F, -9.1F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Head2 = Body.addOrReplaceChild("Head2",
				CubeListBuilder.create().texOffs(47, 3)
						.addBox(-2.5F, -2.2F, -6.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-4.5F, -2.2F, -4.5F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 33)
						.addBox(-3.0F, -4.2F, -7.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-1.0F, -4.7F, -7.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-4.0F, -9.2F, -5.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(4, 21)
						.addBox(1.0F, -7.7F, -5.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-3.0F, -7.7F, -5.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 33)
						.addBox(-2.5F, -10.2F, -3.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 12)
						.addBox(-1.5F, -13.2F, -2.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 14)
						.addBox(-5.0F, -5.2F, -5.0F, 10.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.8F, 0.5F, 0.0F, 0.0F, -0.1309F));

		PartDefinition Jaw2 = Head2.addOrReplaceChild("Jaw2",
				CubeListBuilder.create().texOffs(0, 29)
						.addBox(-4.5F, -1.0F, -4.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 3)
						.addBox(-3.5F, 0.0F, -7.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 39)
						.addBox(-3.0F, -1.0F, -6.5F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 8)
						.addBox(-4.0F, -1.0F, -3.5F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.2F, 0.5F, 0.2778F, 0.3367F, 0.0939F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		MainCharacter.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Pelvis.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}