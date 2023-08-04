package com.DataStructures.Stack;

public class StackOperations {
    int[] arr;
    int top = 0;

    public StackOperations(int size) {
        this.arr = new int[size];
    }

    public void push(int val){
        if (isFull()) {
            System.out.println("The Stack Overflow!!");
            return;
        }
        else{
            arr[top] = val;
            top++;
        }

    }
    public void pop(){
        if (isEmpty()){
            System.out.println("The Stack Underflow!!");
            return;
        }
        else{
            System.out.println(arr[top-1] + " : Poped!!");
            top--;
        }
    }

    public int top(){
        if (isEmpty()) {
            System.out.println("The Stack is Empty!!");
        }
        return arr[top-1];
    }

    private boolean isEmpty() {
        if (top==0) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean isFull() {
        if (top == arr.length) {
            return true;
        }
        else {
            return false;
        }
    }

    public void show(){
        for (int i = 0; i < top; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Stack Size : " + top);
    }
}
