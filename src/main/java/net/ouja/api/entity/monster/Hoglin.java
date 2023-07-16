package net.ouja.api.entity.monster;

public interface Hoglin {

    /**
     * If enabled, the hoglin will be immune to zombification
     * @param zombification
     */
    public void setImmuneToZombification(boolean zombification);

    /**
     * @return if the hoglin is immune to zombification
     */
    public boolean isImmuneToZombification();

    /**
     * @return if the hoglin is currently converting into a zoglin
     */
    public boolean isConverting();
}
