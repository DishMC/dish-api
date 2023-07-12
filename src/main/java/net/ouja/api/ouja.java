package net.ouja.api;

public class ouja {
    private static Server server;

    public static void setServer(Server server) {
        ouja.server = server;
    }

    public static Server getServer() {
        return server;
    }
}
