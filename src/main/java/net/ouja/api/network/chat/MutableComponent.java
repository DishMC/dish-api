package net.ouja.api.network.chat;

import org.jetbrains.annotations.NotNull;

public class MutableComponent implements Component {
    private final String contents;
    private String color = "#ffffff"; // default vanilla color code
    private boolean bold = false;
    private boolean underlined = false;
    private boolean strikethrough = false;
    private boolean italic = false;

    public MutableComponent(String contents) {
        this.contents = contents;
    }

    @Override
    public @NotNull String getString() {
        return this.contents;
    }

    @Override
    public boolean isBold() {
        return this.bold;
    }

    @Override
    public boolean isUnderlined() {
        return this.underlined;
    }

    @Override
    public boolean isStrikeThrough() {
        return this.strikethrough;
    }

    @Override
    public boolean isItalic() {
        return this.italic;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Component setBold(Boolean b) {
        this.bold = b;
        return this;
    }

    @Override
    public Component setUnderlined(Boolean b) {
        this.underlined = b;
        return this;
    }

    @Override
    public Component setStrikeThrough(Boolean b) {
        this.strikethrough = b;
        return this;
    }

    @Override
    public Component setItalic(Boolean b) {
        this.italic = b;
        return this;
    }

    @Override
    public Component setColor(String s) {
        this.color = s;
        return this;
    }
}
