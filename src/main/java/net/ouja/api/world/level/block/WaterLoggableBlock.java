package net.ouja.api.world.level.block;

public interface WaterLoggableBlock extends Block {

    /**
     * If the block is waterlogged
     * @return true if it's waterlogged
     */
    public boolean isWaterLogged();
}
