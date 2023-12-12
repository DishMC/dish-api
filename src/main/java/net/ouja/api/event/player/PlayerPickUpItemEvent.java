package net.ouja.api.event.player;

import net.ouja.api.Player;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;
import net.ouja.api.world.item.ItemStack;

/**
 * This is called every single time a player actually picks up an item. This can be cancelled
 */
public class PlayerPickUpItemEvent extends PlayerEvent implements EventListener, CancellableEvent {
    private boolean isCancelled = false;
    private final ItemStack itemStack;

    public PlayerPickUpItemEvent(Player player, ItemStack itemStack) {
        super(player);
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    @Override
    public void setCancel(boolean cancel) {
        this.isCancelled = cancel;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }
}
