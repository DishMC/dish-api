package net.ouja.api.event.player;

import net.ouja.api.entity.Player;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;
import net.ouja.api.world.level.block.BlockPos;

public class PlayerSleepEvent extends PlayerEvent implements EventListener, CancellableEvent {
    private boolean isCancelled = false;
    private final BlockPos blockPos;
    private boolean canSleepWhileMonstersAreNear = false;

    public PlayerSleepEvent(Player player, BlockPos blockPos) {
        super(player);
        this.blockPos = blockPos;
    }

    public BlockPos getBlockPos() {
        return blockPos;
    }

    /**
     * Set if the player can sleep while there are monsters near
     * @param b
     */
    public void setCanSleepWhileMonstersAreNear(boolean b) {
        this.canSleepWhileMonstersAreNear = b;
    }

    /**
     * If this is true, the player can sleep while there are monsters near
     * @return if sleep is allowed near monsters
     */
    public boolean canSleepWhileMonstersAreNear() {
        return this.canSleepWhileMonstersAreNear;
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
