package net.alex.cataclysm.event;

import net.alex.cataclysm.Cataclysm;
import net.alex.cataclysm.entity.client.IgnatiusModel;
import net.alex.cataclysm.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Cataclysm.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.IGNATIUS_LAYER, IgnatiusModel::createBodyLayer);
    }
}
