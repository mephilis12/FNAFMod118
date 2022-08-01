// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeloffice_chair_dark<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "office_chair_dark"), "main");
	private final ModelPart group2;

	public Modeloffice_chair_dark(ModelPart root) {
		this.group2 = root.getChild("group2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition group2 = partdefinition.addOrReplaceChild("group2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -2.0F, -7.0F, 14.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(32, 15)
						.addBox(-9.0F, -7.0F, -7.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(7.0F, -7.0F, -7.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(7.0F, -5.0F, -6.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 10)
						.addBox(-9.0F, -5.0F, -6.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 5)
						.addBox(7.0F, -5.0F, 3.0F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(-9.0F, -5.0F, 3.0F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 15)
						.addBox(7.0F, -3.0F, -6.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(19, 15)
						.addBox(-9.0F, -3.0F, -6.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-1.001F, 1.0F, -4.9142F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-8.4152F, 1.0F, -1.5F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 2.0F));

		PartDefinition cube_r1 = group2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.0F, -2.0F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.001F, 5.0F, -0.0858F, 0.0F, -0.7854F, 0.0F));

		PartDefinition group3 = group2.addOrReplaceChild("group3", CubeListBuilder.create().texOffs(0, 20).addBox(-6.0F,
				-20.5517F, 2.2814F, 12.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.6934F, 5.5412F));

		PartDefinition cube_r2 = group3.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 39)
						.addBox(-12.0F, -13.0F, 1.0F, 10.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-12.0F, -13.0F, 0.0F, 0.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 29)
						.addBox(-14.0F, -10.0F, -1.0F, 14.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -1.3066F, -0.5412F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = group3
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(4, 42).addBox(0.0F, -14.0F, -1.0F, 0.0F, 15.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition group = group2.addOrReplaceChild("group", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 6.0F, -1.5F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition bone = group.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -3.1416F, -0.7854F, 3.1416F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-2.0F, 3.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, -7)
						.addBox(-1.0F, -2.0F, -1.0F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0816F, -2.0F, 1.4429F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone2 = group.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -3.1416F, -2.042F, 3.1416F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-2.0F, 3.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, -7)
						.addBox(-1.0F, -2.0F, -1.0F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0518F, -2.0F, 1.3462F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone3 = group.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -3.1416F, 2.9845F, 3.1416F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-2.0F, 3.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, -7)
						.addBox(-1.0F, -2.0F, -1.0F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0494F, -2.0F, 1.3447F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone4 = group.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -3.1416F, 1.7279F, 3.1416F));

		PartDefinition cube_r7 = bone4.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-2.0F, 3.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, -7)
						.addBox(-1.0F, -2.0F, -1.0F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0821F, -2.0F, 1.4404F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone5 = group.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -3.1416F, 0.4712F, 3.1416F));

		PartDefinition cube_r8 = bone5.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-2.0F, 3.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, -7)
						.addBox(-1.0F, -2.0F, -1.0F, 0.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0011F, -2.0F, 1.5011F, 0.0F, -0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		group2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}