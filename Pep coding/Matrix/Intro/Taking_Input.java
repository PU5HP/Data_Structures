import java.util.Scanner;
  public class input{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc = new Scanner(System.in);
    int nr = sc.nextInt();
    int nc = sc.nextInt();
    int [][] mat = new int [nr][nc];
    for(int r=0;r<nr;r++){
      for(int c=0;c<nc;c++){
        mat[r][c]=sc.nextInt();
      }
    
    }
    for(int r=0;r<nr;r++){
      for(int c=0;c<nc;c++){
        System.out.print(mat[r][c]+" ");
      }
      System.out.println();
    }

    

   }
  }
