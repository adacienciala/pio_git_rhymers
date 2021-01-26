package edu.kis.vh.nursery.memory;

public class IntLinkedList implements IntMemory {

    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        protected Node(int i) {
            this.value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node last;
    private int i;
    private int size = 0;

    @Override
    public void push(int i) {
        if (last == null) last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
        size++;
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    @Override
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        size--;
        return ret;
    }

    @Override
    public int getTotal() {
        return size;
    }

}
