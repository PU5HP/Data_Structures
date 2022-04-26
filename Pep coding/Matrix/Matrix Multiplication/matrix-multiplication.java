//use three loops the third loop will be of length c1;
//if r2!=c1 then return invalid multiplication




import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner sc = new Scanner(System.in);
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int [][]a=new int[r1][c1];
    for (int r=0;r<r1;r++){
        for(int c=0;c<c1;c++){
            a[r][c]=sc.nextInt();
        }
    }
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    int [][]b=new int[r2][c2];
    for (int r=0;r<r2;r++){
        for(int c=0;c<c2;c++){
            b[r][c]=sc.nextInt();
        }
    }
    if(c1!=r2){System.out.println("Invalid input");return;}
    
    int [][]res=new int[r1][c2];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            res[i][j]=0;
            for(int k=0;k<c1;k++){
                res[i][j]+=a[i][k]*b[k][j];
            }
        }
    }

    for (int r=0;r<r1;r++){
        for(int c=0;c<c2;c++){
            System.out.print(res[r][c]+" ");
        }
        System.out.println();
    }
    return ;
 }

}
