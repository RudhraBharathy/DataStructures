package com.DataStructures.Queue;

public class Main {
    public static void main(String[] args) {
        QueueOperations queue = new QueueOperations(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.show();
        System.out.println(queue.peek());
        System.out.println(queue.rear());


    }
}
