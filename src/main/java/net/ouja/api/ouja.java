package net.ouja.api;

public class ouja {
    private static Server server;
    private static String apiVersion = "1.20.1-R0.1-SNAPSHOT";

    public static void setServer(Server server) {
        ouja.server = server;
    }

    public static Server getServer() {
        return server;
    }

    public static String getApiVersion() {
        return apiVersion;
    }
}
