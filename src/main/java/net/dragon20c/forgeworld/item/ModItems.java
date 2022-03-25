package net.dragon20c.forgeworld.item;

import net.dragon20c.forgeworld.ForgeWorld;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final Item MUD_STICK = registerItem("mud_stick",
            new Item(new FabricItemSettings().group(ModItemGroup.FORGECRAFT)));

    public static final Item DIRT_BALL = registerItem("dirt_ball",
            new Item(new FabricItemSettings().group(ModItemGroup.FORGECRAFT)));

    public static final Item MUD_BALL = registerItem("mud_ball",
            new Item(new FabricItemSettings().group(ModItemGroup.FORGECRAFT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ForgeWorld.MOD_ID,name),item);
    }

    public static void  registerModItems() {
        ForgeWorld.LOGGER.info("Registering ModItems for" + ForgeWorld.MOD_ID);
    }
}
