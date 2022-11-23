// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcamera<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "camera"), "main");
	private final ModelPart Camera;

	public Modelcamera(ModelPart root) {
		this.Camera = root.getChild("Camera");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Camera = partdefinition.addOrReplaceChild("Camera",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-9.0F, -6.0F, 9.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 23)
						.addBox(-9.0F, -6.0F, 16.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -7.0F, 9.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-10.0F, -11.0F, 7.5F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(11, 14)
						.addBox(-10.0F, -11.0F, 5.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 23.0F, -7.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Camera.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}