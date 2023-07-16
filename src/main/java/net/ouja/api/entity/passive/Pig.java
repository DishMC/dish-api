package net.ouja.api.entity.passive;

public interface Pig {

    /**
     * @return if the pig can be saddled
     */
    public boolean canSaddle();

    /**
     * @return if the pig is saddled
     */
    public boolean isSaddled();

    /**
     * Equips a saddle on the pig
     */
    public void equipSaddle();
}
