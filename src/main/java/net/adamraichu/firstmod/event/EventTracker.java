package net.adamraichu.firstmod.event;

import net.adamraichu.firstmod.FirstMod;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
// import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class EventTracker implements UseItemCallback {
  @Override
  public TypedActionResult<ItemStack> interact(PlayerEntity player, World world, Hand hand) {
    if (!player.isSpectator() && world.isClient()) {
      FirstMod.LOGGER.info("A player which is not a spectator used an item");
    }
    return null;
  }
}