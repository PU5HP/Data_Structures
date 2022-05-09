import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "" ,new boolean [n][m]);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf ,boolean visited[][]) {
         //valid test case
         if(sr == maze.length-1 && sc == maze[0].length-1){
             System.out.println(asf);
             return;
         }
         //invalid test case
         if (sr<0 || sc<0 || sc>=maze[0].length || sr>=maze.length || visited[sr][sc]==true|| maze[sr][sc]==1) {
             return;
         } 
         //mark true
         visited[sr][sc]=true;
         //top
         floodfill(maze,sr-1,sc,asf+"t",visited);
         //left
         floodfill(maze,sr,sc-1,asf+"l",visited);
         //down
         floodfill(maze,sr+1,sc,asf+"d",visited);
         //right
         floodfill(maze,sr,sc+1,asf+"r",visited);
         //mark false
         visited[sr][sc]=false;    
    }
}