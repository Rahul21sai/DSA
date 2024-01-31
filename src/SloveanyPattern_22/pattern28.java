package SloveanyPattern_22;

public class pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n){
        for (int row = 0; row <2*n ; row++) {
            int totalcolsinrow = row > n ? 2*n -row : row;
            int noOfspaces = n-totalcolsinrow;
            for (int s = 0; s <noOfspaces ; s++) {
                System.out.print(" ");

            }
            for (int col = 0; col <totalcolsinrow ; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
