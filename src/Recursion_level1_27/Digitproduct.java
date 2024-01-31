package Recursion_level1_27;

public class Digitproduct {
    public static void main(String[] args) {
        System.out.println(prduct(1342));
    }
    static int prduct(int n){
        if (n % 10 ==n){
            return n;
        }
        return n%10 * prduct(n/10);
    }
}
