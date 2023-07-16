package net.ouja.api.entity.neutral;

public interface Piglin {

    /**
     * @return if the piglin can hunt or not
     */
    public boolean canHunt();

    /**
     * sets if the piglin can hunt
     * @param canHunt
     */
    public void setCanHunt(boolean canHunt);

    /**
     * @return if the piglin is dancing
     */
    public boolean isDancing();

    /**
     * sets the dancing state for the piglin
     * @param dancing
     */
    public void setDancing(boolean dancing);
}
