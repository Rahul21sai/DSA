package com.strings_21;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args){
        System.out.println('a' + 'b');//it is a charcter // it takes the asic values and give the number as output
        System.out.println("a" + "b"); // it a string
        System.out.println((char)('a'+ 3));
        System.out.println("a" + 1);
        // this is same as after a fwe steps :"a" + "1"
        // inetger will be  converted to Integer that will call toString()
        //1 is converted to wrapper class Integer so we get output as a1
        System.out.println("rahul" + new ArrayList<>()); // it calls toString
        System.out.println("rahul"+new Integer(54));
        // + is only used for primitives and any pne value is strings
        System.out.println(new Integer(56)+ ""+ new ArrayList<>()); //in middle one should be string type//answers is of type string
        System.out.println("a" +'b');
    }
}
