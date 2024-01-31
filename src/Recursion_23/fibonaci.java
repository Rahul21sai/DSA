package Recursion_23;

public class fibonaci {
    public static void main(String[] args) {
        //System.out.println(fibo(50));
        System.out.println(fiboFormula(10000));
    }
    static long fiboFormula(int n){
        return (long)(Math.pow(((1 + Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
    static int fibo(int n){
        // base condition
        if (n < 2){
            return n ;
        }
        return fibo(n-1) + fibo( n-2);
    }
}
