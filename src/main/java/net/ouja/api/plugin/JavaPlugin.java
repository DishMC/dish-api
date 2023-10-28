package net.ouja.api.plugin;

import com.mojang.logging.LogUtils;
import net.ouja.api.Server;
import net.ouja.api.DishAPI;
import org.slf4j.Logger;

public abstract class JavaPlugin implements Plugin {
    private Server server = DishAPI.getServer();
    private ClassLoader classLoader;
    private Logger logger = LogUtils.getLogger();

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

    public Logger getLogger() {
        return logger;
    }
}
