package net.ouja.api.event.player;

import net.ouja.api.Player;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;

public class ExecuteCommandEvent extends PlayerEvent implements EventListener, CancellableEvent {
    private boolean isCancelled = false;
    private final String commandName;

    public ExecuteCommandEvent(Player player, String commandName) {
        super(player);
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
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
