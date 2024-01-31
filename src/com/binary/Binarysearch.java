package com.binary;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {-32,-3,-1,0,2,4,5,6,22,45,56,88};
        int target = 22;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
    // return the index
    // return -1 if does not exists
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
       // ascending order
        while (start <= end) {
            // find the middle element
//        int mid = (start+ end)/2 ; // might be possible that (start + end) exits the value of int
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }

        }
        return -1;
    }
    //descem\nding order
    static int binarySearch1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // ascending order
        while (start <= end) {
            // find the middle element
//        int mid = (start+ end)/2 ; // might be possible that (start + end) exits the value of int
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }

        }
        return -1;
    }


}
