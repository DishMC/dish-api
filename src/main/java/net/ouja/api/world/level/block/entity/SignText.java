package net.ouja.api.world.level.block.entity;

import net.ouja.api.network.chat.Component;

public interface SignText {

    /**
     * Gets the text of the sign
     * @param filtered If true, this will return the filtered messages.
     */
    public Component[] getText(boolean filtered);

    /**
     * @return if the text is glowing
     */
    public boolean isGlowing();

    /**
     * Sets the text glowing based on the given parameter
     * @param glowing What makes the text glow
     */
    public void setGlowing(boolean glowing);

    /**
     * Sets the text of the sign
     * @param i the line #
     * @param message the message
     */
    public void setMessage(int i, Component message);

    /**
     * Sets the text of the sign
     * @param i the line #
     * @param message the message
     * @param filteredMessage the filtered version of the message
     */
    public void setMessage(int i, Component message, Component filteredMessage);
}
