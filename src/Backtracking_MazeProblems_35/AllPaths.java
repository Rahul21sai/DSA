package Backtracking_MazeProblems_35;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
            boolean[][] board = {
                    {true,true,true},
                    {true,true,true},
                    {true,true,true},
            };
          //  allpaths("",board,0,0);
            int[][] path = new int[board.length][board[0].length];
            allpathsprint("",board,0,0,path,1);

    }
    static void allpaths(String p ,boolean[][] maze, int r , int c){
        if (r ==maze.length -1  && c ==maze[0].length -1){
                System.out.println(p);
                return;
        }
        if (!maze[r][c]){
                return;
        }
        // i am conserdering this block in my path]
        //back tracking
        maze[r][c] = false;
        if (r<maze.length - 1){
                allpaths(p + 'D',maze,r+1,c);
            }
        if (c < maze[0].length -1){
                allpaths(p+'R',maze,r,c+1);
            }
        if (r>0){
            allpaths(p + 'U',maze,r-1,c);
        } if (c>0){
            allpaths(p + 'L',maze,r,c-1);
        }
        // this is line where the function will be over
        // so before the fuction gets removed also remove the changes that are made by that function
         maze[r][c] = true;
    }
    static void allpathsprint(String p ,boolean[][] maze, int r , int c,int[][] path,int step){

        if (r ==maze.length -1  && c ==maze[0].length -1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]){
            return;
        }
        // i am conserdering this block in my path]
        //back tracking
        maze[r][c] = false;
        path[r][c] = step;
        if (r<maze.length - 1){
            allpathsprint(p + 'D',maze,r+1,c,path,step +1);
        }
        if (c < maze[0].length -1){
            allpathsprint(p+'R',maze,r,c+1,path,step +1);
        }
        if (r>0){
            allpathsprint(p + 'U',maze,r-1,c,path,step +1);
        } if (c>0){
            allpathsprint(p + 'L',maze,r,c-1,path,step +1);
        }
        // this is line where the function will be over
        // so before the fuction gets removed also remove the changes that are made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}

