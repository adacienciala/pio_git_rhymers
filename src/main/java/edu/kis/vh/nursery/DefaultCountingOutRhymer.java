package edu.kis.vh.nursery;

import edu.kis.vh.nursery.memory.IntArrayStack;
import edu.kis.vh.nursery.memory.IntMemory;

public class DefaultCountingOutRhymer {

    private final IntMemory intMemory;

    public DefaultCountingOutRhymer(IntMemory intMemory) {
        this.intMemory = intMemory;
    }

    public DefaultCountingOutRhymer() {
        this.intMemory = new IntArrayStack();
    }

    public void countIn(int in) {
        intMemory.push(in);
    }

    public boolean callCheck() {
        return intMemory.isEmpty();
    }

    public boolean isFull() {
        return intMemory.isFull();
    }

    protected int peekaboo() {
        return intMemory.top();
    }

    public int countOut() {
        return intMemory.pop();
    }

    public int getTotal() {
        return intMemory.getTotal();
    }
}
