package net.ouja.api.entity.passive;

public enum RabbitVariants {
    BROWN(0, "brown"),
    WHITE(1, "white"),
    BLACK(2, "black"),
    WHITE_SPLOTCHED(3, "white_splotched"),
    GOLD(4, "gold"),
    SALT(5, "salt"),
    EVIL(99, "evil");

    final int id;
    private final String name;

    private RabbitVariants(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getSerializedName() {
        return this.name;
    }

    public int id() {
        return this.id;
    }
}
