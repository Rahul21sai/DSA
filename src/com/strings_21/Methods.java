package com.strings_21;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Naga Sai Rahul";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("    rahul    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}