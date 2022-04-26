import java.io.*;
import java.util.*;

public class Main {
    
	public static String toggleCase(String str)
	{        StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int integer = (int)ch;

            if(integer>=(int)('a') && integer<=(int)('z')){
               integer=integer-32;
			}
			else{
               integer=integer+32;
			}

			char c=(char)integer;  
			sb.append(c);
			//System.out.print(c);
			
		}
        String ans = sb.toString();
		return ans;

	};
	
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
