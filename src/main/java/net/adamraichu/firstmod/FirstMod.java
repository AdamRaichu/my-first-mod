package net.adamraichu.firstmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import static net.minecraft.server.command.CommandManager.*;

public class FirstMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

  @Override
  public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
  }
}
