package com.binary2;


// amazon interview question
// this question we dont have the length of array so infinite array
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,12,14,16,23,26,35,45,67,68,78,99,101};
        int target = 45;
        System.out.println(ans(arr, target));

    }
    static int ans(int[] arr, int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;
        //condition for the target to lie in the range
        while(target > arr[end]){
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + size of box *2
            end = end + (end - start +1)*2;
            start = temp;
        }
        return InfiniteArray(arr,target,start,end);
    }

    static int InfiniteArray(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;

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

}
