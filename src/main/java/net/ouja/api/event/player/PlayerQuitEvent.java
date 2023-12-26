package net.ouja.api.event.player;

import net.ouja.api.entity.Player;
import net.ouja.api.event.EventListener;
import net.ouja.api.network.chat.Component;
import org.jetbrains.annotations.Nullable;

public class PlayerQuitEvent extends PlayerEvent implements EventListener {
    private Component quitMessage;

    public PlayerQuitEvent(Player player, Component quitMessage) {
        super(player);
        this.quitMessage = quitMessage;
    }

    public void setQuitMessage(@Nullable Component leaveMessage) {
        this.quitMessage = leaveMessage;
    }

    @Nullable
    public Component getQuitMessage() {
        return this.quitMessage;
    }
}
