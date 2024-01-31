package com.binary2;
//leet code 744
public class smallestlettergreaterthantarget {
    public static void main(String[] args) {

    }
    static char smallestlettergreaterthantarget(char[] arr, int target){

        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1;
            }else {
                start = mid + 1;
            }

        }
        return arr[start % arr.length];
    }
}
