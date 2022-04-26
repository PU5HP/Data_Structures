import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        
        //input
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rows=n;
        int cols=n;
        int [][]mat=new int[n][n];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        //logic
        int min_r=  2000000000;
        int max_c= -2000000000;
        int roow=-1;
        //max in column
        for(int c=0;c<cols;c++){
            for(int r=0;r<rows;r++){
                if(mat[r][c]>max_c)
                {
                    max_c=mat[r][c];
                    //min in same row
                    roow=r;
                }

            }
            for(int i=0;i<cols;i++)
                    {
                        if(mat[roow][i]<min_r)
                        {
                            min_r=mat[roow][i];
                        }
                    }
                    if(min_r==max_c)
                    {
                        System.out.println(max_c);
                        return ;
                    }
                
        }
        System.out.println("Invalid input"); return;

    }

}
