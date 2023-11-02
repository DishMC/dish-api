package net.ouja.api.world.level.block;

import net.ouja.api.world.level.block.entity.SignText;

public interface SignBlock {

    /**
     * @return if the sign is a wall sign
     */
    public boolean isWallSign();

    /**
     * @return if the sign is a hanging sign
     */
    public boolean isHangingSign();

    /**
     * @return the front text
     */
    public SignText getFrontText();

    /**
     * @return the back text
     */
    public SignText getBackText();

    /**
     * @return if the sign is waxed
     */
    public boolean isWaxed();

    /**
     * Sets the waxed state of the sign
     */
    public void setWaxed(boolean waxed);
}
