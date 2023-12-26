package net.ouja.api.world;

import net.ouja.api.Entity;

import javax.annotation.Nullable;

public interface DamageSource {
    /**
     * @return the entity that caused the damage
     */
    @Nullable
    public Entity getEntity();
}
