package edu.kis.vh.nursery.memory;

public interface IntMemory {

    int DEFAULT = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
