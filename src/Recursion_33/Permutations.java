package Recursion_33;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permuatations("","abc");
        ArrayList<String> ans = permuatationsList("","abcde");
        System.out.println(ans);
        System.out.println(permuatationsCount("","abcdef"));

    }
    static void permuatations(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permuatations(f + ch + s,up.substring(1));

        }
    }
    static ArrayList<String> permuatationsList(String p , String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        //local to this call
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <=p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permuatationsList(f + ch + s,up.substring(1)));

        }
        return ans;
    }
    static int permuatationsCount(String p , String up){
        if (up.isEmpty()){

            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permuatationsCount(f + ch + s,up.substring(1));

        }
        return count;
    }
}
