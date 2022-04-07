package plizik.bgm.client.model;

import net.minecraft.world.entity.Entity;
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
public class Modelbgm_helmerver2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("bgm", "modelbgm_helmerver_2"), "main");
	public final ModelPart Head;

	public Modelbgm_helmerver2(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -8.5833F, -3.9444F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -3.5833F, -4.9444F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -0.5833F, -4.9444F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -3.5833F, -3.9444F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, 4.4167F, 8.0556F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, 4.4167F, -4.9444F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, 4.4167F, -3.9444F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 4.4167F, -3.9444F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -3.5833F, -3.9444F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 12)
						.addBox(-6.0F, -3.5833F, 7.0556F, 12.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -8.5833F, -4.9444F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 9)
						.addBox(-4.0F, -6.5833F, -1.9444F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(11, 7)
						.addBox(-6.0F, -4.5833F, -3.9444F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, 4.4167F, -4.9444F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(5.0F, -3.5833F, -2.9444F, 1.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(30, 1)
						.addBox(-6.0F, -3.5833F, -2.9444F, 1.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(36, 3)
						.addBox(-1.0F, -8.5833F, -1.9444F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(85, 95)
						.addBox(-4.0F, -1.5833F, -1.9444F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.4167F, -2.0556F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
