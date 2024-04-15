package net.alex.cataclysm.entity.client;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class IgnatiusModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart Knight;
	private final ModelPart Cabeza;
	private final ModelPart AnteMano2;
	private final ModelPart AnteMano1;
	private final ModelPart Faldilla;
	private final ModelPart Pecho;

	public IgnatiusModel(ModelPart root) {

		this.Knight = root.getChild("Knight");
		this.Cabeza = Knight.getChild("Resto").getChild("Cabezacuello").getChild("Cabeza");
		this.AnteMano2 = Knight.getChild("Resto").getChild("Brazos").getChild("Brazo2").getChild("AnteMano2");
		this.AnteMano1 = Knight.getChild("Resto").getChild("Brazos").getChild("Brazo1").getChild("AnteMano1");
		this.Faldilla = Knight.getChild("Resto").getChild("Cuerpo").getChild("Pelvis").getChild("Faldilla");
		this.Pecho = Knight.getChild("Resto").getChild("Cuerpo").getChild("Pecho");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Knight = partdefinition.addOrReplaceChild("Knight", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Piernas = Knight.addOrReplaceChild("Piernas", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Pierna2 = Piernas.addOrReplaceChild("Pierna2", CubeListBuilder.create(), PartPose.offset(5.0F, -12.0F, 0.0F));

		PartDefinition Pie2 = Pierna2.addOrReplaceChild("Pie2", CubeListBuilder.create().texOffs(79, 30).addBox(4.0F, -1.0F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 12.0F, 0.0F));

		PartDefinition Gemelo2_r1 = Pie2.addOrReplaceChild("Gemelo2_r1", CubeListBuilder.create().texOffs(36, 43).addBox(-1.0F, -3.658F, -1.0603F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -1.0F, -1.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Rodillamuslo2 = Pierna2.addOrReplaceChild("Rodillamuslo2", CubeListBuilder.create().texOffs(36, 43).addBox(4.0F, -8.0F, -4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 12.0F, 0.0F));

		PartDefinition Muslo2_r1 = Rodillamuslo2.addOrReplaceChild("Muslo2_r1", CubeListBuilder.create().texOffs(70, 83).addBox(-1.8398F, -5.949F, -3.1883F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -7.0F, 0.0F, -0.2597F, -0.0338F, -0.1265F));

		PartDefinition Pierna1 = Piernas.addOrReplaceChild("Pierna1", CubeListBuilder.create(), PartPose.offset(-5.0F, -12.0F, 0.0F));

		PartDefinition Rodillamuslo1 = Pierna1.addOrReplaceChild("Rodillamuslo1", CubeListBuilder.create().texOffs(36, 43).addBox(-8.0F, -8.0F, -4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 12.0F, 0.0F));

		PartDefinition Muslo1_r1 = Rodillamuslo1.addOrReplaceChild("Muslo1_r1", CubeListBuilder.create().texOffs(70, 83).addBox(-2.1602F, -5.949F, -3.1883F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -7.0F, 0.0F, -0.2597F, 0.0338F, 0.1265F));

		PartDefinition Pie1 = Pierna1.addOrReplaceChild("Pie1", CubeListBuilder.create().texOffs(79, 30).addBox(-8.0F, -1.0F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 12.0F, 0.0F));

		PartDefinition Gemelo1_r1 = Pie1.addOrReplaceChild("Gemelo1_r1", CubeListBuilder.create().texOffs(36, 43).addBox(-3.0F, -3.658F, -1.0603F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -1.0F, -1.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Resto = Knight.addOrReplaceChild("Resto", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Cuerpo = Resto.addOrReplaceChild("Cuerpo", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition Pecho = Cuerpo.addOrReplaceChild("Pecho", CubeListBuilder.create(), PartPose.offset(0.0F, -29.0F, -3.0F));

		PartDefinition Cuello_r1 = Pecho.addOrReplaceChild("Cuello_r1", CubeListBuilder.create().texOffs(0, 29).addBox(-11.0F, -2.0F, -5.0F, 22.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Pectoral2_r1 = Pecho.addOrReplaceChild("Pectoral2_r1", CubeListBuilder.create().texOffs(78, 14).mirror().addBox(1.0F, -36.0F, -5.0F, 10.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(78, 14).addBox(-11.0F, -36.0F, -5.0F, 10.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-12.0F, -37.0F, -4.0F, 24.0F, 18.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 29.0F, 3.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Pelvis = Cuerpo.addOrReplaceChild("Pelvis", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition Gluteo2_r1 = Pelvis.addOrReplaceChild("Gluteo2_r1", CubeListBuilder.create().texOffs(51, 30).addBox(-4.0F, -14.0F, 3.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(51, 30).addBox(1.0F, -14.0F, 3.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Abdomen_r1 = Pelvis.addOrReplaceChild("Abdomen_r1", CubeListBuilder.create().texOffs(0, 43).addBox(-7.0F, -21.0F, -2.0F, 14.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Pelvis_r1 = Pelvis.addOrReplaceChild("Pelvis_r1", CubeListBuilder.create().texOffs(70, 0).addBox(-5.0F, -8.0F, -2.0F, 10.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -14.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Faldilla = Pelvis.addOrReplaceChild("Faldilla", CubeListBuilder.create(), PartPose.offset(0.0F, -16.0F, -3.0F));

		PartDefinition Faldilla_r1 = Faldilla.addOrReplaceChild("Faldilla_r1", CubeListBuilder.create().texOffs(80, 43).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Cabezacuello = Resto.addOrReplaceChild("Cabezacuello", CubeListBuilder.create(), PartPose.offset(0.0F, -46.0F, -6.0F));

		PartDefinition Cabeza = Cabezacuello.addOrReplaceChild("Cabeza", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition Cara_r1 = Cabeza.addOrReplaceChild("Cara_r1", CubeListBuilder.create().texOffs(50, 63).addBox(-3.0F, -10.0F, -4.0F, 7.0F, 9.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(44, 43).addBox(-4.0F, -11.0F, -5.0F, 9.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.0F, 0.829F, 0.0F));

		PartDefinition Brazos = Resto.addOrReplaceChild("Brazos", CubeListBuilder.create(), PartPose.offset(0.0F, -35.0F, 0.0F));

		PartDefinition Brazo2 = Brazos.addOrReplaceChild("Brazo2", CubeListBuilder.create(), PartPose.offset(0.0F, 35.0F, 0.0F));

		PartDefinition AnteMano2 = Brazo2.addOrReplaceChild("AnteMano2", CubeListBuilder.create(), PartPose.offsetAndRotation(16.0F, -35.0F, -9.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Hombro2_r1 = AnteMano2.addOrReplaceChild("Hombro2_r1", CubeListBuilder.create().texOffs(0, 58).addBox(-6.0F, -5.081F, -5.3024F, 9.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0696F, 2.5481F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Biceps2_r1 = AnteMano2.addOrReplaceChild("Biceps2_r1", CubeListBuilder.create().texOffs(50, 79).addBox(-2.9041F, -5.2303F, -1.7384F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.9304F, -1.4519F, -0.1705F, -0.0376F, -0.215F));

		PartDefinition Codo2_r1 = AnteMano2.addOrReplaceChild("Codo2_r1", CubeListBuilder.create().texOffs(0, 77).addBox(-2.9735F, -2.1562F, -3.4201F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 7.2784F, -0.5032F, 0.5559F, 0.4681F, -0.3588F));

		PartDefinition Antebrazo2_r1 = AnteMano2.addOrReplaceChild("Antebrazo2_r1", CubeListBuilder.create().texOffs(68, 69).addBox(-2.9044F, -1.7321F, -5.7258F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.2784F, -6.5032F, 0.5273F, 0.1133F, 0.0657F));

		PartDefinition Mano2_r1 = AnteMano2.addOrReplaceChild("Mano2_r1", CubeListBuilder.create().texOffs(58, 30).addBox(-3.3744F, -3.3562F, -3.349F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 15.2784F, -11.5032F, 0.429F, -0.377F, 1.0363F));

		PartDefinition Brazo1 = Brazos.addOrReplaceChild("Brazo1", CubeListBuilder.create(), PartPose.offset(0.0F, 35.0F, 0.0F));

		PartDefinition AnteMano1 = Brazo1.addOrReplaceChild("AnteMano1", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, -34.0F, -7.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Hombro1_r1 = AnteMano1.addOrReplaceChild("Hombro1_r1", CubeListBuilder.create().texOffs(0, 58).addBox(-4.0F, -5.6897F, -4.5091F, 9.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -3.0F, 2.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Biceps1_r1 = AnteMano1.addOrReplaceChild("Biceps1_r1", CubeListBuilder.create().texOffs(50, 79).addBox(-3.0347F, -4.8444F, -1.7233F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0203F, -1.8458F, -0.1705F, 0.0376F, 0.215F));

		PartDefinition Codo1_r1 = AnteMano1.addOrReplaceChild("Codo1_r1", CubeListBuilder.create().texOffs(0, 77).addBox(-1.7397F, -2.2065F, -2.8356F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 6.0203F, -2.8458F, 0.5559F, -0.4681F, 0.3588F));

		PartDefinition Antebrazo1_r1 = AnteMano1.addOrReplaceChild("Antebrazo1_r1", CubeListBuilder.create().texOffs(68, 69).addBox(-1.0F, 1.0F, -5.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.0203F, -9.8458F, 0.5273F, -0.1133F, -0.0657F));

		PartDefinition Espada = AnteMano1.addOrReplaceChild("Espada", CubeListBuilder.create(), PartPose.offset(1.0F, 15.0203F, -12.8458F));

		PartDefinition Mano1_r1 = Espada.addOrReplaceChild("Mano1_r1", CubeListBuilder.create().texOffs(58, 30).addBox(-3.6256F, -3.3562F, -3.349F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.2739F, 0.4987F, -1.3983F));

		PartDefinition Soporte1_r1 = Espada.addOrReplaceChild("Soporte1_r1", CubeListBuilder.create().texOffs(57, 16).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(71, 54).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9544F, -6.2176F, -4.9424F, 0.5752F, -0.2043F, -0.0478F));

		PartDefinition Filo3_r1 = Espada.addOrReplaceChild("Filo3_r1", CubeListBuilder.create().texOffs(36, 58).addBox(0.0F, -33.0F, -3.0F, 1.0F, 34.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0892F, -6.0874F, -2.2719F, 0.4854F, -0.1611F, -0.0674F));

		PartDefinition Empuadura_r1 = Espada.addOrReplaceChild("Empuadura_r1", CubeListBuilder.create().texOffs(24, 77).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3239F, -3.5359F, -0.8922F, 0.5305F, -0.2079F, -0.0666F));

		PartDefinition Filo2_r1 = Espada.addOrReplaceChild("Filo2_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7041F, -34.4774F, -19.0428F, 0.4826F, -0.1719F, -0.0306F));

		PartDefinition Filo1_r1 = Espada.addOrReplaceChild("Filo1_r1", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8086F, -36.253F, -19.9573F, 0.4826F, -0.1719F, -0.0306F));

		PartDefinition Pelvis2 = Knight.addOrReplaceChild("Pelvis2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		tatw
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Knight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Knight;
	}
}