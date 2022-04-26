import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
		
        StringBuilder sc = new StringBuilder();
		sc.append(str.charAt(0));
		for(int i=1;i<str.length();i++){
			char ch1=str.charAt(i);
			char ch2=sc.charAt(sc.length()-1);
			sc.append(ch1-ch2);
			sc.append(ch1);
		}
		String ans="";
		ans=sc.toString();
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
