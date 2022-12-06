package net.adamraichu.firstmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.minecraft.text.Text;

public class FirstModClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {

    ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
      dispatcher.register(
          ClientCommandManager.literal("firstmod").executes(context -> {
            context.getSource().sendFeedback(Text.literal("Executed /firstmod"));
            return 0;
          }));
    });
  }
}
