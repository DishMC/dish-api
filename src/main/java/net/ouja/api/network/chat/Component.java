package net.ouja.api.network.chat;

import org.jetbrains.annotations.NotNull;

public interface Component {

    @NotNull
    static Component literal(String s) {
        return new MutableComponent(s);
    }

    @NotNull
    static Component create(String s, boolean bold, boolean underlined, boolean strikethrough, boolean italic) {
        return new MutableComponent(s).setBold(bold).setUnderlined(underlined).setStrikeThrough(strikethrough).setItalic(italic);
    }

    /**
     * @return Gets the string of the chat component
     */
    @NotNull
    public String getString();

    public boolean isBold();

    public boolean isUnderlined();

    public boolean isStrikeThrough();

    public boolean isItalic();

    /**
     * @return the color for the component message
     */
    public String getColor();

    public Component setBold(Boolean b);

    public Component setUnderlined(Boolean b);

    public Component setStrikeThrough(Boolean b);

    public Component setItalic(Boolean b);

    /**
     * Sets the colour of the component message
     */
    public Component setColor(String s);
}
