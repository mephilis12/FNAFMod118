// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcamera_hanging_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "camera_hanging_converted"), "main");
	private final ModelPart Camera;

	public Modelcamera_hanging_Converted(ModelPart root) {
		this.Camera = root.getChild("Camera");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Camera = partdefinition.addOrReplaceChild("Camera",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-2.0F, -16.0F, 5.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
						.addBox(-3.0F, -12.0F, 0.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(11, 14)
						.addBox(-3.0F, -12.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

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