package net.ouja.api.network.chat;

import javax.annotation.Nullable;

public interface Style {
    public abstract boolean isBold();

    public abstract boolean isItalic();

    public abstract boolean isStrikethrough();

    public abstract boolean isUnderlined();

    public abstract boolean isObfuscated();

    public abstract boolean isEmpty();

    public Style withColor(@Nullable String textcolor);
}
