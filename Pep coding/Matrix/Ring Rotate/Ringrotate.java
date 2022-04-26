import java.io.*;
import java.util.*;

public class Main {
   
   public static int[][] fillmatrix (ArrayList<Integer>a,int[][] mat ,int rmin,int rmax,int cmin,int cmax){
 
        int i=0;
        if(rmin==rmax){
           for(int c=cmin;c<=cmax;c++){
               mat[rmin][c] = a.get(i);
               i++;
           }
        }
        else{
        //left trverse
        for(int r=rmin;r<=rmax;r++){
            mat[r][cmin] = a.get(i);i++;
        }   
        //bottem
        for(int c=cmin+1;c<=cmax;c++){
            mat[rmax][c] =a.get(i);i++;
        }
        //right
        for(int r=rmax-1;r>=rmin;r--){
            mat[r][cmax] = a.get(i);i++;
        }
        //top
        for(int c=cmax-1;c>=cmin+1;c--){
            mat[rmin][c]=a.get(i);i++;
        }
        }

        return mat;
    }




    //
    //
    //

   public static ArrayList<Integer> rotate(ArrayList<Integer> a , int k){
    // write your code here
    k=k%a.size();
    if(k<0){
      k=k+a.size();
    }
    reversex(a,a.size()-k,a.size()-1);
    reversex(a,0,a.size()-k-1);
    reversex(a,0,a.size()-1);

    return a;

  }
   public static void reversex(ArrayList<Integer> list,int lo,int hi){
       //System.out.println("reverse functions");
        while(lo<hi){
            int temp1=list.get(lo);
            int temp2=list.get(hi);
            list.set(hi, temp1);
            list.set(lo ,temp2);
            lo++;
            hi--;
        }
        //System.out.println(list);
   }




    
    public static ArrayList<Integer> fill1D (int[][] mat ,int rmin,int rmax,int cmin,int cmax){
        ArrayList<Integer> list = new ArrayList<Integer>();    
        
        if(rmin==rmax){
           for(int c=cmin;c<=cmax;c++){
               list.add(mat[rmin][c]);
           }
        }
        else{
        //left trverse
        for(int r=rmin;r<=rmax;r++){
            list.add(mat[r][cmin]);
        }   
        //bottem
        for(int c=cmin+1;c<=cmax;c++){
            list.add(mat[rmax][c]);
        }
        //right
        for(int r=rmax-1;r>=rmin;r--){
            list.add(mat[r][cmax]);
        }
        //top
        for(int c=cmax-1;c>=cmin+1;c--){
            list.add(mat[rmin][c]);
        }
        }

        return list;
    }



    public static void main(String[] args) throws Exception {
        //Input
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] mat = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int s=sc.nextInt();
        int r=sc.nextInt();

        int row_min=0,col_min=0,col_max=m-1,row_max=n-1;

        for(int i=1;i<s;i++){
            row_min++;col_min++;
            row_max--;col_max--;
        }
        
        ArrayList<Integer> x = new ArrayList<Integer>();
        x=fill1D(mat,row_min,row_max,col_min,col_max);
        //System.out.println(x);
        ArrayList<Integer> xx = new ArrayList<Integer>();
        xx=rotate(x,r);
        //System.out.println(xx);
        int [][] anss = new int [n][m];
        anss=fillmatrix(xx,mat,row_min,row_max,col_min,col_max);
        display(anss);

       // display(mat);

    }
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
