package net.dragon20c.forgeworld;

import com.sun.jna.WString;
import net.dragon20c.forgeworld.block.ModBlocks;
import net.dragon20c.forgeworld.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForgeWorld implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "forgeworld";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
