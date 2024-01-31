package com.binary2;

import java.util.Scanner;

// floor = greatest number small or = target
// when condition of while loop is violated start = end +1
// same thing as before first return end instead of -1 if not found
public class floornumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println("enter the target : ");
        int target = in.nextInt();
        int ans = flooringsearch(arr, target);
        System.out.println(ans);

    }
    // greastest no >=to the target
    static int flooringsearch(int[] arr ,int target){

        // but what if the target is greater than the greatest number in the array
        if (target > arr.length - 1){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if ( target > arr[mid]){
                start = mid + 1;
            }else {
                target = arr[mid];
            }
        }
        return arr[end];
    }
}
