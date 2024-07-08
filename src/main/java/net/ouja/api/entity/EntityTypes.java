package net.ouja.api.entity;

import net.ouja.api.entity.boss.*;
import net.ouja.api.entity.monster.*;
import net.ouja.api.entity.neutral.*;
import net.ouja.api.entity.passive.*;

    /**
     * Entity typeIds are gathered from the List of mobs https://minecraft.wiki/w/Mob
     */
public enum EntityTypes {
    ALLAY("allay", Allay.class),
    ARMADILLO("armaillo", Armadillo.class),
    AXOLOTL("axolotl", Axolotl.class),
    BAT("bat", Bat.class),
    BEE("bee", Bee.class),
    BLAZE("blaze", Blaze.class),
    BOGGED("bogged", Bogged.class),
    BREEZE("breeze", Breeze.class),
    CAMEL("camel", Camel.class),
    CAT("cat", Cat.class),
    CAVE_SPIDER("cave_spider", CaveSpider.class),
    CHICKEN("chicken", Chicken.class),
    COD("cod", Cod.class),
    COW("cow", Cow.class),
    CREEPER("creeper", Creeper.class),
    DOLPHIN("dolphin", Dolphin.class),
    DONKEY("donkey", Donkey.class),
    DROWNED("drowned", Drowned.class),
    ELDER_GUARDIAN("elder_guardian", ElderGuardian.class),
    ENDERMAN("enderman", Enderman.class),
    ENDERMITE("endermite", Endermite.class),
    ENDER_DRAGON("ender_dragon", EnderDragon.class),
    EVOKER("evoker", Evoker.class),
    FOX("fox", Fox.class),
    FROG("frog", Frog.class),
    GHAST("ghast", Ghast.class),
    GLOW_SQUID("glow_squid", GlowSquid.class),
    GOAT("goat", Goat.class),
    GUARDIAN("guardian", Guardian.class),
    HOGLIN("higlin", Hoglin.class),
    HORSE("horse", Horse.class),
    HUSK("husk", Husk.class),
    IRON_GOLEM("iron_golem", IronGolem.class),
    LLAMA("llama", Llama.class),
    MAGMA_CUBE("magma_cube", MagmaCube.class),
    MOOSHROOM("mooshroom", MooshroomCow.class),
    OCELOT("ocelot", Ocelot.class),
    PANDA("panda", Panda.class),
    PARROT("parrot", Parrot.class),
    PHANTOM("phantom", Phantom.class),
    PIG("pig", Pig.class),
    PIGLIN("piglin", Piglin.class),
    PIGLIN_BRUGE("piglin_brute", PiglinBrute.class),
    PILLAGER("pillager", Pillager.class),
    PLAYER("player", Player.class),
    POLAR_BEAR("polar_bear", PolarBear.class),
    PUFFERFISH("pufferfish", Pufferfish.class),
    RABBIT("rabbit", Rabbit.class),
    RAVAGER("ravager", Ravager.class),
    SALMON("salmon", Salmon.class),
    SHEEP("sheep", Sheep.class),
    SHULKER("shulker", Shulker.class),
    SILVERFISH("silverfish", Silverfish.class),
    SKELETON("skeleton", Skeleton.class),
    SKELETON_HORSE("skeleton_horse", SkeletonHorse.class),
    SLIME("slime", Slime.class),
    SNIFFER("sniffer", Sniffer.class),
    SNOW_GOLEM("snow_golem", SnowGolem.class),
    SPIDER("spider", Spider.class),
    SQUID("squid", Squid.class),
    STRAY("stray", Stray.class),
    STRIDER("strider", Strider.class),
    TADPOLE("tadpole", Tadpole.class),
    TRADER_LLAMA("trader_llama", TraderLlama.class),
    TROPICAL_FISH("tropical_fish", TropicalFish.class),
    TURTLE("turtle", Turtle.class),
    VEX("vex", Vex.class),
    VILLAGER("villager", Villager.class),
    VINDICATOR("vindicator", Vindicator.class),
    WANDERING_TRADER("wandering_trader", WanderingTrader.class),
    WARDEN("warden", Warden.class),
    WITCH("witch", Witch.class),
    WITHER("wither", Wither.class),
    WITHER_SKELETON("wither_skeleton", WitherSkeleton.class),
    WOLF("wolf", Wolf.class),
    ZOGLIN("zoglin", Zoglin.class),
    ZOMBIE("zombie", Zombie.class),
    ZOMBIE_HORSE("zombie_horse", ZombieHorse.class),
    ZOMBIE_VILLAGER("zombie_villager", ZombieVillager.class),
    ZOMBIFIED_PIGLIN("zombified_piglin", ZombifiedPiglin.class);

    private String name;
    private Class clazz;

    private EntityTypes(String name, Class clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public Class getEntityClass() {
        return clazz;
    }
}
