package net.ouja.api.entity.passive;

public enum HorseTypes {
    WHITE(0, "white"),
    CREAMY(1, "creamy"),
    CHESTNUT(2, "chestnut"),
    BROWN(3, "brown"),
    BLACK(4, "black"),
    GRAY(5, "gray"),
    DARK_BROWN(6, "dark_brown");

    private final int id;
    private final String name;

    private HorseTypes(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }
}
