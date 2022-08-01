// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGlitchtrap_Mask<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "glitchtrap_mask"), "main");
	private final ModelPart Head;

	public ModelGlitchtrap_Mask(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.8F)).texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(13, 52).mirror()
						.addBox(-1.25F, 0.85F, -1.325F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(13, 52).addBox(-5.75F, 0.85F, -1.325F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -4.65F, -4.65F, -2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 58).addBox(0.0F, -4.1025F, -0.2F, 5.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5233F, -1.0F, -4.75F, -3.119F, 0.1812F, 2.8905F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(8, 58).addBox(1.5F, -3.5525F, -0.15F, 5.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5233F, -1.0F, -4.75F, -3.0841F, 0.0576F, -2.8838F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(8, 58).addBox(-0.725F, -4.0275F, 0.075F, 5.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4767F, -1.0F, -4.75F, -0.0596F, 0.2754F, 0.2707F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(8, 58).addBox(0.9F, -3.6775F, 0.25F, 5.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4767F, -1.0F, -4.75F, -0.1095F, 0.2107F, -0.2258F));

		PartDefinition bone2 = Head.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(32, 10).mirror()
						.addBox(-1.5F, -5.6F, -0.025F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5F, -8.0F, 0.025F, 0.1304F, 0.0114F, -0.1738F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(24, 0).mirror()
						.addBox(-1.5F, -3.7F, -0.125F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -5.9F, 0.0F, 0.3914F, 0.0334F, -0.0807F));

		PartDefinition bone = Head.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(32, 10).addBox(-1.5F, -5.6F, 0.4346F, 3.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -8.0F, -0.4346F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(24, 0).addBox(-1.5F, -3.7F, -0.125F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.9F, 0.4596F, 0.7811F, -0.0924F, 0.0928F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}