package com.functions;

import java.util.Scanner;

public class stringexample {
    static String greet(){
        String greeting = "how are you";
        return greeting;
    }
    static String myGreet(String name) {
        String message = "Hello" +  name ;
        return message;
    }


    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name :");
        String nam = in.next();
        
        String personal = myGreet(nam);
        System.out.println(personal);

    }


}
