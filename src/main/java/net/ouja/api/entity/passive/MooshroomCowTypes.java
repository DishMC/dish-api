package net.ouja.api.entity.passive;

public enum MooshroomCowTypes {
    RED("red"),
    BROWN("brown");

    final String type;

    private MooshroomCowTypes(String type) {
        this.type = type;
    }

    public String getSerializedName() {
        return this.type;
    }
}
