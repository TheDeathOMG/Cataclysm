package net.alex.cataclysm.entity;

import net.alex.cataclysm.Cataclysm;
import net.alex.cataclysm.entity.custom.IgnatiusEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Cataclysm.MOD_ID);

    public static final RegistryObject<EntityType<IgnatiusEntity>> IGNATIUS =
            ENTITY_TYPES.register("ignatius", () -> EntityType.Builder.of(IgnatiusEntity::new, MobCategory.MONSTER).sized(10f, 10f).build("ignatius"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
