package com.bridgelabz.stackandqueues.stacks;


import java.util.LinkedList;

public class Stack<T> {

    LinkedList<T> linkedList;

    public Stack() {
        this.linkedList = new LinkedList<>();
    }


    public void push(T key) {
        linkedList.push(key);
    }


    public void print(){
        linkedList.display();
    }

    public T pop() {
        return linkedList.pop();
    }
}
