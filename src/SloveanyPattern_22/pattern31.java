package SloveanyPattern_22;

public class pattern31 {
    public static void main(String[] args) {
pattern31(4);
    }
    static void pattern31(int n){
        int originalN = n;
        n = 2* n;
        for (int row = 0; row <=n ; row++) {
            for (int col = 0; col <=n ; col++) {
                int ateveryindex = originalN - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(ateveryindex+ " ");

            }
            System.out.println();

        }
    }
}
