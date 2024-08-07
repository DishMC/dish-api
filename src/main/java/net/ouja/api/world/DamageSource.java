package net.ouja.api.world;

import net.ouja.api.entity.Entity;

import javax.annotation.Nullable;

public interface DamageSource {
    /**
     * @return the entity that caused the damage
     */
    @Nullable
    public Entity getEntity();
}
