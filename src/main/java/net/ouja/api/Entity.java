package net.ouja.api;

import net.ouja.api.entity.EntityTypes;

import java.util.UUID;

public interface Entity {
    /**
     * @return the entities id
     */
    public int getId();

    /**
     * @return the entity
     */
    public Entity getEntity();

    /**
     * @return the type of the entity
     */
    public EntityTypes getType();

    /**
     * @return if the entity is silent
     */
    public boolean isSilent();

    /**
     * Sets the entity silent or not
     * @param silent
     */
    public void setSilent(boolean silent);

    /**
     * @return the UUID of the entity
     */
    public UUID getUUID();
}