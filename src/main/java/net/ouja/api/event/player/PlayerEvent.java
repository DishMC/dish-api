package net.ouja.api.event.player;

import net.ouja.api.entity.Player;

public class PlayerEvent {
    private Player player;

    public PlayerEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
