package net.alex.cataclysm.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.alex.cataclysm.Cataclysm;
import net.alex.cataclysm.entity.custom.IgnatiusEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class IgnatiusRenderer extends MobRenderer<IgnatiusEntity, IgnatiusModel<IgnatiusEntity>>     {
    public IgnatiusRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new IgnatiusModel<>(pContext.bakeLayer(ModModelLayers.IGNATIUS_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(IgnatiusEntity ignatiusEntity) {
        return new ResourceLocation(Cataclysm.MOD_ID, "textures/entity/ignatius.png");
    }

    @Override
    public void render(IgnatiusEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.scale(4f, 4f, 4f);
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
