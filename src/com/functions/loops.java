package com.functions;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int j = in.nextInt();

        for(int i = 0; i<=j; i++){
            System.out.println(i);

            /*
            while(condition){
            //body
            }
             */
            int num = 1;
            while (num <=j){
                System.out.println(num);
                num+= 1;
            }
            

        }
    }
}
