package com.Bitwise_25;

public class Powoftwo {
    public static void main(String[] args) {
        int n = 31;
        boolean ans = (n&(n-1)) == 0;
        System.out.println(ans);
    }
}
