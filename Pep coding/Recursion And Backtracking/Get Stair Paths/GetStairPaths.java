import java.io.*;
import java.util.*;

public class getStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = getstairpaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getstairpaths(int n) {
        if(n<0){
            ArrayList<String>empty=new ArrayList<String>();
            return empty;
        }
        if(n==0){
            ArrayList<String>base=new ArrayList<String>();
            base.add(" ");
            return base;
        }

        ArrayList<String>one=getstairpaths(n-1);   //1 step taken and rest are expected from this function
        ArrayList<String>two=getstairpaths(n-2);   //2 steps taken and rest are expected from this function
        ArrayList<String>three=getstairpaths(n-3);   //3 steps taken and rest are expected from this function
        ArrayList<String>Paths = new ArrayList<String>();

        for(String path:one){
            Paths.add(1+path);
        }
        for(String path:two){
            Paths.add(2+path);
        }
        for(String path:three){
            Paths.add(3+path);
        }
        return Paths;
    }

}