package net.ouja.api.event.world.level;

import net.ouja.api.entity.Entity;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;

public class SpawnerSpawnEvent implements EventListener, CancellableEvent {
    private boolean isCancelled = false;
    private final Entity entity;

    public SpawnerSpawnEvent(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void setCancel(boolean cancel) {
        this.isCancelled = cancel;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

    public Entity getEntity() {
        return entity;
    }
}
