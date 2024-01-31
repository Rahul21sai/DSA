package com.functions;

import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        int [] arr = {1,3,5,35,34,3};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99;//if u make change to the object via the ref variable it will change
    }
}
