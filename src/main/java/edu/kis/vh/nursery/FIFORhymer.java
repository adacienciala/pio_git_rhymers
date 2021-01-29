package edu.kis.vh.nursery;

import edu.kis.vh.nursery.memory.IntArrayStack;
import edu.kis.vh.nursery.memory.IntMemory;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final IntArrayStack temp = new IntArrayStack();

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(IntMemory intMemory) {
        super(intMemory);
    }

    // TODO use curly braces, even for oneliners - won't cause problems when different people look at the code
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
