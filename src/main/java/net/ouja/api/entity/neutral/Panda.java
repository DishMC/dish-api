package net.ouja.api.entity.neutral;

public interface Panda {

    /**
     * @return if the panda is sitting
     */
    public boolean isSitting();

    /**
     * @return if the panda is sneezing
     */
    public boolean isSneezing();

    /**
     * @return if the panda is it's back
     */
    public boolean isOnBack();

    /**
     * @return if the panda is eating
     */
    public boolean isEating();

    /**
     * @return if the panda is rolling
     */
    public boolean isRolling();

    /**
     * Make the panda sneeze
     * @param sneeze
     */
    public void sneeze(boolean sneeze);
}
