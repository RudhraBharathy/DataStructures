package com.DataStructures.Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        int x = 1234;
        System.out.println(sumofdigits(x));
    }

    public static int sumofdigits(int x){
        if (x==0) {
            return 0;
        }
        return sumofdigits(x/10) + x%10;
    }
}
