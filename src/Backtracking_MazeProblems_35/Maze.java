package Backtracking_MazeProblems_35;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("",3,3);
        System.out.println(pathret("",5,5));
        System.out.println(pathDiagonalret("",5,5));

    }
    static int count(int r , int c){
        if (r == 1 || c ==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;
    }
    static void path(String p , int r , int c){
        if (r ==1  && c ==1){
            System.out.println(p);
            return;
        }
        if (r > 1){
            path(p + 'D',r-1,c);
        }
        if (c > 1){
            path(p+'R',r,c-1);
        }
    }
    static ArrayList<String> pathret(String p , int r , int c){
        if (r ==1  && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();


        if (r > 1){
            list.addAll(pathret(p + 'D',r-1,c));
        }
        if (c > 1){
            list.addAll(pathret(p+'R',r,c-1));
        }
        return list;
    }
    static ArrayList<String> pathDiagonalret(String p , int r , int c){
        if (r ==1  && c ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1  && c > 1){
            list.addAll(pathDiagonalret(p+'D',r-1,c-1));
        }


        if (r > 1){
            list.addAll(pathDiagonalret(p + 'V',r-1,c));
        }
        if (c > 1){
            list.addAll(pathDiagonalret(p+'H',r,c-1));
        }
        return list;
    }
}
