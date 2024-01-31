package Recursion_Arrays_28;


import java.util.ArrayList;

public class Findallindex {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,4,6,4,9};
        findallIndex(arr,4,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findallIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findallIndex(arr,target,index + 1);
    }
}
