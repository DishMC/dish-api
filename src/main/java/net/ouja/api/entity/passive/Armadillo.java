package net.ouja.api.entity.passive;

public interface Armadillo {

    /**
     * @return if the armadillo is scared
     */
    public boolean isScared();

    /**
     * Sets the scared state of the armadillo
     * @param scared
     */
    public void setScared(boolean scared);

    /**
     * Make the armadillo roll into it's shell
     */
    public void rollUp();

    /**
     * Make the armadillo roll outside it's shell
     */
    public void rollOut();
}
