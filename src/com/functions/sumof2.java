package com.functions;
import java.util.Scanner;

public class sumof2 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//
//        System.out.println("enter the number1");
//        int num1 = in.nextInt();
//        System.out.println("enter the number 2");
//        int num2 = in.nextInt();
//        int sum = num1 +num2;
//        System.out.println("the sum = "+sum);
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
        int anss = sum3(20,30);
        System.out.println(anss);

    }
    static void sum(){
        Scanner in = new Scanner(System.in);


        System.out.println("enter the number1");
        int num1 = in.nextInt();
        System.out.println("enter the number 2");
        int num2 = in.nextInt();
        int sum = num1 +num2;
        System.out.println("the sum = "+sum);

    }
    static int sum2(){
        Scanner in = new Scanner(System.in);


        System.out.println("enter the number1");
        int num1 = in.nextInt();
        System.out.println("enter the number 2");
        int num2 = in.nextInt();
        int sum = num1 +num2;
        return sum;
    }
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}
