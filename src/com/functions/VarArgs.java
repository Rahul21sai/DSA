package com.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun(1,2,3,4,5,54,6,53,5,45,3);
        multiple(1,3,"rahul");
        demo(124,323);
    }
    static void multiple(int a ,int b , String ...v){

    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
