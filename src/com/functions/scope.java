package com.functions;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
          // int a = 79; // already intialised outside the block int same func so u cant intialise again
            int c = 99;
            a = 100;//re assign the original ref variable to some other value
            System.out.println(a);
            // values intialised in this block will remain in block

        }
        //System.out.println(c); // cannot use outside the block
    }
}
