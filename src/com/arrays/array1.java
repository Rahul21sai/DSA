package com.arrays;

public class array1 {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers
        int[] rollnos = new int[5];// new is used to create an object
        // or directly
        int[] rollnos2 = {23,34,54,25,45};

        int[] ros; //decleration of array ros is getting defined in the stack
        ros = new int[5]; //initialisation actually here the object is being created in the heap memory

        String[] arr = new String[4];
        System.out.println(arr[0]);
        //example in python there are no primitives everything is an object so here in java

        //note this primitives are stored in the stack memory only but all the other objects that like string type array type

        //your own type all these other things you know hash map or whatever that will be making all these objects all the classes

        //that we'll be making they are stored in the heap memory okay we'll do an example of that as well
    }
}
