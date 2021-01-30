package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Factory of the Rhymers. Implements Rhymersfactory
 */
public class DefaultRhymersFactory implements Rhymersfactory {

    /**
     * Creates and returns a DefaultCountingRhymer
     * @return DefaultCountingRhymer object
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Creates and returns a FalseRhymer
     * @return DefaultCountingRhymer object
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() { return new DefaultCountingOutRhymer(); }

    /**
     * Creates and returns a FIFORhymer
     * @return FIFORhymer object wrapped as DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * Creates and returns a HanoiRhymer
     * @return HanoiRhymer object wrapped as DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
