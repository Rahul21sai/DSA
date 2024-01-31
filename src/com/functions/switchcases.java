package com.functions;

import java.util.Scanner;

public class switchcases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empid = sc.nextInt();
        String department = sc.next();

        switch (empid) {
            case 10:
                System.out.println("rahul");
                break;
            case 20:
                System.out.println("kunal");
                break;
            case 3:
                System.out.println("emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("no department");
                }
                break;
            default:
                System.out.println("wrong id");
                break;
        }
    }
}
