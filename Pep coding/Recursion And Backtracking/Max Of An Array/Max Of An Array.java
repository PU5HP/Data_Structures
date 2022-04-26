import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //System.out.println(Integer.MIN_VALUE);
        int max = maxOfArray(arr,0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length){
            return Integer.MIN_VALUE;
        }
        int rres = maxOfArray(arr,idx+1);
        if(rres>=arr[idx]){
            return rres;
        }
        else{
            return arr[idx];
        }
    }
}
