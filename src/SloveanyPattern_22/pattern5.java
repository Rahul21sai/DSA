package SloveanyPattern_22;

public class pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for (int row = 1; row <=2*n ; row++) {
            int totalColsInRow = row >n ? 2 * n - row :row;
            for (int i = 0; i < totalColsInRow; i++) {
                System.out.print("* ");


            }
            System.out.println();
        }
    }
}
