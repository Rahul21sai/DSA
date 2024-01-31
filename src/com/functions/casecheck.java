package com.functions;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        System.out.println(ch);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }else{
            System.out.println("upper case");
        }

    }
}
