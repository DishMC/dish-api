package net.ouja.api;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface Player {

    /**
     * @return the username of the player
     */
    @NotNull
    public String getName();

    /**
     * @return the UUID of the player
     */
    @NotNull
    public UUID getUUID();
}
