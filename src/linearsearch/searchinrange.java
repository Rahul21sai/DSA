package linearsearch;

public class searchinrange {
    public static void main(String[] args) {
        int[] arr = {18,3,4,45,35,3543,54,45,33};
        int target = 3543;
        System.out.println(Linearsearch(arr,target,2,6 ));

    }
    static int Linearsearch(int[]arr, int target,int start, int end){
        if (arr.length == 0){//length is variable
            return -1;
        }
        for (int index = start; index <= end ; index++) {
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
}

