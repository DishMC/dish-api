package net.ouja.api.event.player;

import net.ouja.api.entity.Player;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;
import net.ouja.api.world.level.block.Block;
import net.ouja.api.world.level.block.BlockPos;

/**
 * This is fired when a player places a block. It will not be fired if the block is disabled by vanilla enabled_features or if the block can't be placed in the first place.
 */
public class PlayerPlaceBlockEvent extends PlayerEvent implements EventListener, CancellableEvent {
    private boolean isCancelled = false;
    private final Block block;
    private final BlockPos blockPos;

    public PlayerPlaceBlockEvent(Player player, Block block, BlockPos blockPos) {
        super(player);
        this.block = block;
        this.blockPos = blockPos;
    }

    public Block block() {
        return block;
    }

    public BlockPos getBlockPos() {
        return blockPos;
    }

    /**
     * Controls whether the event will be cancelled or not
     */
    @Override
    public void setCancel(boolean cancel) {
        this.isCancelled = cancel;
    }

    /**
     * @return the cancelled state
     */
    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }
}
