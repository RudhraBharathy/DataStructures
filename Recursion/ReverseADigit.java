package com.DataStructures.Recursion;

public class ReverseADigit {
    public static void main(String[] args) {
        int x = 1824;
        revOfNum(x);
    }

    private static void revOfNum(int x) {
        if (x==0){
            return;
        }
        System.out.print(x%10);
        revOfNum(x/10);
    }
}
