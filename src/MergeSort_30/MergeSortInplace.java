package MergeSort_30;

import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int[] arr = {8,2,3,5,1,7,9,10,41,11,6};
        Mergesortinplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Mergesortinplace(int[] arr, int s , int e){
        if (e - s ==1){
            return;
        }
        int mid = (s + e)/2;
        
        Mergesortinplace(arr,s,mid);
        Mergesortinplace(arr,mid,e);
        
        mergeInplace(arr,s,mid,e);
    }

    private static void mergeInplace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e -s];
        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j <e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l <mix.length ; l++) {
            arr[s + l ] = mix[l];
        }

    }
}
