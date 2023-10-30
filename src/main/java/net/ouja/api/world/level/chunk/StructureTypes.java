package net.ouja.api.world.level.chunk;

public enum StructureTypes {
    BURIED_TREASURE("buried_treasure"),
    DESERT_PYRAMID("desert_pyramid"),
    END_CITY("end_city"),
    FORTRESS("fortress"),
    IGLOO("igloo"),
    JIGSAW("jigsaw"),
    JUNGLE_TEMPLE("jungle_temple"),
    MINESHAFT("mineshaft"),
    NETHER_FOSSIL("nether_fossil"),
    OCEAN_MONUMENT("ocean_monument"),
    OCEAN_RUIN("ocean_ruin"),
    RUINED_PORTAL("ruined_portal"),
    SHIPWRECK("shipwreck"),
    STRONGHOLD("stronghold"),
    SWAMP_HUT("swamp_hut"),
    WOODLAND_MANSION("woodland_mansion");

    private final String name;

    private StructureTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
