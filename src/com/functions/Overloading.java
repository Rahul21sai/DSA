package com.functions;

public class Overloading {
    static void fun(int a ){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);


    }
    public static void main(String[] args) {
        fun(3);
        fun("rahul");

    }
}
