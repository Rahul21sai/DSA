package com.strings_21;

public class comparsion {
    public static void main(String[] args) {


        String name1 = new String("rahul");
        String name2 = new String("rahul");
        System.out.println(name1 == name2);// diiferernt pool so flase// comparison
        System.out.println(name1.equals(name2));//method

        System.out.println(name1.charAt(0));
    }
}
