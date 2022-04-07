package plizik.bgm.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.0
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbgm_chestplatever2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("bgm", "modelbgm_chestplatever_2"), "main");
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;

	public Modelbgm_chestplatever2(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(66, 29).addBox(-2.0F, 5.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(118, 55)
						.addBox(-2.0F, 1.0F, -5.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 19)
						.addBox(-5.0F, 1.0F, -4.0F, 10.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(84, 101)
						.addBox(-4.0F, 1.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(122, 38).addBox(0.3F, -5.2F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 6.2F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(90, 40).addBox(-2.6F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1F, 12.0F, 0.0F, 0.0F, 0.0F, -0.2269F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(70, 55).addBox(-3.0F, -8.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 13.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(68, 52).addBox(0.4F, -6.2F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.1F, 10.5F, 0.0F, 0.0F, 0.0F, 0.2862F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(66, 59).addBox(0.4F, -8.1F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 12.1F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(79, 53).addBox(1.0F, -8.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 13.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(81, 30).addBox(-3.0F, -21.2F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 22.2F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(6, 0).addBox(0.0F, -2.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(2.0F, -2.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(78, 7)
						.addBox(1.0F, -2.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(64, 17)
						.addBox(0.0F, 2.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(8, 8)
						.addBox(0.0F, 1.0F, -4.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(0.0F, 6.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 6)
						.addBox(0.0F, -2.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 3)
						.addBox(4.0F, 1.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 6)
						.addBox(0.0F, -2.0F, 3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 8)
						.addBox(0.0F, 1.0F, 3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
						.addBox(0.0F, 3.0F, -3.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, 7.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(120, 87)
						.addBox(1.0F, 8.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 98)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(114, 64)
						.addBox(-14.0F, 8.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition cube_r8 = LeftArm.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 126).addBox(10.0F, -8.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 21.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r9 = LeftArm.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(114, 64).addBox(-12.5F, -5.3F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, 18.3F, 0.0F, 0.0F, 0.0F, 0.4974F));
		PartDefinition cube_r10 = LeftArm.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 126).addBox(9.0F, -11.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(6, 11).addBox(-5.0F, 1.0F, -4.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 9)
						.addBox(-5.0F, 1.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(5, 6)
						.addBox(-1.0F, -2.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 98)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(5, 6)
						.addBox(-5.0F, 1.0F, 3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 6)
						.addBox(-1.0F, -2.0F, 3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 6)
						.addBox(-4.0F, 3.0F, -3.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(64, 17)
						.addBox(-4.0F, 2.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-4.0F, 6.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-4.0F, -2.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-4.0F, -2.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(64, 7)
						.addBox(-2.0F, -2.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 24)
						.addBox(-1.0F, -2.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 7.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(108, 64)
						.addBox(-4.0F, 8.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(108, 80)
						.addBox(10.0F, 8.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 72)
						.addBox(13.0F, 8.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(120, 87)
						.addBox(-3.0F, 8.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition cube_r11 = RightArm.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 126).addBox(-13.0F, -9.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r12 = RightArm.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(114, 72).addBox(11.5F, -5.3F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 18.3F, 0.0F, 0.0F, 0.0F, -0.4974F));
		PartDefinition cube_r13 = RightArm.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 126).addBox(-11.0F, -11.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		LeftArm.render(poseStack, buffer, packedLight, packedOverlay);
		RightArm.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
