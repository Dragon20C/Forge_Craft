package net.dragon20c.forgeworld.block;

import net.dragon20c.forgeworld.ForgeWorld;
import net.dragon20c.forgeworld.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MUD_BLOCK = registerBlock("mud_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f)), ModItemGroup.FORGECRAFT);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ForgeWorld.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ForgeWorld.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        ForgeWorld.LOGGER.info("Registering ModBlocks for " + ForgeWorld.MOD_ID);
    }
}