package com.DataStructures.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 4;
        int val = fibonacci(6);
        System.out.println(val);
    }

    private static int fibonacci(int i) {
        if (i < 2){
            return i;
        }
        return fibonacci(i-1) + fibonacci(i-2);
    }
}
