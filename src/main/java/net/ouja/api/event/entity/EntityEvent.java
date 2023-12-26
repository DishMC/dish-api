package net.ouja.api.event.entity;

import net.ouja.api.Entity;

public class EntityEvent {
    private final Entity entity;

    public EntityEvent(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }
}
