package lec6;

import java.util.*;

public class printStairPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		PrintStairsPaths(n , "");
	}
	
	public static void PrintStairsPaths(int n , String asf) {
		if(n == 0) {
			System.out.println(asf);
			return;
		}
		if(n < 0) {
			return;
		}
		
		PrintStairsPaths(n - 1 , asf + "1");
		PrintStairsPaths(n - 2 , asf + "2");
		PrintStairsPaths(n - 3 , asf + "3");
	}

}
