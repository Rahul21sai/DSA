package Recursion_level1_27;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n ){
        if (n == 0){
            return;
        }
        System.out.println(n);
//        fun(n--); // give n first then subtract to infinite loop
        fun(--n);
    }
}
