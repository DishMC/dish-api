package net.ouja.api.entity.passive;

public interface TropicalFish {

    /**
     * @return the variant of the fish
     */
    public Variants getVariant();

    enum Size {
        SMALL(0),
        LARGE(1);

        final int id;

        private Size(int id) {
            this.id = id;
        }
    }

    enum Variants {
        KOB("kob", TropicalFish.Size.SMALL, 0),
        SUNSTREAK("sunstreak", TropicalFish.Size.SMALL, 1),
        SNOOPER("snooper", TropicalFish.Size.SMALL, 2),
        DASHER("dasher", TropicalFish.Size.SMALL, 3),
        BRINELY("brinely", TropicalFish.Size.SMALL, 4),
        SPOTTY("spotty", TropicalFish.Size.SMALL, 5),
        FLOPPER("flopper", TropicalFish.Size.LARGE, 0),
        STRIPEY("stripey", TropicalFish.Size.LARGE, 1),
        GLITTER("glitter", TropicalFish.Size.LARGE, 2),
        BLOCKFISH("blockfish", TropicalFish.Size.LARGE, 3),
        BETTY("betty", TropicalFish.Size.LARGE, 4),
        CLAYFISH("clayfish", TropicalFish.Size.LARGE, 5);

        private final String name;
        private final TropicalFish.Size size;
        private final int packedId;

        Variants(String name, TropicalFish.Size size, int packedId) {
            this.name = name;
            this.size = size;
            this.packedId = packedId;
        }

        public String getName() {
            return name;
        }

        public Size getSize() {
            return size;
        }

        public int getPackedId() {
            return packedId;
        }
    }
}
