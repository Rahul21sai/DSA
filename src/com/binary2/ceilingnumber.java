package com.binary2;
// ceiling = smallest element in array greater or = target
// when condition of while loop is violated start = end +1
// return is not -1 but it is start

import java.util.Arrays;

public class ceilingnumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceilingnumber(arr,target);
        System.out.println(ans);

    }
    // return the index of smalled no >= target
    static int ceilingnumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            if (target <= arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                target = mid;
            }
        }
        return arr[start];


    }

}
