package net.ouja.api.world;

import net.ouja.api.Entity;

import javax.annotation.Nullable;

public interface DamageSource {
    /**
     * @return the causing entity of the damage
     */
    @Nullable
    public Entity getEntity();
}
