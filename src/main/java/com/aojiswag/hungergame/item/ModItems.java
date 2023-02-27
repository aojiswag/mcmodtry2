package com.aojiswag.hungergame.item;

import com.aojiswag.hungergame.HungerGame;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HungerGame.MOD_ID);

    public static final RegistryObject<Item> THIGH_BURGER = ITEMS.register("thigh_burger",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GIFT_CARD = ITEMS.register("gift_card",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
