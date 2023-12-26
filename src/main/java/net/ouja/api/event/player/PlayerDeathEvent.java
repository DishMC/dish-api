package net.ouja.api.event.player;

import net.ouja.api.entity.Player;
import net.ouja.api.event.CancellableEvent;
import net.ouja.api.event.EventListener;
import net.ouja.api.network.chat.Component;
import net.ouja.api.world.DamageSource;
import net.ouja.api.world.level.block.BlockPos;

public class PlayerDeathEvent extends PlayerEvent implements EventListener, CancellableEvent {
    private boolean isCancelled = false;
    private final BlockPos deathLocation;
    private final DamageSource damageSource;
    private Component deathMessage;

    public PlayerDeathEvent(Player player, BlockPos deathLocation, DamageSource damageSource, Component deathMessage) {
        super(player);
        this.deathLocation = deathLocation;
        this.damageSource = damageSource;
        this.deathMessage = deathMessage;
    }

    public BlockPos getDeathLocation() {
        return deathLocation;
    }

    public DamageSource getDamageSource() {
        return damageSource;
    }

    public Component getDeathMessage() {
        return deathMessage;
    }

    public void setDeathMessage(Component component) {
        deathMessage = component;
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
