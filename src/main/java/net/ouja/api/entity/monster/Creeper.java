package net.ouja.api.entity.monster;

public interface Creeper {

    /**
     * @return if the creeper is a charged creeper
     */
    public boolean isCharged();

    /**
     * @return if the creeper is currently ignited
     */
    public boolean isIgnited();

    /**
     * Ignites the creeper
     */
    public void ignite();
}
