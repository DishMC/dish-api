package net.ouja.api.world.level.chunk;

import net.ouja.api.world.Level;

public class ChunkPos {
    private final int x;
    private final int z;
    private final Level level;

    public ChunkPos(int x, int z, Level level) {
        this.x = x;
        this.z = z;
        this.level = level;
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }

    public Level getLevel() {
        return level;
    }

    public int getBlockX() {
        return (this.x << 4) + this.x;
    }

    public int getBlockZ() {
        return (this.z << 4) + this.z;
    }

    public String toString() {
        return String.format("%s[%s, %s]", this.getLevel().getName(), this.getX(), this.getZ());
    }
}
