package net.ouja.api.plugin;

import net.ouja.api.Server;

public interface Plugin {
    /**
     * @return the server instance
     */
    public Server getServer();

    /**
     * called when a plugin is enabled
     */
    public void onEnable();

    /**
     * called when a plugin is disabled
     */
    public void onDisable();
}
