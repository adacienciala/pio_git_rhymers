package edu.kis.vh.nursery;

import edu.kis.vh.nursery.memory.IntMemory;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public HanoiRhymer() {
        super();
    }

    public HanoiRhymer(IntMemory intMemory) {
        super(intMemory);
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        }
        else {
            super.countIn(in);
        }
    }
}
