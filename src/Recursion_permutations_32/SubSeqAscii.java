package Recursion_permutations_32;

import java.util.ArrayList;

public class SubSeqAscii {
    public static void main(String[] args) {
        subseqascii("","abcd");
        System.out.println(subseqAsciilist("","abcd"));

    }
    static void subseqascii(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqascii(p+ch,up.substring(1));
        subseqascii(p,up.substring(1));
        subseqascii(p+(ch+0),up.substring(1));
    }
    // Arraylist
    static ArrayList<String> subseqAsciilist(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciilist(p+ch,up.substring(1));
        ArrayList<String> second = subseqAsciilist(p,up.substring(1));
        ArrayList<String> third = subseqAsciilist(p + (ch + 0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
