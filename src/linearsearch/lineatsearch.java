package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class lineatsearch {
    public static void main(String[] args) {
        int[] nums = {23,35,554,345,23,45,23,762,3,442,34};
        Scanner in = new Scanner(System.in);
        System.out.println("enter the target : ");
        int target = in.nextInt();
        int ans = Linearsearch(nums,target);
        int ans1 = Linearsearch2(nums,target);
        boolean ans2 = Linearsearch3(nums,target);
//        System.out.println("index no:"+ans + " value is "+ ans1 + " " + ans2);
        System.out.println("you search value is :" + ans2
                +"the value is:"+ans1+"is at index:"+ans);
    }
    // search in the search : return thr index if item found
    // othrerwise if item not found return -1
    static int Linearsearch(int[]arr, int target){
        if (arr.length == 0){//length is variable
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {
            // chexk for the element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // this line will execute if none of the return statements works
        // hence the target not found
        return -1;
    }
    static int Linearsearch4(int[]arr, int target){
        if (arr.length == 0){//length is variable
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {
            // chexk for the element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // this line will execute if none of the return statements works
        // hence the target not found
        return Integer.MAX_VALUE;
    }
    // return the element
    static int Linearsearch2(int[]arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int element : arr) {
            // chexk for the element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements works
        // hence the target not found
        return -1;
    }
    static boolean Linearsearch3(int[]arr, int target){
        if (arr.length == 0){
            return false;
        }
        for (int element : arr) {
            // chexk for the element at every index if it is = target
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements works
        // hence the target not found
        return false;
    }
}
