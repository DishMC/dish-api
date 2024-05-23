package net.ouja.api.dedicated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ServerProperties {
    /**
     * @return true if the server is online-mode. Default is true
     */
    public boolean isOnline();

    /**
     * @return true if the server is hardcore. Default is false
     */
    public boolean isHardcore();

    /**
     * @return the motd of the server.
     */
    @NotNull
    public String getMotd();

    /**
     * @return if the server can spawn animals
     */
    public boolean canSpawnAnimals();

    /**
     * @return if the server can spawn npcs
     */
    public boolean canSpawnNpcs();

    /**
     * @return if pvp is enabled on the server
     */
    public boolean isPvPEnabled();

    /**
     * @return if flight is enabled on the server
     */
    public boolean isFlightEnabled();

    /**
     * @return if the server has announce player achievements enabled
     */
    @Nullable
    public Boolean isAnnouncePlayerAchievementsEnabled();

    /**
     * @return if the server has The Nether enabled
     */
    public boolean isNetherAllowed();

    /**
     * @return if monsters can spawn in the server
     */
    public boolean canSpawnMonsters();

    /**
     * @return the set spawn protection
     */
    public int getSpawnProtection();

    /**
     * @return the set view distance
     */
    public int getViewDistance();

    /**
     * @return the set simulation distance
     */
    public int getSimulationDistance();

    /**
     * @return the max players allowed on the server
     */
    public int getMaxPlayers();

    /**
     * @return if the server hides online players
     */
    public boolean hideOnlinePlayers();

    /**
     * @return if white-list is enabled on the server
     */
    public boolean isWhitelistEnabled();

    /**
     * @return if the server accepts server transfers
     */
    public boolean acceptsServerTransfers();
}
