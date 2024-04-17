package net.alex.cataclysm.event;

import net.alex.cataclysm.Cataclysm;
import net.alex.cataclysm.entity.ModEntities;
import net.alex.cataclysm.entity.custom.IgnatiusEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Cataclysm.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventsBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.IGNATIUS.get(), IgnatiusEntity.createAttributes().build());
    }
}
