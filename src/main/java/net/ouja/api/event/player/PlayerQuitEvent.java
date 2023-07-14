package net.ouja.api.event.player;

import net.ouja.api.Player;
import net.ouja.api.event.EventListener;
import org.jetbrains.annotations.Nullable;

public class PlayerQuitEvent extends PlayerEvent implements EventListener {
    private String quitMessage;

    public PlayerQuitEvent(Player player, String quitMessage) {
        super(player);
        this.quitMessage = quitMessage;
    }

    public void setQuitMessage(@Nullable String leaveMessage) {
        this.quitMessage = leaveMessage;
    }

    @Nullable
    public String getQuitMessage() {
        return this.quitMessage;
    }
}
