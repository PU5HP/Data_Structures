import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //number of disks
        int n1 = sc.nextInt(); //id of source tower
        int n2 = sc.nextInt(); //id of destination tower
        int n3 = sc.nextInt(); //id of helper tower
        toh(n,n1,n2,n3);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0){return;}
      //shift (n-1)disks from source to helper using destination
        toh(n-1,t1id,t3id,t2id);
        System.out.println(n +"[" +t1id +" -> "+t2id+"]");
      //shift n-1 disks from helper to destination using source
        toh(n-1,t3id,t2id,t1id);
        
    }

}
