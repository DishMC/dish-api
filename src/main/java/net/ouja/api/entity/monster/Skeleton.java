package net.ouja.api.entity.monster;

public interface Skeleton {

    /**
     * @return if the skeleton is converting into a stray
     */
    public boolean isShaking();

    /**
     * Sets the shaking state for the skeleton
     * @param shaking
     */
    public void setShaking(boolean shaking);
}
