package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int MAX_SIZE = 12;
    public static final int FULL = MAX_SIZE-1;
    public static final int INITIAL = -1;
    public static final int DEFAULT = -1;

    private final int[] numbers = new int[MAX_SIZE];
    public int total = INITIAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }
}