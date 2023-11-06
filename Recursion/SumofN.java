package com.DataStructures.Recursion;

public class SumofN {
    public static void main(String[] args) {
        int x = -3;
        int val = sum(x);
        System.out.println(val);
    }

    private static int sum(int x) {
        if (x<=0){
            return 0;
        }
        return sum(x-1) + x;
    }
}
