package com.functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;

//        swap two numbers
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " "+ b);
        String name = "rahul";
        changename(name);
        System.out.println(name);
    }

    static void changename(String nam) {
        nam = "rohith";//creating the new object so name will not change
    }

    static void swap(int a , int b){
        int temp = a ;
        a = b ;
        b = temp;
    }
}
