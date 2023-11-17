package net.ouja.api.world.item;

import net.ouja.api.network.chat.Component;

public interface ItemStack {

    /**
     * @return The item
     */
    public Item getItem();

    /**
     * Allows you to check if an ItemStack is the provided item
     * @param item
     * @return if the ItemStack is the same as the provided item
     */
    public boolean is(Item item);

    /**
     * @return the stack size of the item
     */
    public int getMaxStackSize();

    /**
     * @return if the item can be damaged
     */
    public boolean isDamageableItem();

    /**
     * @return if the item is currently damaged
     */
    public boolean isDamaged();

    /**
     * @return the damage value of the item
     */
    public int getDamageValue();

    /**
     * @param damageValue the new damage value for the item
     */
    public void setDamageValue(int damageValue);

    /**
     * @return the max damage value of the item
     */
    public int getMaxDamage();

    /**
     * Copies the ItemStack
     * @return the copied ItemStack
     */
    public ItemStack copy();

    /**
     * Copies the ItemStack and returns the provided amount of items
     * @param amount The amount of copied ItemStacks
     * @return the copied ItemStacks
     */
    public ItemStack copyWithCount(int amount);

    /**
     * @return the name of the item
     */
    public Component getHoverName();

    /**
     * @param component The new name
     */
    public void setHoverName(Component component);

    public void resetHoverName();

    public boolean hasCustomHoverName();

    /**
     * @return The name of the item
     */
    public Component getDisplayName();

    /**
     * @return the item count
     */
    public int getCount();

    /**
     * Sets the ItemStack count to the provided number
     * @param i The new ItemStack count
     */
    public void setCount(int i);
}
