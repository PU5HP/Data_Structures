import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
         ArrayList<String> ans = new ArrayList<String>();
         ans = getMazePaths(0, 0, n-1, m-1);
         System.out.println("The maze paths are as follows:");
         System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
         //reached our destination
        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        if(sr>dr || sc>dc){
            ArrayList<String> empty = new ArrayList<String>();
            return empty;
        }
        //move right
        ArrayList<String>rights=getMazePaths(sr, sc+1, dr, dc);
        //move down 
        ArrayList<String>downs=getMazePaths(sr+1, sc, dr, dc);

        ArrayList<String>result=new ArrayList<String>();
        
        for(String path:rights){
            result.add('h'+path);
        }
        for(String path:downs){
            result.add('v'+path);
        }
        return result;
    }

}
