package net.ouja.api.event.player;

import net.ouja.api.Player;
import net.ouja.api.entity.ItemEntity;
import net.ouja.api.event.EventListener;

/**
 * This is called every single time a player is attempting to pick up an item. Probably can cause performance issues if developed improper
 * This event may not stay
 */
public class PlayerAttemptPickUpItem extends PlayerEvent implements EventListener {
    private final ItemEntity itemEntity;

    public PlayerAttemptPickUpItem(Player player, ItemEntity itemEntity) {
        super(player);
        this.itemEntity = itemEntity;
    }

    public ItemEntity getItemEntity() {
        return itemEntity;
    }
}
