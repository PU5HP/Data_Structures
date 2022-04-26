import java.util.Scanner;

public class Main {
     public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void swap(int [][] arr,int r,int c){
                int temp =arr[r][c] ;
                arr[r][c]=arr[c][r];
                arr[c][r]=temp;
    }
    public static void reverse(int [][] arr,int r){
        int lo = 0;int hi=arr.length-1;

        while(lo<hi){
            int temp=arr[r][lo];
            arr[r][lo]=arr[r][hi];
            arr[r][hi]=temp;
            lo++;
            hi--;
        }

    }
    public static void main(String[] args) throws Exception {
        // write your code here
        //input 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int [n][n];
        int rows=n;int cols=n;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
         //swap 
         for(int r=0;r<rows-1;r++){
             for(int c=r+1;c<cols;c++){
                 swap(arr,r,c);
             }
         }
         //reverse c==0 to c==cols-1
         for(int i=0;i<rows;i++){
             reverse(arr,i);
         }

         display(arr);

         return;
    }
    
   
   
}
