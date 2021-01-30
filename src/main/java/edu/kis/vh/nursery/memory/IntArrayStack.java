package edu.kis.vh.nursery.memory;

public class IntArrayStack implements IntMemory {

    public static final int MAX_SIZE = 12;
    public static final int FULL = MAX_SIZE-1;
    public static final int INITIAL = -1;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = INITIAL;

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == INITIAL;
    }

    @Override
    public void push(int i) {
        countIn(i);
    }

    @Override
    public boolean isEmpty() {
        return callCheck();
    }

    public boolean isFull() {
        return total == FULL;
    }

    @Override
    public int top() {
        return peekaboo();
    }

    @Override
    public int pop() {
        return countOut();
    }

    protected int peekaboo() {
        if (callCheck()) {
            return DEFAULT;
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return DEFAULT;
        }
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
