package net.ouja.api.entity.passive;

public interface Cat {
    /**
     * @return the breed of the cat
     */
    public String getBreed();

    /**
     * @return if the cat is laying down
     */
    public boolean isLaying();

    /**
     * Call this event to make the cat hiss!
     */
    public void hiss();

    /**
     * Call this method to set the cat's laying state
     * @param laying
     */
    public void setLaying(boolean laying);
}
