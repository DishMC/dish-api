package net.ouja.api.event.entity;

import net.ouja.api.Entity;
import net.ouja.api.event.EventListener;
import net.ouja.api.network.chat.Component;
import net.ouja.api.world.DamageSource;
import net.ouja.api.world.level.block.BlockPos;

/**
 * This is fired every time an entity is killed.
 * This can be used to check when a player has killed an entity.
 * <pre>{@code
 *   ...
 *   Entity entity = event.getDamageSource().getDirectEntity();
 *   if (entity instanceof Player player) {
 *       ...
 *   }
 *   ...
 * }</pre>
 *
 * For tracking player deaths use {@link net.ouja.api.event.player.PlayerDeathEvent}
 */
public class EntityDeathEvent extends EntityEvent implements EventListener {
    private final BlockPos deathLocation;
    private final DamageSource damageSource;
    private Component deathMessage;

    public EntityDeathEvent(Entity entity, BlockPos deathLocation, DamageSource damageSource, Component deathMessage) {
        super(entity);
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
}
