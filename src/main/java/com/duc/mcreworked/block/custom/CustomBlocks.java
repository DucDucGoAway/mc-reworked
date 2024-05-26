package com.duc.mcreworked.block.custom;

import com.duc.mcreworked.MCReworked;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CustomBlocks {

    public static final Block AEONITE_BLOCK = registerBlock("aeonite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block ETERNAL_REMAINS = registerBlock("eternal_remains",
            new Block(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MCReworked.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MCReworked.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void customBlockRegistry() {

    }

}
