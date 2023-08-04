package com.DataStructures.Array;


public class Main {
    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations();
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        arr.insert(60);
        arr.insert(70,2);
        arr.remove(2);
        arr.show();

    }
}
