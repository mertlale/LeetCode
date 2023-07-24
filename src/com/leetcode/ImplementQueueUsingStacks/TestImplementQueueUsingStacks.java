package com.leetcode.ImplementQueueUsingStacks;

public class TestImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);

        System.out.println("Dequeue: " + myQueue.pop()); // Output: 1

        myQueue.push(4);

        System.out.println("Peek: " + myQueue.peek()); // Output: 2

        System.out.println("Is Empty: " + myQueue.empty()); // Output: false

        System.out.println("Dequeue: " + myQueue.pop()); // Output: 2
        System.out.println("Dequeue: " + myQueue.pop()); // Output: 3
        System.out.println("Dequeue: " + myQueue.pop()); // Output: 4

        System.out.println("Is Empty: " + myQueue.empty()); // Output: true
    }
}
