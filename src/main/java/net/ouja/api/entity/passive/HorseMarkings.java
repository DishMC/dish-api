package net.ouja.api.entity.passive;

public enum HorseMarkings {
    NONE(0),
    WHITE(1),
    WHITE_FIELD(2),
    WHITE_DOTS(3),
    BLACK_DOTS(4);

    private final int id;

    private HorseMarkings(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
