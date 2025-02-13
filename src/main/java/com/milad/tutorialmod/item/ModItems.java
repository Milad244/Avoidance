package com.milad.tutorialmod.item;

import com.milad.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> VOLCANITE = ITEMS.register("volcanite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PYRONITE = ITEMS.register("raw_pyronite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PYRONITE_NUGGET = ITEMS.register("pyronite_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PYRONITE = ITEMS.register("pyronite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PYRONITE_GEM = ITEMS.register("pyronite_gem",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
