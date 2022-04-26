//while remiving from an array list traverse from behind else index will be changed


import java.io.*;
import java.util.*;

public class Main {
    public static boolean isPrime (int num){

		//wrong 
		if(num==0 ||num==1){
			return true;
		}
		for(int i=2;i*i<=num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int j=al.size()-1;j>=0;j--){
			int val = al.get(j);
			if(isPrime(val)==true){
				al.remove(j);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
