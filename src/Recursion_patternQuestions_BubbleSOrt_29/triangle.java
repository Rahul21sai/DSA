package Recursion_patternQuestions_BubbleSOrt_29;

public class triangle {
    public static void main(String[] args) {
        triangle(4,0);
        triangle2(4,0 );

    } // reverse triangle
    static void triangle(int row , int coloumn){
        if (row == 0){
            return;
        }
        if (coloumn < row){
            System.out.print("*");
            triangle(row,coloumn +1);
            }
        else{
            System.out.println();
            triangle(row-1,0);
        }
    }
    // normal triangle
    static void triangle2(int row , int coloumn){
        if (row == 0){
            return;
        }
        if (coloumn < row){

            triangle2(row,coloumn +1);
            System.out.print("*");
        }
        else{

            triangle2(row-1,0);
            System.out.println();
        }
    }
}
