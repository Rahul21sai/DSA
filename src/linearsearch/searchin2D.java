package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class searchin2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8},
                {9},
        };
        int[][] arr1 = {{11, 21, 31},
                {42, 25},
                {61, 72, 28},
                {29},
        };
        System.out.println("enter the target : ");
        int target = in.nextInt();
        int[] ans = search(arr,target); // format of return value {row , col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(max1(arr1));
        System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (target == arr[row][col]){
                    return new int[]{row,col};
                }

            }

        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (max < element) {
                    max = element;
                }

            }

        }
        return max;
    }
    static int max1(int[][] arr) {
        int max1 = Integer.MIN_VALUE;
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (max1 < arr[row][col]){
                    max1 = arr[row][col];
                }

            }

        }
        return max1;
    }

}
