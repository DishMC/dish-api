package net.ouja.api.entity.monster;

import net.ouja.api.entity.Entity;
import org.jetbrains.annotations.Nullable;

public interface Vex {

    /**
     * @return the owner of the vex
     */
    @Nullable
    public Entity getOwner();
}
