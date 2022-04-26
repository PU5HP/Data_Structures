The State Of Wakanda - 1
  https://nados.io/question/the-state-of-wakanda-1
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int [][]a = new int [r1][c1] ;
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            a[i][j]=sc.nextInt();
        }
    }

    for(int col =0;col<c1;col++){
        if(col%2==0){
            for(int t=0;t<r1;t++){
                System.out.println(a[t][col]);
            }
        }
        else{
            for(int t=r1-1;t>=0;t--){
                System.out.println(a[t][col]);
            }
        }
    }
    return;
    
 }

}
