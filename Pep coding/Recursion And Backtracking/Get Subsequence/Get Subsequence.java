import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       ArrayList<String> ans = gss(s);
       System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        String ros = str.substring(1);
        char ch = str.charAt(0);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> mylist = new ArrayList<String>();

        for(String it :rres){
            mylist.add(it);
        }
        for(String it :rres){
            mylist.add(ch+it);
        }
        return mylist;
    }

}
