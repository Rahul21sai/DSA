package com.binary2;
//leet code 1095
public class FindinMountainArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,4,6,7,8,5,3,1};
//        int target = 5;
//        int ans = search(arr,target);
//        System.out.println(ans);



    }
    public int search(int[]arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarysearch(arr,target,0,peak);
        if (firstTry != -1){
            return firstTry;
        }
        // try search in second half
        return orderAgnosticBinarysearch(arr,target,peak+1,arr.length-1);


    }
   public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid +1;
            }
        }
        return start;
    }
    static int orderAgnosticBinarysearch(int[] arr , int target , int start ,int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <end){
            int mid = start + (end - start)/2;

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
