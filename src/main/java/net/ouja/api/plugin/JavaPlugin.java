package net.ouja.api.plugin;

import net.ouja.api.Server;
import net.ouja.api.ouja;

public abstract class JavaPlugin implements Plugin {
    private Server server = ouja.getServer();
    private ClassLoader classLoader;

    @Override
    public void onEnable() {}

    @Override
    public void onDisable() {}

    /**
     * Returns the Server instance currently running this plugin
     *
     * @return Server running this plugin
     */
    @Override
    public final Server getServer() {
        return server;
    }

    public ClassLoader getClassLoader() {
        return classLoader;
    }
}
