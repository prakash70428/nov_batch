package lec4;

import java.util.Scanner;

public class printdecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pd(n);
	}
	
	public static void pd(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		pd(n - 1);
	}

}
