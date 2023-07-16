package net.ouja.api.entity.passive;

public interface Camel {

    /**
     * @return if the camel is sitting
     */
    public boolean isSitting();

    /**
     * @return if the camel is dashing
     */
    public boolean isDashing();

    /**
     * Sets the dashing state for the camel
     * @param dashing
     */
    public void setDashing(boolean dashing);

    /**
     * Sits the camel
     */
    public void sitDown();

    /**
     * Stands the camel
     */
    public void standUp();
}
