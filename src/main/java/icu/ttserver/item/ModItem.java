package icu.ttserver.item;

import icu.ttserver.Primogem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItem {
    //create new item
    public static final Item PRIMOGEM = registerItem("primogem", new Item(new FabricItemSettings()));
    //register function
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Primogem.MOD_ID, name),item);
    }
    //function that add it to group
    private static void addItemToGroup(FabricItemGroupEntries entries){
        entries.add(PRIMOGEM);
    }
    //outside use
    public static void registerModItem(){
        Primogem.LOGGER.info("Register item for" + Primogem.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItem::addItemToGroup);
    }
}
