package net.ouja.api.auth;

import java.util.UUID;

public class GameProfile {
    private final String playerName;
    private final UUID playerUUID;

    public GameProfile(String playerName, UUID playerUUID) {
        this.playerName = playerName;
        this.playerUUID = playerUUID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }
}
