package com.strings_21;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the characters : ");
        String str = in.next();
        System.out.println(ispalindrome(str));

    }
    static boolean ispalindrome(String str){
        if (str == null || str.length() ==0){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <str.length()/2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if (start != end){
                return false;
            }


        }
        return true;
    }
}
