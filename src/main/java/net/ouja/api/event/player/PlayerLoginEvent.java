package net.ouja.api.event.player;

import net.ouja.api.auth.GameProfile;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;
import net.ouja.api.network.chat.Component;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.net.SocketAddress;
import java.util.UUID;

/**
 * This is called when a player attempts to log in to the server.
 * If you are wanting to change the join message use {@link PlayerJoinEvent}.
 */
public class PlayerLoginEvent implements EventListener, CancellableEvent {
    private boolean isCancelled = false;
    private final GameProfile profile;
    private Component errorMessage = null;

    public PlayerLoginEvent(GameProfile profile, @Nullable Component errorMessage) {
        this.profile = profile;
        this.errorMessage = errorMessage;
    }

    public GameProfile getProfile() {
        return profile;
    }

    @Nullable
    public Component getErrorMessage() {
        return errorMessage;
    }

    /**
     * Setting an error message will disconnect the player.
     * @param errorMessage The component that will be displayed to the user
     */
    public void setErrorMessage(@NotNull Component errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public void setCancel(boolean cancel) {
        this.isCancelled = cancel;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }
}
