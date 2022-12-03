package net.adamraichu.firstmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static net.minecraft.server.command.CommandManager.*;

public class FirstMod implements ModInitializer {
  @Override
  public void onInitialize() {
    CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("foo")
        .executes(context -> {
      // For versions below 1.19, replace "Text.literal" with "new LiteralText".
      context.getSource().sendMessage(Text.literal("Called /foo with no arguments"));
 
      return 1;
    })));
  }
}
