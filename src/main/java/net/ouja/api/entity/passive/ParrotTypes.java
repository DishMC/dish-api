package net.ouja.api.entity.passive;

public enum ParrotTypes {
    RED_BLUE(0, "red_blue"),
    BLUE(1, "blue"),
    GREEN(2, "green"),
    YELLOW_BLUE(3, "yellow_blue"),
    GRAY(4, "gray");

    final int id;
    private final String name;

    private ParrotTypes(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
