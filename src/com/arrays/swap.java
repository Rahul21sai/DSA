package com.arrays;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,6};
//        swap(arr, 0 , 4);
//        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    // two pointer method
    static void reverse(int[]arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}