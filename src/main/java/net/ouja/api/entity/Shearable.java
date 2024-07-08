package net.ouja.api.entity;

public interface Shearable {
  /**
   * @return if the entity is sheared
   */
  public boolean isSheared();

  /**
   * Sets the entities sheared state
   * @param sheared
   */
  public void setSheared(boolean sheared);
}
