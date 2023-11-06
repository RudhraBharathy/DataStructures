package com.DataStructures.Recursion;

public class MultipyofN {
    public static void main(String[] args) {
        int x = 0;
        int val = multiply(x);
        System.out.println(val);
    }

    private static int multiply(int x) {
        if (x<=1){
            return 1;
        }
        return multiply(x-1) * x;
    }
}
