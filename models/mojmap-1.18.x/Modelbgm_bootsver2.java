// Made with Blockbench 4.2.0
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbgm_bootsver2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bgm_bootsver2"), "main");
	private final ModelPart RBoot;
	private final ModelPart LBoot;

	public Modelbgm_bootsver2(ModelPart root) {
		this.RBoot = root.getChild("RBoot");
		this.LBoot = root.getChild("LBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RBoot = partdefinition.addOrReplaceChild("RBoot",
				CubeListBuilder.create().texOffs(0, 73)
						.addBox(-6.1F, 3.7F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-6.1F, 6.7F, -5.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(7, 70)
						.addBox(-6.1F, 5.7F, -4.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 82)
						.addBox(-6.1F, 3.7F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.1F, 16.3F, 0.0F));

		PartDefinition LBoot = partdefinition.addOrReplaceChild("LBoot",
				CubeListBuilder.create().texOffs(0, 73)
						.addBox(-5.0F, -4.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-5.0F, -1.0F, -5.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(7, 70)
						.addBox(-5.0F, -2.0F, -4.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 82)
						.addBox(-6.0F, -4.0F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RBoot.render(poseStack, buffer, packedLight, packedOverlay);
		LBoot.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}