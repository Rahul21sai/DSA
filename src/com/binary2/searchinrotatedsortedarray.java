package com.binary2;
//leet code 32
public class searchinrotatedsortedarray {
    public static void main(String[] args) {
          int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    static int search(int[] nums , int target){
        int pivot = findPivot(nums);
        // if you did not find a pivot it means the array is not storted
        if (pivot == -1){
            // jsut do normal binary search
            return binarysearch(nums, target,0,nums.length-1);
        }

//        case1 pivot = target
//        case 2 target > start search space = (s,p-1) cuz all no after pivot are < start
//        case 3 target < start we all know that all elemrnts from S ,pivot are thr going to be bigger than target
//        search space = pivot +1 till end
        if (nums[pivot] == target ){
            return pivot;
        }
        if (target >= nums[0]){
            return binarysearch(nums , target, 0, pivot-1);

        }
        return binarysearch(nums ,target,pivot+1,nums.length-1 );
    }
    static int binarysearch(int[] arr, int target,int start,int end){
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
//    to find the pivot
    //case - 1 when you find the mid > mid +1 element , ie pivot
//    case 2 if mid element <mid - 1 element ie also my ans ->ans = m -1
//    case 3 start >mid element in this all elements will be < start
//    hence we cqn ignore alll the elements we are looking for peak ie largest element e = mid -1
//    case 4 start element < mid element start = mid +1
//      this will not work for duplicate values
    static int findPivot(int[] arr){
        int start =0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start +(end - start)/2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid -1;
            }
            if (arr[mid] <= arr[start]){
                end = end - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
     }
}
