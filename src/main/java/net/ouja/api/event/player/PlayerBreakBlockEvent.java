package net.ouja.api.event.player;

import net.ouja.api.entity.Player;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;
import net.ouja.api.world.level.block.Block;

public class PlayerBreakBlockEvent extends PlayerEvent implements EventListener, CancellableEvent {
    private boolean isCancelled = false;
    private final Block block;

    public PlayerBreakBlockEvent(Player player, Block block) {
        super(player);
        this.block = block;
    }

    public Block block() {
        return block;
    }

    @Override
    public void setCancel(boolean cancel) {
        this.isCancelled = cancel;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }
}
