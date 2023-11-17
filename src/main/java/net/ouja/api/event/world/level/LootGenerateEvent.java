package net.ouja.api.event.world.level;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;
import net.ouja.api.world.item.ItemStack;

/**
 * This event is fired every single time a player opens a chest where Minecraft then randomly generates the items inside it.
 */
public class LootGenerateEvent implements EventListener, CancellableEvent {
    private boolean isCancelled;
    private final ObjectArrayList<ItemStack> items;

    public LootGenerateEvent(ObjectArrayList<ItemStack> items) {
        this.items = items;
    }

    public ObjectArrayList<ItemStack> getItems() {
        return items;
    }

    /**
     * Controls whether the event will be cancelled or not
     */
    @Override
    public void setCancel(boolean cancel) {
        this.isCancelled = cancel;
    }

    /**
     * @return the cancelled state
     */
    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }
}
