package net.ouja.api;

import net.ouja.api.network.chat.Component;
import net.ouja.api.world.Level;
import net.ouja.api.world.level.block.BlockPos;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
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
     */
    public void sendMessage(Component component);

    /**
     * @return the last known death location
     */
    @Nullable
    public BlockPos lastDeathLocation();
}
