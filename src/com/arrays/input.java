package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 230000;
//        arr[2] = 23000;
//        arr[3] = 2300;
//        arr[4] = 230;
//        System.out.println(arr[4]);
//
////        input using for loops
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+ " ");
//
//        }
//        for (int num: arr) {//for every element in the array print the element
//            System.out.println(num + " ");// here num represnets element of the array
//        }
        // arrays of objects - use heap memory
        String[] str = new String[4];
        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "rahul";
        System.out.println(Arrays.toString(str));


    }
}
