package Recursion_dice_throw_34;
//leet code 17
import java.util.ArrayList;

public class Phonepad {
    public static void main(String[] args) {
        pad("","12");
        System.out.println(padRet("","12"));
        System.out.println(padcount("","12"));

    }
    static void pad(String p , String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit *3 ; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch ,up.substring(1));

        }

    }
    static ArrayList<String> padRet(String p , String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';// this will convert '2' into 2
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit *3 ; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch ,up.substring(1)));
        }
        return list;
    }
    static int padcount(String p , String up){
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 4; i < digit *3 ; i++) {
            char ch = (char) ('a' + i);
           count= count+ padcount(p + ch ,up.substring(1));

        }
        return count;

    }




}
