package lec4;

import java.util.Scanner;

public class printDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
	}
	
	public static void pdi(int n) {
		if(n == 0) {
			return ;
		}
		
		System.out.println(n);
		pdi(n - 1);
		System.out.println(n);
	}

}
