package net.ouja.api.world.level.block;

import net.ouja.api.world.Level;

public class BlockPos {
    private final int x;
    private final int y;
    private final int z;
    private final Level level;

    public BlockPos(int x, int y, int z, Level level) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.level = level;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Level getLevel() {
        return level;
    }
}
