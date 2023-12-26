package net.ouja.api.event.player;

import net.ouja.api.entity.Player;
import net.ouja.api.event.EventListener;
import net.ouja.api.network.chat.Component;
import org.jetbrains.annotations.Nullable;

public class PlayerJoinEvent extends PlayerEvent implements EventListener {
    private Component joinMessage;

    public PlayerJoinEvent(Player player, Component joinMessage) {
        super(player);
        this.joinMessage = joinMessage;
    }

    public void setJoinMessage(@Nullable Component joinMessage) {
        this.joinMessage = joinMessage;
    }

    @Nullable
    public Component getJoinMessage() {
        return this.joinMessage;
    }
}
