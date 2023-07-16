package net.ouja.api.entity.neutral;

import com.google.common.collect.ImmutableList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public interface IronGolem {

    /**
     * @return if the creator of the golem was a player
     */
    public boolean isPlayerCreated();

    /**
     * @return the current crack state
     */
    public Crack getCrackiness();

    enum Crack {
        NONE(1.0F),
        LOW(0.75F),
        MEDIUM(0.5F),
        HIGH(0.25F);

        private static final List<IronGolem.Crack> BY_DAMAGE = Stream.of(values()).sorted(Comparator.comparingDouble(crack -> (double)crack.fraction)).collect(ImmutableList.toImmutableList());
        private final float fraction;

        Crack(float fraction) {
            this.fraction = fraction;
        }

        public static Crack byFraction(float fraction) {
            for(IronGolem.Crack irongolem$crackiness : BY_DAMAGE) {
                if (fraction < irongolem$crackiness.fraction) {
                    return irongolem$crackiness;
                }
            }

            return NONE;
        }
    }
}
