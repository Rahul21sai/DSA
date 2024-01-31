package linearsearch;
//leet code question no 1672

public class Maxwealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts){
        // person = row
        // acount = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start new col, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;

            }
            // now we have sum of accounts of peron
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }

        }
        return ans;
//        int ans = Integer.MIN_VALUE;
//        for (int person = 0; person <accounts.length ; person++) {
//            // when you start new col, take a new sum for that row
//            int sum = 0;
//            for (int account = 0; account <accounts[person].length ; account++) {
//                sum += accounts[person][account];
//
//            }
//            // now we have sum of accounts of peron
//            // check with overall ans
//            if(sum > ans){
//                ans = sum;
//            }
//
//        }
//        return ans;
    }
}
