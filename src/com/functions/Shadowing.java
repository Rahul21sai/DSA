package com.functions;

public class Shadowing {
    static int x = 90;// this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
        // scope value will begin when value os initialised
        int x = 40;
        System.out.println(x);//40


        fun();

    }

    static void fun() {
        System.out.println(x);//90
    }

}
