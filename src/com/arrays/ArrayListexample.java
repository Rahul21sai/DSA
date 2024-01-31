package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList <Integer> list = new ArrayList<Integer>(10);
        list.add(34);
        list.add(42);
        list.add(34);
        list.add(3344);
        list.add(34);
        list.add(334224);
        list.add(334);
        list.add(3344);
        list.add(324);
        System.out.println(list);
        list.set(0, 99);
        list.remove(2);
        System.out.println(list);

        // input
        for (int i = 0; i <5 ; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here list[index] syntax will not work here

        }
        System.out.println(list);
    }
}
