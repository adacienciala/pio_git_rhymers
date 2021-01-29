package edu.kis.vh.nursery;

import edu.kis.vh.nursery.memory.IntArrayStack;
import edu.kis.vh.nursery.memory.IntMemory;

public class FIFORhymer extends DefaultCountingOutRhymer {

    // IntArrayStack is the best option here, looking at the type of operations.
    // We are performing a lot of accessing, no inserting in the middle.
    // Inserting in the middle or at the beginning would be LinkedList's edge.
    // With an array, we sacrifice dynamic-size over memory taken (Nodes take up space).
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
