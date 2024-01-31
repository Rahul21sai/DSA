package com.functions;

import java.util.Scanner;

public class fruitclass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits");
//            case "apple" -> System.out.println("a sweet red ");
//            case "orange" -> System.out.println("round fruit");
//            case "grapes" -> System.out.println("small fruit");
//            default -> System.out.println("please enter the valid fruit");
//        }
           int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }



        

    }
}
