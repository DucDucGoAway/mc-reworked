package com.duc.mcreworked.item.custom;


import com.duc.mcreworked.MCReworked;
import com.duc.mcreworked.block.custom.CustomBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CustomItems {

    public static final Item CLOTH = registerItem("cloth", new Item(new Item.Settings()));
    public static final Item AEONITE_UPGRADE_SMITHING_TEMPLATE = registerItem("aeonite_upgrade_smithing_template", new Item(new Item.Settings()));
    public static final Item AEONITE_FRAGMENT = registerItem("aeonite_fragment", new Item(new Item.Settings()));
    public static final Item AEONITE_INGOT = registerItem("aeonite_ingot", new Item(new Item.Settings()));

    public static final Item AEONITE_HELMET = registerItem("aeonite_helmet", new Item(new Item.Settings()));
    public static final Item AEONITE_CHESTPLATE = registerItem("aeonite_chestplate", new Item(new Item.Settings()));
    public static final Item AEONITE_LEGGINGS = registerItem("aeonite_leggings", new Item(new Item.Settings()));
    public static final Item AEONITE_BOOTS = registerItem("aeonite_boots", new Item(new Item.Settings()));

    public static final Item AEONITE_SWORD = registerItem("aeonite_sword", new SwordItem(CustomToolMaterial.AEONITE, new Item.Settings()));
    public static final Item AEONITE_PICKAXE = registerItem("aeonite_pickaxe", new PickaxeItem(CustomToolMaterial.AEONITE, new Item.Settings()));
    public static final Item AEONITE_AXE = registerItem("aeonite_axe", new AxeItem(CustomToolMaterial.AEONITE, new Item.Settings()));
    public static final Item AEONITE_SHOVEL = registerItem("aeonite_shovel", new ShovelItem(CustomToolMaterial.AEONITE, new Item.Settings()));
    public static final Item AEONITE_HOE = registerItem("aeonite_hoe", new HoeItem(CustomToolMaterial.AEONITE, new Item.Settings()));



    //Item Registry Method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCReworked.MOD_ID, name), item);
    }



    //start putting Items into creative Tab Methods
    private static void addItemToIngredientTab(FabricItemGroupEntries entries) {
        entries.add(CLOTH);
        entries.add(AEONITE_UPGRADE_SMITHING_TEMPLATE);
        entries.add(AEONITE_FRAGMENT);
        entries.add(AEONITE_INGOT);
        entries.add(CustomBlocks.AEONITE_BLOCK);
        entries.add(CustomBlocks.ETERNAL_REMAINS);
    }

    private static void addItemToCombatTab(FabricItemGroupEntries entries) {
        entries.add(AEONITE_HELMET);
        entries.add(AEONITE_CHESTPLATE);
        entries.add(AEONITE_LEGGINGS);
        entries.add(AEONITE_BOOTS);
        entries.add(AEONITE_SWORD);
        entries.add(AEONITE_AXE);

    }
    private static void addItemToToolsTab(FabricItemGroupEntries entries) {
        entries.add(AEONITE_SHOVEL);
        entries.add(AEONITE_PICKAXE);
        entries.add(AEONITE_AXE);
        entries.add(AEONITE_HOE);

    }
    //stop putting Items into creative Tab Methods


    //Creative Item Tab Methods Usage
    public static void customItemRegistry() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(CustomItems::addItemToIngredientTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(CustomItems::addItemToCombatTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(CustomItems::addItemToToolsTab);
    }


}
