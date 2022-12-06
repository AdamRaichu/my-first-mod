package net.adamraichu.firstmod;

import net.fabricmc.api.ClientModInitializer;
// import static net.minecraft.server.command.CommandManager.*;
// import com.mojang.brigadier.builder.ArgumentBuilder;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;

public class FirstModClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {

    ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
      dispatcher.register(
          ClientCommandManager.literal("firstmod").executes(context -> {
            context.getSource().sendMessage(ClientCommandManager.literal("Called /firstmod with no arguments"));
          }));
    });

  }
}
