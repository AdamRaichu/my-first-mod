package net.adamraichu.firstmod;

import net.fabricmc.api.ClientModInitializer;
import static net.minecraft.server.command.CommandManager.literal;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;

public class FirstModClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {

    ClientCommandRegistrationCallback.EVENT.register ((dispatcher, registryAccess, environment) -> {
      dispatcher.register(
        literal("firstmod").executes(context -> {
          context.getSource().sendMessage(Text.literal("Called /firstmod with no arguments"));
        })
      );
    });

  }
}
