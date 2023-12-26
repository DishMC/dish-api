package net.ouja.api.world.level.block;

import net.ouja.api.entity.Player;

import javax.annotation.Nullable;

public interface TrapdoorBlock extends WaterLoggableBlock {
    /**
     * @return if the door is currently open
     */
    public boolean isOpen();

    /**
     * Sets the doors open state
     * @param player Plays the "doorOpen" or "doorClosed" noise to the provided entity
     * @param open The door state
     */
    public void setOpen(@Nullable Player player, boolean open);
}
