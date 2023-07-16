package net.ouja.api.entity.neutral;

public enum LlamaVariants {
    CREAMY(0, "creamy"),
    WHITE(1, "white"),
    BROWN(2, "brown"),
    GRAY(3, "gray");

    final int id;
    private final String name;

    LlamaVariants(int id, String name) {
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
