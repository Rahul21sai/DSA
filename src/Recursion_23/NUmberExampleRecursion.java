package Recursion_23;

public class NUmberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    private static void print(int n) {
        if (n ==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // recursive call
       // if you are calling  a funvtion again and again you cantreat it as a seperate call in the stack
       // this is called tail recursion
//        this is the last function call
        print(n+1);
    }
}
