package net.ouja.api.world.level.block;

public interface Block {
    /**
     * @return the block position
     */
    public BlockPos getBlockPos();

    /**
     * @return the block type
     */
    public BlockTypes getType();
}
