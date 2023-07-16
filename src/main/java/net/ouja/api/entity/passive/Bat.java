package net.ouja.api.entity.passive;

public interface Bat {

    /**
     * @return the resting state of the bat
     */
    public boolean isResting();

    /**
     * sets the resting state of the bat
     * @param resting
     */
    public void setResting(boolean resting);
}
