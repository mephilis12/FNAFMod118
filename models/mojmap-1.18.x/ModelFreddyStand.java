// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFreddyStand<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "freddystand"), "main");
	private final ModelPart Stand;

	public ModelFreddyStand(ModelPart root) {
		this.Stand = root.getChild("Stand");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Stand = partdefinition.addOrReplaceChild("Stand", CubeListBuilder.create(),
				PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition bone = Stand.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, -12.0F, -3.5F));

		PartDefinition endo_torso = Stand.addOrReplaceChild("endo_torso",
				CubeListBuilder.create().texOffs(14, 37)
						.addBox(2.0F, -13.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -17.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 37)
						.addBox(2.0F, -25.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(2.5F, -30.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(2.5F, -35.0F, -1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(6.5F, -26.0F, -1.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(0, 6)
						.addBox(-3.5F, -26.0F, -1.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)).texOffs(20, 37)
						.addBox(0.5F, -26.0F, -1.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(-0.01F)),
				PartPose.offset(-3.0F, 13.0F, 1.0F));

		PartDefinition bone7 = Stand.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(32, 33)
						.addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 33)
						.addBox(-10.0F, 15.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, -10.2426F, 0.0F));

		PartDefinition cube_r1 = bone7.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 29)
						.addBox(-1.0F, 1.0F, 0.0F, 8.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 33)
						.addBox(3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r2 = bone7.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 33).addBox(-7.0F, -3.0F, 4.0F, 6.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 18.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = bone7.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(32, 33).addBox(-7.0F, -3.0F, -4.0F, 6.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 18.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r4 = bone7.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(32, 33).addBox(-11.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 18.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Body = Stand.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(34, 12)
						.addBox(-2.4858F, -13.5F, -5.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)).texOffs(22, 21)
						.addBox(-4.0F, -14.0F, -4.5F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, -10.0F, -4.5F, 9.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(23, 15)
						.addBox(-4.5F, -3.0F, -4.0F, 9.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 33)
						.addBox(-3.0F, -3.0F, -6.1F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.15F)).texOffs(26, 0)
						.addBox(-1.0F, -3.5F, -6.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.8F, 0.0F, -0.0872F, 0.0038F, -0.262F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(34, 11).addBox(-4.0F, -1.4F, 0.8F, 8.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.4312F, -5.6113F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(26, 0)
						.addBox(-3.5F, -0.5F, -5.6F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 8)
						.addBox(-2.5F, -1.5F, -4.6F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.7F, 0.1F, 0.48F, 0.0F, 0.0F));

		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(3, 20).addBox(-0.5F,
				-1.0F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, -12.0F, -3.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Stand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}