package net.ouja.api.event.player;

import net.ouja.api.entity.Entity;
import net.ouja.api.entity.Player;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;

public class PlayerAttackEvent extends PlayerEvent implements EventListener, CancellableEvent {
    private boolean cancelled = false;
    private Entity entity;

    public PlayerAttackEvent(Player player, Entity entity) {
        super(player);
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity.getEntity();
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
