// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbgm_boots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bgm_boots"), "main");
	private final ModelPart LBoot;
	private final ModelPart RBoot;

	public Modelbgm_boots(ModelPart root) {
		this.LBoot = root.getChild("LBoot");
		this.RBoot = root.getChild("RBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LBoot = partdefinition.addOrReplaceChild("LBoot",
				CubeListBuilder.create().texOffs(0, 73)
						.addBox(-3.0F, 8.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-3.0F, 11.0F, -5.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(7, 70)
						.addBox(-3.0F, 10.0F, -4.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 82)
						.addBox(-3.0F, 8.0F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 12.0F, 0.0F));

		PartDefinition RBoot = partdefinition.addOrReplaceChild("RBoot",
				CubeListBuilder.create().texOffs(0, 73)
						.addBox(-2.0F, 8.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-2.0F, 11.0F, -5.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(7, 70)
						.addBox(-2.0F, 10.0F, -4.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 82)
						.addBox(-3.0F, 8.0F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LBoot.render(poseStack, buffer, packedLight, packedOverlay);
		RBoot.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}