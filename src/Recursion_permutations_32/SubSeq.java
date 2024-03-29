package Recursion_permutations_32;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subseq("","abcde");
        System.out.println(subseq1("","abcde"));

    }
    static void subseq(String p ,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseq(p +ch ,up.substring(1));
        subseq(p ,up.substring(1));

    }
    // taking arraylist in function to get the list
    static ArrayList<String> subseq1(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq1(p+ch,up.substring(1));
        ArrayList<String> right = subseq1(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
