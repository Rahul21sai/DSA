package com.binary2;
//leetcode - 34
public class FirstandLastPositioninsortedArray {
    public static void main(String[] args) {

    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for the first occurence if target first
//        int start = search(nums, target, true);
//        int end = search(nums, target, false);
        ans[0] = search(nums, target, true);
        if (ans[0] != -1){
            ans[1] = search(nums, target, false);
        }


        return ans;


    }

    // this functiom just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        // ascending order
        while (start <= end) {
            // find the middle element
//        int mid = (start+ end)/2 ; // might be possible that (start + end) exits the value of int
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;

    }
}
