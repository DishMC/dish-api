package net.ouja.api.event.player;

import net.ouja.api.Player;
import net.ouja.api.event.EventListener;
import org.jetbrains.annotations.Nullable;

public class PlayerJoinEvent extends PlayerEvent implements EventListener {
    private String joinMessage;

    public PlayerJoinEvent(Player player, String joinMessage) {
        super(player);
        this.joinMessage = joinMessage;
    }

    public void setJoinMessage(@Nullable String joinMessage) {
        this.joinMessage = joinMessage;
    }

    @Nullable
    public String getJoinMessage() {
        return this.joinMessage;
    }
}
