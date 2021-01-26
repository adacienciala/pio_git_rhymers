package edu.kis.vh.nursery.memory;

public interface IntMemory {

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
