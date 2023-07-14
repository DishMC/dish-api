package net.ouja.api.event.player;

import net.ouja.api.Player;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;

public class PlayerChatEvent extends PlayerEvent implements EventListener, CancellableEvent {
    private boolean cancelled = false;
    private String message;

    public PlayerChatEvent(Player player, String message) {
        super(player);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void setCancel(boolean cancel) {
        this.cancelled = cancel;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }
}
