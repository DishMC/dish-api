package net.ouja.api.event.player;

import net.ouja.api.Player;
import net.ouja.api.event.Event;
import net.ouja.api.event.EventListener;
import net.ouja.api.event.Handlers;

public class PlayerJoinEvent extends Event implements EventListener {
    private Player player;
    private static final Handlers handlers = new Handlers();
    private String joinMessage;

    public PlayerJoinEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setJoinMessage(String joinMessage) {
        this.joinMessage = joinMessage;
    }

    public String getJoinMessage() {
        return this.joinMessage;
    }

    @Override
    public Handlers getHandlers() {
        return handlers;
    }
}
