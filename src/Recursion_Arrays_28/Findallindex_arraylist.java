package Recursion_Arrays_28;

import java.util.ArrayList;

public class Findallindex_arraylist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,7,2,1,5,5,9};
        System.out.println(findallindex(arr,5,0,new ArrayList<>()));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findallindex(arr,5,0,list));
        System.out.println(findallindex2(arr,5,0));

    }
    // arraylist  is  in the argument
    static ArrayList<Integer> findallindex(int[]arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findallindex(arr,target,index+1,list);
    }
    // array list is in the body
    static ArrayList<Integer> findallindex2(int[]arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        // this will contain answer for that function call only
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls=  findallindex2(arr,target,index+1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
}
