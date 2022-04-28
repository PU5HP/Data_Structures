//import java.io.*;
import java.util.*;

public class Powerlogarithmic {

    public static void main(String[] args) throws Exception {
        // write your code here x raised to power n
        //input
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        sc.close();
        int ans = power(x,n);
        System.out.println("the"+x+"raised to power"+n+"is"+ans);
    }

    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        int ans = power(x,n-1)*x;
        return ans;
    }

}