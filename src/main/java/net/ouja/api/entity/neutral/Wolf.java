package net.ouja.api.entity.neutral;

public interface Wolf {

    /**
     * @return if the wolf is wet
     */
    public boolean isWet();

    /**
     * @return the wolf's tails angle
     */
    public float getTailAngle();

    /**
     * Context: Holding a piece of steak will make the wolf interested.
     * @return if the wolf is currently interested
     */
    public boolean isInterested();

    // todo: make getOwner
}
