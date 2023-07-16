package net.ouja.api.entity.monster;

public interface Ghast {

    /**
     * @return if the ghast is charged
     */
    public boolean isCharged();

    /**
     * Sets the charged state for the ghast
     * @param charged
     */
    public void setCharged(boolean charged);
}
