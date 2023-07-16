package net.ouja.api.entity.passive;

public interface Axolotl {
    /**
     * @return the axolotl variant
     */
    public String getVariant();

    /**
     * @return if the axolotl came from a bucket
     */
    public boolean isFromBucket();
}
