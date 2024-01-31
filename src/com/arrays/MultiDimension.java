package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1 2 5
        3 5 8
        2 5 6
         */
//        int[][] arr = new int[3][];

//        int[][] arr = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9},
//        };
        //input
        int[][] arr = new int[3][3];
        System.out.println(arr.length);// no of arrays
        for (int row = 0; row <arr.length ; row++) {
            // for each col in every row
            for (int col = 0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
            System.out.println();
        }
        for (int row = 0; row <arr.length ; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
// enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
