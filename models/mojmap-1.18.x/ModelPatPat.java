// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPatPat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "patpat"), "main");
	private final ModelPart Sign;

	public ModelPatPat(ModelPart root) {
		this.Sign = root.getChild("Sign");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Sign = partdefinition.addOrReplaceChild("Sign",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-1.0F, -18.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 24)
						.addBox(-1.5F, -16.0F, -6.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(35, 9)
						.addBox(-2.0F, -22.0F, -5.5F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(0.0F, -25.0F, -5.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -25.0F, 2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-5.5F, -5.0F, -6.0F, 11.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(57, 58)
						.addBox(-4.5F, -8.0F, -6.0F, 9.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(54, 0)
						.addBox(-3.5F, -11.0F, -6.0F, 7.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(65, 43)
						.addBox(-2.5F, -14.0F, -6.0F, 5.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(66, 9)
						.addBox(-1.0F, -22.0F, -5.5F, 0.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(-2.0F, -22.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 25.0F, 0.0F));

		PartDefinition cube_r1 = Sign.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 64).addBox(0.001F, 0.0F, 0.0F, 0.0F, 11.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4991F, -13.9997F, -6.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r2 = Sign.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 64).addBox(0.001F, 0.0F, 0.0F, 0.0F, 11.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -14.0F, -6.0F, 0.0F, 0.0F, 0.3491F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Sign.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Sign.yRot = ageInTicks / 20.f;
	}
}