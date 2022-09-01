package com.bridgelabz.stackandqueues.stacks;

import com.bridgelabz.stackandqueues.linkedlist.LinkedList;

public class Queues<T> {
    LinkedList<T> linkedList;

    public Queues() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueu(T key) {
        linkedList.add(key);
    }
    public void print() {
        linkedList.display();
    }

}
