package net.ouja.api.entity.passive;

public interface Horse {

    /**
     * @return the variant of the horse
     */
    public HorseTypes getVariant();

    /**
     * @return the markings on the horse
     */
    public HorseMarkings getMarkings();
}
