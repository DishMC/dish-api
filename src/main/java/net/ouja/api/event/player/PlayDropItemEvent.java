package net.ouja.api.event.player;

import net.ouja.api.entity.Player;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;
import net.ouja.api.world.item.ItemStack;

/**
 * This is called every single time a player drops an item. Can be cancelled
 */
public class PlayDropItemEvent extends PlayerEvent implements EventListener, CancellableEvent {
    private boolean isCancelled = false;
    private final ItemStack itemStack;
    private int pickUpDelay = 40;

    public PlayDropItemEvent(Player player, ItemStack itemStack) {
        super(player);
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public void setPickUpDelay(int i) {
        this.pickUpDelay = i;
    }

    public int getPickUpDelay() {
        return this.pickUpDelay;
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
