package com.arrays;

public class max {
    public static void main(String[] args) {
        int[] arr ={1,2,4,3,53,533,2231};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
    }
    static int max(int[] arr){
        int maxval = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > maxval){
                maxval = arr[i];
            }

        }
        return maxval;

    }
    static int maxRange(int[] arr, int start,int end){
        if (end > start){
            return -1;
        }
        if (arr == null){
            return -1;
        }
        int maxval = arr[start];
        for (int i = start; i < end ; i++) {
            if (arr[i] > maxval){
                maxval = arr[i];
            }

        }
        return maxval;

    }
}
