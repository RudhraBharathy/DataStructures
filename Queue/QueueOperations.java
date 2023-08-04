package com.DataStructures.Queue;

public class QueueOperations {
    int[] arr;

    int front = 0;
    int rear = 0;

    public QueueOperations(int size) {
        this.arr = new int[size];
    }

    public void enqueue(int val){
        if (isFull()) {
            System.out.println("The Queue is full!!");
            return;
        }
        else{
            arr[rear] = val;
            rear++;
        }
    }

    public void dequeue(){
        if ((isEmpty())) {
            System.out.println("The Queue is Empty!!");
            return;
        }
        else{
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
        }
    }

    public int peek(){
        return arr[front];
    }
    public int rear(){
        return arr[rear-1];
    }
    private boolean isEmpty() {
        if (rear == 0 && front == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean isFull() {
        if (rear == arr.length) {
            return true;
        }
        else {
            return false;
        }
    }

    public void show(){
        for (int i = 0; i < rear; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Queue Size : " + rear);
    }
}
