package com.leetcode.ImplementQueueUsingStacks;

import java.util.Stack;

/* Use to stacks to convert stack's LIFO to FIFO when push() an element
Other functions will be the same with stack's after modifying push() function
*/
public class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public MyQueue() {
        this.stackIn = new Stack<>();
        this.stackOut = new Stack<>();
    }

    public void push(int x) {

        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }

        stackIn.push(x);

        while (!stackOut.isEmpty()) {
            stackIn.push(stackOut.pop());
        }
    }

    public int pop() {
        return stackIn.pop();
    }

    public int peek() {
        return stackIn.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty();
    }
}
