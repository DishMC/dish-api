package net.ouja.api.world.level.block;

import net.ouja.api.Entity;

import javax.annotation.Nullable;

public interface DoorBlock {
    /**
     * @return if the door is currently open
     */
    public boolean isOpen();

    /**
     * Sets the doors open state
     * @param entity Plays the "doorOpen" or "doorClosed" noise to the provided entity
     * @param open The door state
     */
    public void setOpen(@Nullable Entity entity, boolean open);
}
