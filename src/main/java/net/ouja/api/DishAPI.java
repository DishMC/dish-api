package net.ouja.api;

public class DishAPI {
    private static Server server;
    private static String apiVersion = "23w43b-R2-SNAPSHOT";

    public static void setServer(Server server) {
        DishAPI.server = server;
    }

    public static Server getServer() {
        return server;
    }

    public static String getApiVersion() {
        return apiVersion;
    }
}
