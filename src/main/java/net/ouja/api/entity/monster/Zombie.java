package net.ouja.api.entity.monster;

public interface Zombie {

    /**
     * @return if the zombie is converting into a drowned
     */
    public boolean isConverting();

    /**
     * @return if the zombie can break doors
     */
    public boolean canBreakDoors();

    /**
     * Sets the canBreakDoors state on the zombie
     * @param breakDoors
     */
    public void setCanBreakDoors(boolean breakDoors);
}
