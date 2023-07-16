package net.ouja.api.entity.passive;

public interface Strider {

    /**
     * @return if the strider can be saddled
     */
    public boolean canSaddle();

    /**
     * @return if the strider is saddled
     */
    public boolean isSaddled();

    /**
     * Equips a saddle on the strider
     */
    public void equipSaddle();
}
