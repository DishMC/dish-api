package net.ouja.api.entity.neutral;

public interface Bee extends NeutralMob {

    /**
     * @return if the bee has nectar in its inventory
     */
    public boolean hasNectar();

    /**
     * @return if the bee has stung an entity
     */
    public boolean hasStung();
}
