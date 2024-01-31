package linearsearch;
//leet code 1295
public class evendigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findnumbers(nums));

    }
    static int findnumbers(int[] nums){
        int count = 0;
        for (int num: nums) {
            if(even(num)){
                count++;
            }

        }
        return count;
    }
    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int numofdigits = digits(num);
        if (numofdigits % 2 == 0){
            return true;
        }
        return false;

    }

    static int digits(int num) {
        if (num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;

        while (num >0){
            num = num/10;
            count++;
        }
        return count;
    }

}
