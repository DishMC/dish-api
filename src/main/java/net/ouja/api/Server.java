package net.ouja.api;

import net.ouja.api.commands.Command;
import net.ouja.api.dedicated.ServerProperties;
import net.ouja.api.event.EventListener;
import net.ouja.api.network.chat.Component;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public interface Server {
    /**
     * @return the version of the server.
     */
    @NotNull
    public String getVersion();

    /**
     * Used to get if the world is hardcore, online, the motd, view-distance, etc...
     *
     * @return the server properties.
     */
    @NotNull
    public ServerProperties getProperties();

    /**
     * @return the dish version
     */
    @NotNull
    public String getDishVersion();

    /**
     * @return a ArrayList for the players online
     */
    @NotNull
    public ArrayList<Player> getOnlinePlayers();

    public void registerEvent(EventListener clazz, Class<?> clazz1);

    public void registerCommand(Command command);

    public void broadcast(Component component);
}