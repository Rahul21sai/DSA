package com.binary2;
//leetcode - 852,162
public class PeakindexinaMountainArray {
    public static void main(String[] args) {


    }public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                //you are in dec part of array
                // this may be the ans but look at left
                // this is why end != mid -1
                end = mid;
            }else {
                // you are in asc part of arrqy
                start = mid +1; // because we konw that mid +1 element > mid element
            }
        }
        // in the end,start == end and pointing to rh largest number because of the 2 checks
        // start and end are always trying to find max element in the above 2 checks
        //hence when they are pointing to just one element that is the max one because that is what the checks say
        // at every pooint of start end they have best possible ans at tthe time
        // and if we are saying that only one item is remaining hence cuz of the above libe thati s the best possible ans


        return start;
    }
}
