package net.ouja.api.entity.passive;

public interface Turtle {

    /**
     * @return if the turtle has layed eggs
     */
    public boolean hasEgg();

    /**
     * @return if the turtle is currently laying an egg
     */
    public boolean isLayingEgg();
}
