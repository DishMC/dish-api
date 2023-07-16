package net.ouja.api.entity.neutral;

public interface Goat {

    /**
     * @return if the goat has it's left horn
     */
    public boolean hasLeftHorn();

    /**
     * @return if the goat has it's right horn
     */
    public boolean hasRightHorn();

    /**
     * Adds horns to the goat
     */
    public void addHorns();

    /**
     * Removes horns from the goat
     */
    public void removeHorns();

    /**
     * @return if the goat is the "Screaming Goat" variant
     */
    public boolean isScreamingGoat();
}
