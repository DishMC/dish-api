package net.ouja.api.entity;

import net.ouja.api.entity.monster.*;
import net.ouja.api.entity.neutral.*;
import net.ouja.api.entity.passive.*;

public enum EntityTypes {
    /**
     * Entity typeIds are gathered from the List of mobs https://minecraft.fandom.com/wiki/Mob
     */
    ALLAY("allay", Allay.class, 0),
    AXOLOTL("axolotl", Axolotl.class, 1),
    BAT("bat", Bat.class, 2),
    CAMEL("camel", Camel.class, 3),
    CAT("cat", Cat.class, 4),
    CHICKEN("chicken", Chicken.class, 5),
    COD("cod", Cod.class, 6),
    COW("cow", Cow.class, 7),
    DONKEY("donkey", Donkey.class, 8),
    FOX("fox", Fox.class, 9),
    FROG("frog", Frog.class, 10),
    GLOW_SQUID("glow_squid", GlowSquid.class, 11),
    HORSE("horse", Horse.class, 12),
    MOOSHROOM("mooshroom", MooshroomCow.class, 13),
    OCELOT("ocelot", Ocelot.class, 14),
    PARROT("parrot", Parrot.class, 15),
    PIG("pig", Pig.class, 16),
    PUFFERFISH("pufferfish", Pufferfish.class, 17),
    RABBIT("rabbit", Rabbit.class, 18),
    SALMON("salmon", Salmon.class, 19),
    SHEEP("sheep", Sheep.class, 20),
    SKELETON_HORSE("skeleton_horse", SkeletonHorse.class, 21),
    SNIFFER("sniffer", Sniffer.class, 22),
    SNOW_GOLEM("snow_golem", SnowGolem.class, 23),
    SQUID("squid", Squid.class, 24),
    STRIDER("strider", Strider.class, 25),
    TADPOLE("tadpole", Tadpole.class, 26),
    TROPICAL_FISH("tropical_fish", TropicalFish.class, 27),
    TURTLE("turtle", Turtle.class, 28),
    VILLAGER("villager", Villager.class, 29),
    WANDERING_TRADER("wandering_trader", WanderingTrader.class, 30),
    BEE("bee", Bee.class, 31),
    CAVE_SPIDER("cave_spider", CaveSpider.class, 32),
    DOLPHIN("dolphin", Dolphin.class, 33),
    ENDERMAN("enderman", Enderman.class, 34),
    GOAT("goat", Goat.class, 35),
    IRON_GOLEM("iron_golem", IronGolem.class, 36),
    LLAMA("llama", Llama.class, 37),
    PANDA("panda", Panda.class, 38),
    PIGLIN("piglin", Piglin.class, 39),
    POLAR_BEAR("polar_bear", PolarBear.class, 40),
    SPIDER("spider", Spider.class, 41),
    TRADER_LLAMA("trader_llama", TraderLlama.class, 42),
    WOLF("wolf", Wolf.class, 43),
    ZOMBIFIED_PIGLIN("zombified_piglin", ZombifiedPiglin.class, 44),
    BLAZE("blaze", Blaze.class, 45),
    CREEPER("creeper", Creeper.class, 46),
    DROWNED("drowned", Drowned.class, 47),
    ELDER_GUARDIAN("elder_guardian", ElderGuardian.class, 48),
    ENDERMITE("endermite", Endermite.class, 49),
    EVOKER("evoker", Evoker.class, 50),
    GHAST("ghast", Ghast.class, 51),
    GUARDIAN("guardian", Guardian.class, 52),
    HOGLIN("higlin", Hoglin.class, 53),
    HUSK("husk", Husk.class, 54),
    MAGMA_CUBE("magma_cube", MagmaCube.class, 55),
    PHANTOM("phantom", Phantom.class, 56),
    PIGLIN_BRUGE("piglin_brute", PiglinBrute.class, 57),
    PILLAGER("pillager", Pillager.class, 58),
    RAVAGER("ravager", Ravager.class, 59),
    SHULKER("shulker", Shulker.class, 60),
    SILVERFISH("silverfish", Silverfish.class, 61),
    SKELETON("skeleton", Skeleton.class, 62),
    SLIME("slime", Slime.class, 63),
    STRAY("stray", Stray.class, 64),
    VEX("vex", Vex.class, 65),
    VINDICATOR("vindicator", Vindicator.class, 66),
    WARDEN("warden", Warden.class, 67),
    WITCH("witch", Witch.class, 68),
    WITHER_SKELETON("wither_skeleton", WitherSkeleton.class, 69),
    ZOGLIN("zoglin", Zoglin.class, 70),
    ZOMBIE("zombie", Zombie.class, 71),
    ZOMBIE_HORSE("zombie_horse", ZombieHorse.class, 72),
    ZOMBIE_VILLAGER("zombie_villager", ZombieVillager.class, 73);

    private String name;
    private Class clazz;
    private int typeId;

    private EntityTypes(String name, Class clazz, Integer typeId) {
        this.name = name;
        this.clazz = clazz;
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public Class getEntityClass() {
        return clazz;
    }

    public int getTypeId() {
        return typeId;
    }
}
