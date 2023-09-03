package net.ouja.api;

import net.ouja.api.world.Level;
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

    /**
     * @return the current level the player is in
     */
    public Level getLevel();

    /**
     * @return true if the player is console
     */
    public boolean isConsole();

    /**
     * Sends the player a message
     * @param message
     */
    public void sendMessage(String message);
}
