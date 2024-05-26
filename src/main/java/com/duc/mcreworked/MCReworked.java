package com.duc.mcreworked;

import com.duc.mcreworked.block.custom.CustomBlocks;
import com.duc.mcreworked.gamerule.CustomGameRules;
import com.duc.mcreworked.item.custom.CustomItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MCReworked implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("mc-reworked");
	public static final String MOD_ID = "mc-reworked";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Initializing MC Reworked");


		CustomItems.customItemRegistry();
		CustomBlocks.customBlockRegistry();
		CustomGameRules.gameRuleFunctionality();

    }
}