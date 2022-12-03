package net.adamraichu.firstmod;

import net.fabricmc.api.ModInitializer;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
	public static final java.util.logging.Logger LOGGER = Logger.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("AdamRaichu mod initialized");
	}
}
