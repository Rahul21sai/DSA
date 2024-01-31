package com.binary;

public class orderAgnosticbs {
    public static void main(String[] args) {
//        int[] arr = {-32,-3,-1,0,2,4,5,6,22,45,56,88};
        int[] arr = {99,88,67,55,45,33,22,21,11,10,9,8};
        int target = 22;
        int ans =  orderagnosticBs(arr , target);
        System.out.println(ans);

    }
    static int orderagnosticBs(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending order or descending
//        boolean isAsc;
//        if (arr[start] < arr[end]){
//            isAsc = true;
//
//        }else {
//            isAsc = false;
//        }
        boolean isAsc = arr[start] < arr[end];



        while (start <= end) {
                // find the middle element
//        int mid = (start+ end)/2 ; // might be possible that (start + end) exits the value of int
                int mid = start + (end - start) / 2;

                if (arr[mid] == target){
                    return mid;
                }

                if (isAsc){
                    if (target < arr[mid]) {
                        end = mid - 1;
                    }else {
                        start = mid + 1;

                    }
                }else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        return -1;
    }
}
