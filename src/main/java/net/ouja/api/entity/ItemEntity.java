package net.ouja.api.entity;

import net.ouja.api.world.item.ItemStack;

import java.util.UUID;

public class ItemEntity {
    private final ItemStack itemStack;
    private final int pickUpDelay;
    private final int age;
    private final Entity cachedThrower;
    private final UUID thrower;

    public ItemEntity(ItemStack itemStack, int pickUpDelay, int age, Entity cachedThrower, UUID thrower) {
        this.itemStack = itemStack;
        this.pickUpDelay = pickUpDelay;
        this.age = age;
        this.cachedThrower = cachedThrower;
        this.thrower = thrower;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public int getPickUpDelay() {
        return pickUpDelay;
    }

    public int getAge() {
        return age;
    }

    public Entity getCachedThrower() {
        return cachedThrower;
    }

    public UUID getThrower() {
        return thrower;
    }
}
