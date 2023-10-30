package net.ouja.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DishAPI {
    private static Server server;
    private static String apiVersion = getBuild();

    private static String getBuild() {
        try {
            InputStream in = DishAPI.class.getResourceAsStream("/buildAPI.txt");
            if (in == null) return "UNKNOWN";

            return readLines(in)[0];
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "UNKNOWN";
    }

    private static String[] readLines(InputStream is) throws IOException {
        List<String> list = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.US_ASCII);
        BufferedReader br = new BufferedReader(isr);

        while(true) {
            String line = br.readLine();
            if (line == null) {
                return list.toArray(new String[0]);
            }

            list.add(line);
        }
    }

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
