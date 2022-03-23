package net.dragon20c.forgeworld.item;

import net.dragon20c.forgeworld.ForgeWorld;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FORGECRAFT = FabricItemGroupBuilder.build(new Identifier(ForgeWorld.MOD_ID,"forgecraft"),
            () -> new ItemStack(ModItems.DIRT_BALL));
}
